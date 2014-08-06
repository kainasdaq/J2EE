package edu.neu.dengkai.model;

import java.util.*;

public class BookFinder {
	public List<String> getBooks(String genre){
		List<String> books = new ArrayList<String>();
		if (genre.equals("textbook")) {
			books.add("OReilly Head First Servlets and JSP");
			books.add("SCJP EXAM");
		} else if (genre.equals("fiction")) {
			books.add("Harry Potter");
			books.add("The Lord of the Rings");
		} else {
			books.add("No book was found");
		}
		
		return books;
	}
}
