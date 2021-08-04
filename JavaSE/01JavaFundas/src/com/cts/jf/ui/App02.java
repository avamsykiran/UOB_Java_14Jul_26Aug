package com.cts.jf.ui;

import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("A number between 1 and 7? ");
		int n = scan.nextInt();

		/*
		 * if(n==1) { System.out.println("SUNDAY"); }else if(n==2) {
		 * System.out.println("MONDAY"); }else if(n==3) { System.out.println("TUESDAY");
		 * }else if(n==4) { System.out.println("WEDNESDAY"); }else if(n==5) {
		 * System.out.println("THURSDAY"); }else if(n==6) {
		 * System.out.println("FRIDAY"); }else if(n==7) {
		 * System.out.println("SATURDAY"); }else { System.out.println("Invalid Input");
		 * }
		 */

		switch (n) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
