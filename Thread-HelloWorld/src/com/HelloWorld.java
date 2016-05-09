package com;

public class HelloWorld {

	public static void main(String[] args) {
		Runnable threadJob = new MyRunnable();
		Thread t=new Thread(threadJob);
		t.start();
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("HelloWorld!");
	}
}