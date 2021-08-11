package com.cts.lsd.ui;

import java.time.LocalTime;

import com.cts.lsd.service.Consumer;
import com.cts.lsd.service.Function;
import com.cts.lsd.service.Predicate;
import com.cts.lsd.service.Suppliers;

public class App01LambdaExpressionsDemo {

	public static void main(String[] args) {
		
		Consumer<String> strConsumer = s -> System.out.println(s);
		strConsumer.doConsume("Vamsy");
		
		Consumer<String> strConsumer2 = s -> {s=s.toUpperCase(); System.out.println(s); };
		strConsumer2.doConsume("Vamsy");
		
		Suppliers<Integer> currentHour = () -> LocalTime.now().getHour();
		System.out.println(currentHour.dosupply());
		
		Suppliers<String> greet = () -> {
			String greeting="";
			
			int h = LocalTime.now().getHour();
			
			if(h>=3&&h<=11) greeting="Good Morning";
			else if(h>11 && h<=16) greeting="Good Noon";
			else greeting="Good Evening";
			
			return greeting;
		};
		System.out.println(greet.dosupply());
		
		Predicate<Integer> isEven = n -> n%2==0;
		System.out.println(isEven.check(67));
		System.out.println(isEven.check(68));
		
		Function<Integer> sum = (n1,n2)->n1+n2;
		Function<Integer> dif = (n1,n2)->n1-n2;
		Function<Integer> prd = (n1,n2)->n1*n2;
		Function<Integer> max = (n1,n2)->n1>n2?n1:n2;
		Function<Integer> min = (n1,n2)->n1<n2?n1:n2;
		
		System.out.println(sum.compute(34, -134));
		System.out.println(dif.compute(34, -134));
		System.out.println(prd.compute(34, -134));
		System.out.println(max.compute(34, -134));
		System.out.println(min.compute(34, -134));
	}

}
