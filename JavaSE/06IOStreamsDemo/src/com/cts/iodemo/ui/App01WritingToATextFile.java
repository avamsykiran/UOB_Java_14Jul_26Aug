package com.cts.iodemo.ui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App01WritingToATextFile {

	public static void main(String[] args) {

		Scanner kbin = new Scanner(System.in);
		System.out.print("File Name: ");
		String fileName = kbin.next();
		
		File file = new File(fileName);
		
		if(file.exists() && file.isDirectory())
			System.out.println("The file is a folder!");
		else {
			System.out.println("Enter data into file (enter *** to stop): ");
			
			try(FileWriter fwriter = new FileWriter(file,true)){
				while(true) {
					String line=kbin.nextLine();
					if(line.equals("***")) break;
					fwriter.write(line +"\n");
				}
				System.out.println("File got Saved");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
