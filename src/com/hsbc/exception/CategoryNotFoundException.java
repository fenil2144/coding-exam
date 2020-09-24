package com.hsbc.exception;

public class CategoryNotFoundException extends Exception{
	
	//This exception will be thrown when user enters the category that is not present.
	public CategoryNotFoundException() {
		super("Category doesn't exist.");
	}
	public CategoryNotFoundException(String m) {
		super(m);
	}
}
