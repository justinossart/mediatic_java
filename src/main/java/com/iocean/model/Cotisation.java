package com.iocean.model;

import java.time.LocalDate;
import com.iocean.typeEnum.TypeCotisation;

public class Cotisation {
	
	// Attributs 
	
	private float montant;
	private LocalDate dateCotisation;
	private TypeCotisation typeCotisation;
	
	// Constructeurs
	
	public Cotisation(){
		this(0.0f, null,TypeCotisation.AUTRE);
	}
	
	public Cotisation(float montant, LocalDate date,TypeCotisation typeCotisation){ /* todo : eventuel try catch pour vérif l'existance du type cotisation */
		this.montant = montant;
		this.dateCotisation = date;
		this.typeCotisation = typeCotisation;
	}
	
	// Getteurs 
	
	public float getMontant() {
		return montant;
	}

	public LocalDate getDateCotisation() {
		return dateCotisation;
	}

	public LocalDate getFinAdhesion(){
		return dateCotisation.plusYears(1); 
	}
	
	public TypeCotisation getTypeCotisation() {
		return typeCotisation;
	}
	
	// Setteurs 
	
	public void setMontant(float montant) {
		this.montant = montant;
	}

	public void setDateCotisation(LocalDate dateCotisation) {
		this.dateCotisation = dateCotisation;
	}
	
	public void setTypeCotisation(TypeCotisation typeCotisation) {
		this.typeCotisation = typeCotisation;
	}

	// Méthodes
	
	@Override
	public String toString() {
		return "Cotisation [montant=" + montant + ", dateCotisation=" + dateCotisation + ", typeCotisation="
				+ typeCotisation + "]";
	}

}
