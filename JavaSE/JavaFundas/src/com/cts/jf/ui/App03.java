package com.cts.jf.ui;

import java.util.Scanner;

public class App03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("A single character please? ");
		String ch = scan.next();

		switch (ch) {
		case "a":
		case "A":
		case "e":
		case "E":
		case "i":
		case "I":
		case "o":
		case "O":
		case "u":
		case "U":
			System.out.println("Its an vowel");
			break;
		default:
			System.out.println("Its not an vowel");
		}
	}

}
