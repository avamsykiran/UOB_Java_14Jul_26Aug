package com.cts.jf.ui;

import java.util.Scanner;

public class App04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean shallGoOn = true;

		while (shallGoOn) {
			System.out.print("A number? ");
			int n = scan.nextInt();

			int factorsCount = 2;
			System.out.println("1 is a factor of " + n);

			for (int i = 2; i <= n / 2; i++) {
				if (n % i != 0) {
					continue;
				}
				System.out.println(i + " is a factor of " + n);
				factorsCount++;
			}

			System.out.println(n + " is a factor of " + n);
			System.out.println("Total Number of Factors: " + factorsCount);

			if (factorsCount == 2)
				System.out.println(n + " is prime");
			else
				System.out.println(n + " is composite");
			
			System.out.println("Once More(true/false)? ");
			shallGoOn = scan.nextBoolean();
		}
	}

}
