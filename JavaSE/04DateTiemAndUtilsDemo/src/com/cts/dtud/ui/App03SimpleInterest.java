package com.cts.dtud.ui;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App03SimpleInterest {

	public static void main(String[] args) {

		DateTimeFormatter myDtFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Scanner scan = new Scanner(System.in);

		System.out.println("How much loan was disbursed? ");
		double p = scan.nextDouble();

		System.out.println("What was the annual rate of interest? ");
		double r = scan.nextDouble();

		System.out.println("When was the loan disbursed (dd-MM-yyyy)? ");
		LocalDate dod = LocalDate.parse(scan.next(), myDtFormat);

		System.out.println("How long was the term in years? ");
		int n = scan.nextInt();

		double si = (p * n * r) / 100.0;
		double amount = si + p;
		LocalDate dop = dod.plusYears(n);

		System.out.println(
		 String.format("Rupees %f to paid including an interest of rupees %f on or before %s",
				 amount,si, dop.format(myDtFormat)));
		
		/*
		 * %d int
		 * %ld long
		 * %f float
		 * %c char
		 * %s string
		 * */
	}

}
