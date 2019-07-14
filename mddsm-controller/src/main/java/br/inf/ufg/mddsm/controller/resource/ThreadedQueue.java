package br.inf.ufg.mddsm.controller.resource;

import java.util.Observable;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import br.inf.ufg.mddsm.controller.manager.SignalInstance;

public class ThreadedQueue implements Runnable {
    private Effector effector;
    private Queue<SignalInstance> queue;

    final static Semaphore s = new Semaphore(1);
    
    private boolean run = true;

    public ThreadedQueue(Queue<SignalInstance> queue) {
        this.queue = queue;
    }

    public void enqueue(SignalInstance signal) {
        queue.offer(signal);
        wake();
    }

    public void start(Effector effector) {
        this.effector = effector;
        new Thread(this).start();
    }

    public void stop() {
        run = false;
    }

    public void run() {
        while (run) {
            while (!queue.isEmpty()) {
            	//System.out.println(queue);
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
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
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