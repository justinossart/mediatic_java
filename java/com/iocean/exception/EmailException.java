package com.iocean.exception;

public class EmailException extends Exception {
	
	public EmailException(String email){
		super(email + "Adresse email non valdie");
	}
	

}
