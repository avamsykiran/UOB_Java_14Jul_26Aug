package com.cts.iodemo.ui;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App02ReadingFromATextFile {

	public static void main(String[] args) {

		Scanner kbin = new Scanner(System.in);
		System.out.print("File Name: ");
		String fileName = kbin.next();
		
		File file = new File(fileName);
		
		if(!file.exists())
			System.out.println("The file is not found");
		else if(file.isDirectory()) {
			File[] subFiles = file.listFiles();
			Arrays.stream(subFiles).
					map(f -> String.format("Name:%s\tReadable:%s\tWritable:%s\tExecutable:%s", 
							f.getName(),f.canRead(),f.canWrite(),f.canExecute())).
					forEach(System.out::println);
		}else {
			
			try(FileReader freader = new FileReader(file)){
				char[] data=new char[1024];
				StringBuffer strBuf = new StringBuffer();
				
				while(freader.read(data)>-1)
					strBuf.append(data);
				
				System.out.print(strBuf);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
