package com.iocean.test;

import java.time.LocalDate;

import com.iocean.dao.AdherentDAO;
import com.iocean.dao.CotisationDAO;
import com.iocean.dao.UtilisateurDAO;
import com.iocean.model.Adherent;
import com.iocean.model.Cotisation;
import com.iocean.model.Utilisateur;
import com.iocean.typeEnum.TypeCotisation;

public class TestDao {

	public static void main(String[] args) {

		/* Création d'adhérent */
		
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
		
		/* Création Utilisateur */
		
		Utilisateur util1 = new Utilisateur("Potter", "Harry", "harry@poudlard.mm", "leviosa", "ingardium", 2);
		Utilisateur util2 = new Utilisateur("Goldman", "Jean jacques", "janno@poudlard.mm", "jjg", "music", 2);
		Utilisateur util3 = new Utilisateur("Neige", "Blanche", "blanche@poudlard.mm", "BlancheNeige", "7nains", 2);
		Utilisateur util4 = new Utilisateur("Castor", "Père", "PCastor@poudlard.mm", "PereCastor", "histoire", 2);
		
		/* Création des DAO */
		
		UtilisateurDAO utildao = new UtilisateurDAO();
		AdherentDAO adhdao = new AdherentDAO();
		
		/* Ajout à la Base */
		
		utildao.saveUtilisateur(util1);
		utildao.saveUtilisateur(util2);
		utildao.saveUtilisateur(util3);
		utildao.saveUtilisateur(util4);
		
		adhdao.saveAdherent(adh1);
		adhdao.saveAdherent(adh2);
		adhdao.saveAdherent(adh3);
		adhdao.saveAdherent(adh4);
		adhdao.saveAdherent(adh5);
		adhdao.saveAdherent(adh6);
		
		/* L'adhérent d'id 2  & 4 */
		
		Adherent getadh2 = adhdao.getAdherent(7L);
		Adherent getadh4 = adhdao.getAdherent(10L);
		System.out.println("Les adhérent 7 & 10 sont : ");
		System.out.println(getadh2);
		System.out.println(getadh4);
		
		/* Cotisation à jour */
		
		Cotisation cot1 = new Cotisation(125f, LocalDate.of(2016, 03, 18), TypeCotisation.FAMILLE);
		Cotisation cot2 = new Cotisation(125f, LocalDate.of(2015, 12, 25), TypeCotisation.FAMILLE);
		
		CotisationDAO cotdao = new CotisationDAO();
		
		cotdao.saveCotisation(cot1);
		cotdao.saveCotisation(cot2);
		
		adh2.setCotisation(cot1);
		adh5.setCotisation(cot1);
		
		if(Cotisation.isUpToDateCotisation(adh2)){
			System.out.println(adh2.getNom() + " est à jour.");
		}
		else{
			System.out.println(adh2.getNom() + " n'est pas à jour.");
		}
		
		if(Cotisation.isUpToDateCotisation(adh5)){
			System.out.println(adh5.getNom() + " est à jour.");
		}
		else{
			System.out.println(adh5.getNom() + " n'est pas à jour.");
		}
		
	}

}
