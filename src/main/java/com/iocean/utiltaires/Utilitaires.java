package com.iocean.utiltaires;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.iocean.model.Adherent;

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
	
	public static void sortMediasDate(Adherent ad){
		MediasComparatorDate comparator = new MediasComparatorDate();
		ad.getMedias().sort(comparator);
	}
	
	public static void sortMediasTitle(Adherent ad){
		MediasComparatorTitre comparator = new MediasComparatorTitre();
		ad.getMedias().sort(comparator);
	}
	
}
