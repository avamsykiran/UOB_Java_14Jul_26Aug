package com.cts.dtud.ui;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App02DateTimeDemo {

	public static void main(String[] args) {
		
		DateTimeFormatter myDtFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate today = LocalDate.now();
		System.out.println(today.format(myDtFormat));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Date Of Birth(\"dd-MM-yyyy\"): ");
		String dobStr = scan.next();
		LocalDate dob = LocalDate.parse(dobStr, myDtFormat);
		
		Period age = Period.between(dob, today);
		System.out.println("You are "+age.getYears()+"yrs and "+age.getMonths()+"months older");
		
		System.out.println("By what age will you retire(inyrs)? ");
		int retirementAge = scan.nextInt();
		
		LocalDate retirmentDate = dob.plusYears(retirementAge);
		System.out.println(retirmentDate.format(myDtFormat));
		
	}

}
