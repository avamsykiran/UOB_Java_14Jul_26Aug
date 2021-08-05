package com.cts.dtud.ui;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cts.dtud.service.Swapper;

public class App04GenericsDemo {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(1947, Month.AUGUST, 15);
		LocalDate d2 = LocalDate.of(1985,Month.JUNE,11);
		
		Swapper<LocalDate> swapLocalDates = new Swapper<>();
		swapLocalDates.doSwap(d1, d2);

		Swapper<String> swapStr = new Swapper<>();
		swapStr.doSwap("Hello","Hai");
		
		Swapper<Integer> swapInts = new Swapper<>();
		swapInts.doSwap(45, 67);
		
		Swapper<Character> swapChars = new Swapper<>();
		swapChars.doSwap('%', '@');
		
	}

}
