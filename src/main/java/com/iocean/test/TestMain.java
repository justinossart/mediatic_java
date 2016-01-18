package com.iocean.test;

import java.time.LocalDate;
import java.util.ArrayList;
import com.iocean.model.Adherent;
import com.iocean.model.Adresse;
import com.iocean.model.Medias;
import com.iocean.model.Mediatheque;
import com.iocean.model.Utilisateur;
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
		adherent1.setAdresse(new Adresse(12, "rambla des calissons", "34000", "Montpellier"));
		adherent1.setDateNaissance(LocalDate.of(1990, 07, 04));
		
		
		Adherent adherent2 = new Adherent();
		adherent2.setId(44444);
		adherent2.setEmail("christophe.champion@iocean.fr");
		adherent2.setNom("champion");
		adherent2.setPrenom("christophe");
		adherent2.setAdresse(new Adresse(22, "rue des vaches", "80000", "Meru"));
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

		
	
	}
}

