package com.with_threading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class FileWrite extends Thread {
	int fileNumber;

	public FileWrite(int i) {
		this.fileNumber = i;
	}

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		FileWrite fw1 = new FileWrite(1);
		FileWrite fw2 = new FileWrite(2);
		FileWrite fw3 = new FileWrite(3);

		fw1.start();
		fw2.start();
		fw3.start();

		/* To make sure that the timer stops only after all files are created */
		fw1.join();
		fw2.join();
		fw3.join();

		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: " + (endTime - startTime) / 1000 + "s");

	}

	public void run() {

		try {
			Thread.sleep(2000);
			File file = new File("thread file " + fileNumber + ".txt");
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
	        out.write("Created on: "+new Date().toString());
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
