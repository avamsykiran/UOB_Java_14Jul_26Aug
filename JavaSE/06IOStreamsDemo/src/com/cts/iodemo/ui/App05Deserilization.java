package com.cts.iodemo.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.cts.iodemo.model.Book;

public class App05Deserilization {

	public static void main(String[] args) {
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("books.data"))){
			List<Book> books = (List<Book>) in.readObject();
			books.stream().forEach(System.out::println);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} 
	}

}
