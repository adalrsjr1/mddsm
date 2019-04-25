package br.inf.ufg.mddsm.broker.resource;

import java.lang.Thread.State;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public class ThreadedQueue implements Runnable {
	private ExecutorService thread = Executors.newSingleThreadExecutor();
	private Effector effector;
	private Queue<SignalInstance> queue;

	final static Semaphore s = new Semaphore(1);

	private volatile boolean run = true;

	public ThreadedQueue(Queue<SignalInstance> queue) {
		this.queue = queue;
	}

	public void enqueue(SignalInstance signal) {
		queue.offer(signal);
		wake();
	}

	public void start(Effector effector) {
		this.effector = effector;
		thread.execute(this);
		//        new Thread(this).start();
	}

	public void stop() {
		run = false;
		thread.shutdown();

		try {
			// Wait a while for existing tasks to terminate
			if (!thread.awaitTermination(1, TimeUnit.SECONDS)) {
				thread.shutdownNow(); // Cancel currently executing tasks
				// Wait a while for tasks to respond to being cancelled
				if (!thread.awaitTermination(1, TimeUnit.SECONDS))
					System.err.println("Pool did not terminate");
			}
		} catch (InterruptedException ie) {
			// (Re-)Cancel if current thread also interrupted
			thread.shutdownNow();
			// Preserve interrupt status
			Thread.currentThread().interrupt();
		}
	}

	public void run() {
		while (run) {
			while (!queue.isEmpty()) {
				process(queue.poll());
			}
			doWait();
		}
	}

	private void doWait() {
		try {
			synchronized (this) {
				this.wait();
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void process(SignalInstance signal) {
		long t1 = System.nanoTime();
		effector.execute(signal);
		long t2 = System.nanoTime();
		System.out.println("P:("+signal.getName()+")"+TimeUnit.MILLISECONDS.convert(t2-t1, TimeUnit.NANOSECONDS)+"ms");
	}

	public void wake() {
		synchronized (this) {
			this.notify();
		}
	}
}