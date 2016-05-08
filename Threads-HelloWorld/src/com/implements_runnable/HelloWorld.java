package com.implements_runnable;

public class HelloWorld {
	public static void main(String[] args) {
		RunnableDemo hello = new RunnableDemo("hello", 0);
		RunnableDemo world = new RunnableDemo("world", 500);

		world.start();
		hello.start();
	}
}

class RunnableDemo implements Runnable {
	String threadName;
	int timeout;
	Thread thread;

	public RunnableDemo(String name, int i) {
		this.threadName = name;
		this.timeout = i;

	}

	public void start() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(timeout);
			System.out.println(threadName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}