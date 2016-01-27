package com.iocean.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "adherent")
	private List<Emprunt> listeEmprunt;

	// Constructeurs

	public Adherent() {
	}
	
	public Adherent(String nom, String prenom, String mail, LocalDate date, Adresse adresse, Cotisation cotisation) {
		super(nom, prenom, mail);
		this.dateNaissance = date;
		this.adresse = adresse;
		this.cotisation = cotisation;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Cotisation getCotisation() {
		return cotisation;
	}

	public void setCotisation(Cotisation cotisation) {
		this.cotisation = cotisation;
	}

	public List<Emprunt> getListeEmprunt() {
		return listeEmprunt;
	}

	public void setListeEmprunt(List<Emprunt> listeEmprunt) {
		this.listeEmprunt = listeEmprunt;
	}

	@Override
	public String toString() {
		return "Adherent [dateNaissance=" + dateNaissance + ", adresse=" + adresse + ", cotisation=" + cotisation
				+ ", listeEmprunt=" + listeEmprunt + "]";
	}




}
