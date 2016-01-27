package com.iocean.model;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="adherent")
public class Adherent extends Personne {

	@Column(name = "date_naissance")
	private LocalDate dateNaissance;
	
	@Embedded
	private Adresse adresse;
	
	@ManyToOne
	private Cotisation cotisation;
	
	@ManyToMany
	private ArrayList<Media> listeMedias;

	// Constructeurs

	public Adherent() {
	}
	
	public Adherent(String nom, String prenom, String mail, LocalDate date, Adresse adresse, Cotisation cotisation,
			ArrayList<Media> listMedias) {
		super(nom, prenom, mail);
		this.dateNaissance = date;
		this.adresse = adresse;
		this.cotisation = cotisation;
		this.listeMedias = listMedias;
	}

	public Adherent(String nom, String prenom, String mail, LocalDate date, Adresse adresse, Cotisation cotisation) {
		this(nom, prenom, mail, date, adresse, cotisation, new ArrayList<Media>());
	}

	// Getteurs
	public ArrayList<Media> getMedias() {
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

	public void addMedia(Media media) {
		this.listeMedias.add(media);
	}

	public void removeMedia(Media media) {
		this.listeMedias.remove(media);
	}

	@Override
	public String toString() {
		return "Adherent [dateNaissance=" + dateNaissance + ", adresse=" + adresse + ", cotisation=" + cotisation
				+ ", listeMedias=" + listeMedias + "]";
	}

}
