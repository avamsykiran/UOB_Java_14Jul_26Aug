package com.cts.oopd.ui;

public class App09StringDemo {

	public static void main(String[] args) {
		String para = "This is a test para beign created 1111 @#@$ to check methods offered by strign class";

		/*
		 * display 
		 * 	no of chars 
		 * 	no of consonant 
		 * 	no of vowel 
		 *  no of special chars 
		 *  no of words 
		 *  no of digits
		 */
		
		System.out.println("No of Chars: "+para.length());
		
		String words[] = para.split(" "); //splitting at space
		System.out.println("No of Words: "+words.length);
		
		int nod=0,noc=0,nov=0,nosc=0;
		
		String digits = "0123456789";
		String vowels = "aeiouAEIOU";
		String consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
		
		for(String w : words) {
			for(char ch:w.toCharArray()) {
				if(vowels.indexOf(ch)>-1) nov++;
				else if(consonants.indexOf(ch)>-1) noc++;
				else if(digits.indexOf(ch)>-1) nod++;
				else nosc++;
			}
		}
		
		System.out.println("No of vowels: "+nov);
		System.out.println("No of consonants: "+noc);
		System.out.println("No of digits: "+nod);
		System.out.println("No of Special chars: "+nosc);
	}

}
