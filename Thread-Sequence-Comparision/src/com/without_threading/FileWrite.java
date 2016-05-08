package com.without_threading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class FileWrite {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		createFile(1);
		createFile(2);
		createFile(3);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: "+(endTime-startTime)/1000+"s");

	}

	private static void createFile(int i) throws Exception {
		
		Thread.sleep(2000);
		File file = new File("normal file "+i+".txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write("Created on: "+new Date().toString());
        out.close();


	}
}
