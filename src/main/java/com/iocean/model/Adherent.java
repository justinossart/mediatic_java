package com.iocean.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Adherent extends Personne {

	private LocalDate dateNaissance;
	private Adresse adresse;
	private Cotisation cotisation;
	private ArrayList<Medias> listeMedias;

	// Constructeurs

	public Adherent(String nom, String prenom, String mail, LocalDate date, Adresse adresse, Cotisation cotisation,
			ArrayList<Medias> listMedias) {
		super(nom, prenom, mail);
		this.dateNaissance = date;
		this.adresse = adresse;
		this.cotisation = cotisation;
		this.listeMedias = listMedias;
	}

	public Adherent(String nom, String prenom, String mail, LocalDate date, Adresse adresse, Cotisation cotisation) {
		this(nom, prenom, mail, date, adresse, cotisation, new ArrayList<Medias>());
	}

	public Adherent() {
		this("Nom", "Prenom", "Email", null, null, null, null);
	}

	// Getteurs
	public ArrayList<Medias> getMedias() {
		return this.listeMedias;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public int getAge() {
		/* todo : regarder si date ne le fait pas déjà */
		return 0;
	}

	// Setteurs
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	// Methode

	public void addMedia(Medias media) {
		this.listeMedias.add(media);
	}

	public void removeMedia(Medias media) {
		this.listeMedias.remove(media);
	}

	@Override
	public String toString() {
		return "Adherent [dateNaissance=" + dateNaissance + ", adresse=" + adresse + ", cotisation=" + cotisation
				+ ", listeMedias=" + listeMedias + "]";
	}

}
