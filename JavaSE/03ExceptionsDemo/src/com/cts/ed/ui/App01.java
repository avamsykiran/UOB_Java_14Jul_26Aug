package com.cts.ed.ui;

import java.util.Scanner;

public class App01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("A number> ");
		while(!scan.hasNextInt()) {
			System.out.println("Expected an integer");
			scan.next(); //skips the currently inputed value
		}
		int x =scan.nextInt();
		
		System.out.print("A divisor> ");
		while(!scan.hasNextInt()) {
			System.out.println("Expected an integer");
			scan.next(); //skips the currently inputed value
		}
		int y = scan.nextInt();
		
		if(y!=0)
			System.out.println("Qut is "+(x/y));
		else
			System.out.println("Zero is not an acceptable divisor");
		
		System.out.println("The app terminated");
	}

}
