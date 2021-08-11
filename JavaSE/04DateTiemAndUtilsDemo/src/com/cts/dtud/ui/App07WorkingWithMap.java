package com.cts.dtud.ui;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App07WorkingWithMap {

	public static void main(String[] args) {

		Map<String,Double>  scores=new TreeMap<>();
		
		scores.put("Java 8", 85.0);
		scores.put("Hibernate", 80.0);
		scores.put("Spirng Core", 87.0);
		scores.put("Spring Web MVC", 90.0);
		scores.put("Spring REST", 90.0);
		scores.put("Spring Test", 70.0);
		
		Set<String> skills = scores.keySet();
		
		for(String skill:skills)
			System.out.println(String.format("you scored %3.2f percent in %s", scores.get(skill),skill));
	}

}
