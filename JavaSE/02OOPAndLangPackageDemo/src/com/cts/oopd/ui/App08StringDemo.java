package com.cts.oopd.ui;

public class App08StringDemo {

	public static void main(String args[]) {
	
		String s ="Madam";
		s = s.toUpperCase();
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.substring(i));
		}
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.substring(0,i+1));
		}
		
		/*String rev = new String();
		for(int i=s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}*/
		
		StringBuilder sb = new StringBuilder(s);
		String rev = new String(sb.reverse());
		
		if(s.equalsIgnoreCase(rev))
			System.out.println("It is a pallendrome");
		else 
			System.out.println("It is not a pallendrome");
		
	
		
		
	}
	
}
