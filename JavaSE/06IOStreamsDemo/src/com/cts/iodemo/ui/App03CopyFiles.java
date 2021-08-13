package com.cts.iodemo.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class App03CopyFiles {

	public static void main(String[] args) {

		Scanner kbin = new Scanner(System.in);
		
		System.out.print("Source File Name: ");
		File srcFile = new File(kbin.next());
		if(!srcFile.exists()) {
			System.out.println("Source file not found");
			return;
		}
		
		System.out.print("Target File Name: ");
		File targetFile = new File(kbin.next());
		if(targetFile.exists()) {
			System.out.println("Target file already exits");
			return;
		}
		
		try(
				FileInputStream fin = new FileInputStream(srcFile);
				FileOutputStream fout = new FileOutputStream(targetFile,true)){
			
			long fileSize = fin.available();
			
			byte[] data = new byte[1024];
			
			while(fin.read(data)>-1) {
				fout.write(data);
			}
			
			System.out.println(fileSize + " byte(s) copied");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
