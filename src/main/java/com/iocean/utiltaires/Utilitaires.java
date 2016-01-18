package com.iocean.utiltaires;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Utilitaires {

	public static boolean verifierMail(String email) {
		String regex = "[^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$]";
		return regex.matches(email);
	}
	

	public static String getDateFrancais(LocalDate maDate)
	{
		return maDate.format(DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("fr")));
	}
	
	public static boolean verifierPassword(String password){
		return (password.length() >= 6); 
		
		// à compléter

	}
}
