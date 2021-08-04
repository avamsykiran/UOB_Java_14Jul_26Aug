package com.cts.jf.ui;

import java.util.Random;
import java.util.Scanner;

public class App06 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		Random random = new Random();
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = random.nextInt(100);
			System.out.println(nums[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What to search? ");
		int eleToSearch = scan.nextInt();
		
		int foundAt = -1;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==eleToSearch) {
				foundAt=i;
				break;
			}
		}
		
		if(foundAt==-1)
			System.out.println("Element Not found");
		else
			System.out.println("Element is found @ "+foundAt);
	}

}
