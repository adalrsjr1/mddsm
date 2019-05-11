package br.inf.ufg.mddsm.broker.resource;

import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.inf.ufg.mddsm.broker.manager.SignalInstance;

public class ThreadedQueue implements Runnable {
	private final Logger log = LoggerFactory.getLogger(ThreadedQueue.class);

	private ExecutorService thread = Executors.newSingleThreadExecutor();
	private Effector effector;
	private Queue<SignalInstance> queue;

	final static Semaphore s = new Semaphore(1);

	private volatile boolean run = true;

	public ThreadedQueue(Queue<SignalInstance> queue) {
		log.trace("new ThreadedQueue(queue:{})", queue);
		this.queue = queue;
	}

	public void enqueue(SignalInstance signal) {
		log.trace("enqueue(signal:{})", signal);
		queue.offer(signal);
		wake();
	}

	public void start(Effector effector) {
		log.trace("start(effector:{}", effector);
		this.effector = effector;
		thread.execute(this);
		//        new Thread(this).start();
	}

	public void stop() {
		log.trace("stop()");
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
		log.trace("run()");
		while (run) {
			while (!queue.isEmpty()) {
				process(queue.poll());
			}
			log.trace("Threaded Queue is Empty!!!");
			doWait();
		}
	}

	private void doWait() {
		log.trace("doWait()");
		try {
			synchronized (this) {
				this.wait();
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void process(SignalInstance signal) {
		log.trace("process(signal:{})", signal);
		long t1 = System.nanoTime();
		effector.execute(signal);
		long t2 = System.nanoTime();
		System.out.println("P:("+signal.getName()+")"+TimeUnit.MILLISECONDS.convert(t2-t1, TimeUnit.NANOSECONDS)+"ms");
	}

	public void wake() {
		log.trace("wake()");
		synchronized (this) {
			this.notify();
		}
	}
}