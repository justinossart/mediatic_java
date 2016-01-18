package com.iocean.model;

import com.iocean.utiltaires.Utilitaires;

public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private String email;

	public Personne() {
		this("John","Doe","alexis.lucien@polygone.fr");
	}
	
	public Personne(String nom, String prenom, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		try {
			Utilitaires.verifierMail(email);
		} catch (Exception e) {
			System.out.println("Courriel au mauvais format.");
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}
	
}
