package com.iocean.test;

import java.time.LocalDate;
import com.iocean.dao.AdherentDAO;
import com.iocean.dao.EmpruntDAO;
import com.iocean.dao.MediaDAO;
import com.iocean.dao.UtilisateurDAO;
import com.iocean.model.Adherent;
import com.iocean.model.Media;
import com.iocean.model.Utilisateur;
import com.iocean.typeEnum.TypeMedia;

public class TestDao {

	public static void main(String[] args) {

		/****************************************************************
		 *  				creation des adherents
		 ****************************************************************/
		
		Adherent adh1 = new Adherent();
		Adherent adh2 = new Adherent();
		Adherent adh3 = new Adherent();
		Adherent adh4 = new Adherent();
		Adherent adh5 = new Adherent();
		Adherent adh6 = new Adherent();
		
		adh1.setNom("La Fontaine");
		adh1.setPrenom("Jerome");
		adh1.setEmail("loulalilou@bibidibabidi.bou");
		adh2.setNom("rougier");
		adh2.setPrenom("clémence");
		adh2.setEmail("clem@bibidibabidi.bou");
		adh3.setNom("michelat");
		adh3.setPrenom("bruno");
		adh3.setEmail("bruno@bibidibabidi.bou");
		adh4.setNom("Monet");
		adh4.setPrenom("Elisa");
		adh4.setEmail("elisa@bibidibabidi.bou");
		adh5.setNom("Salvestrin");
		adh5.setPrenom("Lea");
		adh5.setEmail("lea@bibidibabidi.bou");
		adh6.setNom("Lageau");
		adh6.setPrenom("Laurent");
		adh6.setEmail("lolo@bibidibabidi.bou");
		
		

		/****************************************************************
		 *  				creation des utilsateurs
		 ****************************************************************/
		Utilisateur util1 = new Utilisateur("Potter", "Harry", "harry@poudlard.mm", "leviosa", "ingardium", 2);
		Utilisateur util2 = new Utilisateur("Goldman", "Jean jacques", "janno@poudlard.mm", "jjg", "music", 2);
		Utilisateur util3 = new Utilisateur("Neige", "Blanche", "blanche@poudlard.mm", "BlancheNeige", "7nains", 2);
		Utilisateur util4 = new Utilisateur("Castor", "Père", "PCastor@poudlard.mm", "PereCastor", "histoire", 2);
		
		
		
	
		/****************************************************************
		 *  				creation des medias
		 ****************************************************************/
		Media media = new Media("Le seigneur des anneaux", "toolkien", LocalDate.of(2010, 10, 14), TypeMedia.DVD);
		Media media2 = new Media("star wars", "georges lucas", LocalDate.of(2011, 04, 20), TypeMedia.DVD);
		Media media3 = new Media("duc", "booba", LocalDate.of(2000, 04, 20), TypeMedia.CD);
		Media media4 = new Media("harry potter", "jk rowling", LocalDate.of(1999, 01, 30), TypeMedia.LIVRE);
		Media media5 = new Media("terminator", "cameron", LocalDate.of(1984, 07, 07), TypeMedia.DVD);
		Media media6 = new Media("harry potter", "jk rowling", LocalDate.of(1999, 01, 30), TypeMedia.LIVRE);
		Media media7 = new Media("What''s New in Java 8", "Adam L. Davis", null, TypeMedia.LIVRE);
		Media media8 = new Media("Welcome to Java for Python Programmers", "Brad Miller", null, TypeMedia.LIVRE);
		Media media9 = new Media("lllllllll", "celine dion", LocalDate.of(2010, 10, 14), TypeMedia.CD);
		Media media10 = new Media("AVATAR", "cameron", LocalDate.of(2009, 05, 02), TypeMedia.CD);
		Media media11 = new Media("eminem show", "eminem", LocalDate.of(2004, 10, 14), TypeMedia.CD);
		
		
		
		/****************************************************************
		 * 				Création des DAOs 
		 ****************************************************************/
		
		UtilisateurDAO utildao = new UtilisateurDAO();
		AdherentDAO adhdao = new AdherentDAO();
		MediaDAO mediaDao = new MediaDAO();
		EmpruntDAO empruntDao = new EmpruntDAO();
		
		
//-------------------------------------------------------------------------------------------------------------------------------------		
//														AJOUT A LA BASE
//-------------------------------------------------------------------------------------------------------------------------------------		


		
		// enregistrement des utilsateurs 
		utildao.saveUtilisateur(util1);
		utildao.saveUtilisateur(util2);
		utildao.saveUtilisateur(util3);
		utildao.saveUtilisateur(util4);
		
		// enregistrement des adherents
		adhdao.saveAdherent(adh1);
		adhdao.saveAdherent(adh2);
		adhdao.saveAdherent(adh3);
		adhdao.saveAdherent(adh4);
		adhdao.saveAdherent(adh5);
		adhdao.saveAdherent(adh6);
		
		
		// enregistrement des medias
		mediaDao.saveMedia(media);
		mediaDao.saveMedia(media2);
		mediaDao.saveMedia(media3);
		mediaDao.saveMedia(media4);
		mediaDao.saveMedia(media5);
		mediaDao.saveMedia(media6);
		mediaDao.saveMedia(media7);
		mediaDao.saveMedia(media8);
		mediaDao.saveMedia(media9);
		mediaDao.saveMedia(media10);
		mediaDao.saveMedia(media11);
		
		// enregistrement des emprunts
		//empruntDao.
		
		
		/* L'adhérent d'id 2  & 4 */
		
		Adherent getadh2 = adhdao.getAdherent(7L);
		Adherent getadh4 = adhdao.getAdherent(10L);
		System.out.println("Les adhérent 7 & 10 sont : ");
		System.out.println(getadh2);
		System.out.println(getadh4);
		
		
		
	}

}
