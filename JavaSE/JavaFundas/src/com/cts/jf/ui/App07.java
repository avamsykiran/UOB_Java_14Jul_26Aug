package com.cts.jf.ui;

import java.util.Random;
import java.util.Scanner;

public class App07 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
	
		System.out.println("Matrix1: ");
		for(int r=0;r<m1.length;r++) {
			for(int c=0;c<m1[r].length;c++) {
				m1[r][c]=random.nextInt(100);
				System.out.print(m1[r][c]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Matrix2: ");
		for(int r=0;r<m2.length;r++) {
			for(int c=0;c<m2[r].length;c++) {
				m2[r][c]=random.nextInt(100);
				System.out.print(m2[r][c]+"\t");
			}
			System.out.println();
		}
		
		int[][] sum = new int[3][3];
		System.out.println("Sum: ");
		for(int r=0;r<m2.length;r++) {
			for(int c=0;c<m2[r].length;c++) {
				sum[r][c]=m1[r][c]+m2[r][c];
				System.out.print(sum[r][c]+"\t");
			}
			System.out.println();
		}
		
	}

}
