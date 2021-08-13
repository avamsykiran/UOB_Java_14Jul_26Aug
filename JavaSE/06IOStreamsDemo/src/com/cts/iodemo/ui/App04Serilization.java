package com.cts.iodemo.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import com.cts.iodemo.model.Book;

public class App04Serilization {

	public static void main(String[] args) {
		
		List<Book> books = Arrays.asList(new Book[] {
				new Book(1L, "Let Us C"),
				new Book(2L, "Let Us C++"),
				new Book(3L, "Java Head First"),
				new Book(4L, "Java Compelte Reference"),
				new Book(5L, "All about Webs"),
				new Book(6L, "HTML 5 an insight"),
				new Book(7L, "To Start With Python"),
				new Book(8L, "All about Spring"),
				new Book(9L, "Spring Boot Made easy"),
				new Book(10L, "Angualr Made Easy")
		});
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("books.data"))){
			out.writeObject(books); //serialization
			System.out.println("Data Saved!");
		} catch (IOException e) {
			System.out.println("The file could not be accessed");
		} 
	}

}
