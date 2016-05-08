package com;

public class HelloWorld extends Thread {
	public static void main (String [] args){
		world();
		hello();
	}

	private static void hello() {
		HelloWorld hello=new HelloWorld() {
			public void run () {
				System.out.println("hello");
			}
		};
		hello.start();
	}

	private static void world() {
		HelloWorld world=new HelloWorld() {
			public void run () {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("world");
			}
		};
		world.start();
	}
}
