package com.hsbc.exception;

public class DuplicateItemCodeException extends Exception{

	//This Exception is thrown when an user enters duplicate itemCode.
	public DuplicateItemCodeException() {
		super("Duplicate Item Code Entered!");
	}
	public DuplicateItemCodeException(String m) {
		super(m);
	}
}
