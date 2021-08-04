package com.cts.jf.ui;

import java.util.Scanner;

public class App05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Elements Count? ");
		int size = scan.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		int min = arr[0];
		int max = arr[0];
		int sum = 0;

		for (int n : arr) {
			sum += n;
			if (min > n) {
				min = n;
			}
			if (max < n) {
				max = n;
			}
		}

		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);

		System.out.println("Even Indexed Elements: ");
		for (int i = 0; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}

		System.out.println("Odd Indexed Elements: ");
		for (int i = 1; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}

}
