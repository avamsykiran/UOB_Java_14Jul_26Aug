package com.cts.dtud.ui;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App01DateTiemDemo {

	public static void main(String[] args) {
		LocalTime startTime = LocalTime.now();
		LocalDate today = LocalDate.now();		
		LocalDateTime asOfNow = LocalDateTime.now();
		
		System.out.println(today);
		System.out.println(startTime);
		System.err.println(asOfNow);
		
		ZonedDateTime estAsOfNow = ZonedDateTime.now(ZoneId.of("GMT+8"));
		System.err.println(estAsOfNow);

		LocalDate indianIndpDate= LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println(indianIndpDate);
		
		Period p = Period.between(indianIndpDate, today);
		System.out.println(p.toTotalMonths()/12.0);
		
		LocalTime endTime = LocalTime.now();
		Duration d = Duration.between(startTime,endTime);
		System.out.println(d.toMillis() + " ms");
	}

}
