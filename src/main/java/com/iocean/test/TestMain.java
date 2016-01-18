package com.iocean.test;

import java.time.LocalDate;
import java.util.ArrayList;
import com.iocean.model.Adherent;
import com.iocean.model.Adresse;
import com.iocean.model.Cotisation;
import com.iocean.model.Medias;
import com.iocean.model.Mediatheque;
import com.iocean.model.Utilisateur;
import com.iocean.typeEnum.TypeCotisation;
import com.iocean.typeEnum.TypeMedia;
import com.iocean.utiltaires.Utilitaires;

public class TestMain {

	public static void main(String[] args) {

		ArrayList<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();
		ArrayList<Medias> listMedias = new ArrayList<Medias>();
		ArrayList<Adherent> listeAdherents = new ArrayList<Adherent>();

		/************************************************
		*			creation de la Mediatheque
		************************************************/
		Mediatheque mediatheque = new Mediatheque(listeUtilisateurs, listeAdherents, listMedias);
		
		
		/************************************************
		*			creation des utilisateurs
		************************************************/

		// utilisateur valide
		Utilisateur utilisateur1 = new Utilisateur("Di Nicola", "guillaume", "guillaume.dinicola@wanadoo.fr","guidinico", "azerty", 1);
		System.out.println(utilisateur1);

		// utilisateur avec erreur
		Utilisateur utilisateur2 = new Utilisateur("Ossart", "justin", "@@@@gdfinicola@wanadoo.fr", "justinossart","azerty", 1);
		System.out.println(utilisateur2);

		
		// ajout dans la liste utilisateur
		listeUtilisateurs.add(utilisateur1);
		listeUtilisateurs.add(utilisateur2);
		
		
		
		/************************************************
		*			creation des adherents
		************************************************/
		
		Adherent adherent1 = new Adherent();
		adherent1.setId(11212);
		adherent1.setEmail("ahmed.rafik@iocean.fr");
		adherent1.setNom("rafik");
		adherent1.setPrenom("admed");
		adherent1.setAdresse(new Adresse(12, "rambla des calissons", 34000, "Montpellier"));
		adherent1.setDateNaissance(LocalDate.of(1990, 07, 04));
		
		
		Adherent adherent2 = new Adherent();
		adherent2.setId(44444);
		adherent2.setEmail("christophe.champion@iocean.fr");
		adherent2.setNom("champion");
		adherent2.setPrenom("christophe");
		adherent2.setAdresse(new Adresse(22, "rue des vaches", 80000, "Meru"));
		adherent2.setDateNaissance(LocalDate.of(1975, 04, 22));
		
		
		// ajout dans la liste adherent
		listeAdherents.add(adherent1);
		listeAdherents.add(adherent2);
		
		
		
		
		
		
		/************************************************
		*			creation des medias
		************************************************/
		
		Medias media1 = new Medias("Terminatir", "James Cameron", LocalDate.of(2016, 01, 02), TypeMedia.DVD);
		Medias media2 = new Medias("Lazarus", "David Bowie", LocalDate.of(2016, 01, 02), TypeMedia.CD);
		Medias media3 = new Medias("Le seigneur des anneaux", "Tolkien", LocalDate.of(2016, 01, 02), TypeMedia.LIVRE);
		
		// ajout dans la liste medias
		listMedias.add(media1);
		listMedias.add(media2);
		listMedias.add(media3);
		
		

		/************************************************
		*			Test date
		************************************************/
		LocalDate maDate = LocalDate.now();
		System.out.println(Utilitaires.getDateFrancais(maDate));
		
		
		
		
		/*************************************************
		 * 			Affichage de la mediathque
		 ************************************************/
		System.out.println(mediatheque);
		
		
		/*************************************************
		 * 			Tri de la liste de medias
		 ************************************************/
		
		LocalDate dateBruno = LocalDate.of(1973, 11, 16);
		LocalDate dateinscriptioBruno = LocalDate.of(1992, 11, 16);
		Adresse adrBruno = new Adresse(152, "avenue des mimosat", 34152, "loliCity");
		Cotisation cotBruno = new Cotisation(98, dateinscriptioBruno, TypeCotisation.SENIOR);
		
		Adherent Laurent= new Adherent("Michelat", "Bruno", "Bruno.michelat@fondes.net", dateBruno, adrBruno, cotBruno);
		
		LocalDate dateMedia1 = LocalDate.of(2003, 11, 16);
		LocalDate dateMedia2= LocalDate.of(2003, 02, 11);
		LocalDate dateMedia3 = LocalDate.of(2007, 01, 12);
		
		media1.setDateEmprunt(dateMedia3);
		media2.setDateEmprunt(dateMedia2);
		media3.setDateEmprunt(dateMedia1);
		
		
		Medias media4 = new Medias("La reine des neige", "Disney", LocalDate.of(2015, 12, 04), TypeMedia.DVD);
		Medias media5 = new Medias("Chanson pour les pieds", "Jena jacques goldman", LocalDate.of(2003, 06, 11), TypeMedia.CD);
		Medias media6 = new Medias("Le petit chaperon rouge", "Mystere et boule de gomme", LocalDate.of(1962, 04, 20), TypeMedia.LIVRE);
		Medias media7 = new Medias("Les 4 mousquetaires", "Dartagnan", LocalDate.of(1965, 10, 02), TypeMedia.DVD);
		Medias media8 = new Medias("Always", "John bon jovi", LocalDate.of(1995, 01, 02), TypeMedia.CD);
		Medias media9 = new Medias("Harry Potter tome 1", "Merlin", LocalDate.of(2001, 01, 02), TypeMedia.LIVRE);
		Medias media10 = new Medias("Breaking Bad", "James Cameron", LocalDate.of(2009, 01, 02), TypeMedia.DVD);
		Medias media11 = new Medias("Daidis Life", "Marcel Dadi", LocalDate.of(1961, 01, 02), TypeMedia.CD);
		Medias media12 = new Medias("Harry Potter tome 2", "Merlin", LocalDate.of(2003, 01, 02), TypeMedia.LIVRE);
		Medias media13 = new Medias("Zootopia", "Pixar", LocalDate.of(2013, 01, 02), TypeMedia.DVD);
		Medias media14 = new Medias("Best of", "Metallica", LocalDate.of(2000, 01, 02), TypeMedia.CD);
		
		Laurent.addMedia(media2);
		Laurent.addMedia(media1);
		Laurent.addMedia(media3);
		Laurent.addMedia(media4);
		Laurent.addMedia(media5);
		Laurent.addMedia(media6);
		Laurent.addMedia(media7);
		Laurent.addMedia(media8);
		Laurent.addMedia(media9);
		Laurent.addMedia(media10);
		Laurent.addMedia(media11);
		Laurent.addMedia(media12);
		Laurent.addMedia(media13);
		Laurent.addMedia(media14);
				
		System.out.println(Laurent);
		Utilitaires.sortMediasDate(Laurent);
		System.out.println(Laurent);
		Utilitaires.sortMediasTitle(Laurent);
		System.out.println(Laurent);
		
		

		
	
	}
}

