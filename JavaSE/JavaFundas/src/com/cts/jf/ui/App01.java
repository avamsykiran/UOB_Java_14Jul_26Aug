package com.cts.jf.ui;

import java.util.Scanner;

public class App01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello World");
		
		System.out.print("Your Name? ");
		String name = scan.next();
		
		System.out.print("Your Age? ");
		int age = scan.nextInt();
		
		System.out.println("Hello "+name+"! you are "+age+" years old!");
		
		/*simple if*/
		if(age>=100) {
			System.out.println("You lived for quite a long time!");
		}
		
		/*if..else*/
		if(age>=18) {
			System.out.println("You can vote ");
		}else {
			System.out.println("You can not vote yet");
		}
		
		String ageGroup ="";
		
		if(age<=3) {
			ageGroup="Infant";
		}else if(age<=12) {
			ageGroup="Child";
		}else if(age<=20) {
			ageGroup="Teenager";
		}else if(age<=55) {
			ageGroup="Adult";
		}else {
			ageGroup="Elder";
		}
		
		System.out.println("You are a "+ageGroup);
	}

}
