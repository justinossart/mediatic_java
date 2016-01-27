package com.iocean.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.iocean.typeEnum.TypeCotisation;

@Entity
@Table(name="cotisation")
public class Cotisation {
	
	// Attributs 
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private float montant;
	@Column
	private LocalDate dateCotisation;
	
	@Enumerated(value = EnumType.STRING)
	private TypeCotisation typeCotisation;
	
	@OneToMany (mappedBy="cotisation")
	private List<Adherent> adherents;
	
	// Constructeurs
	
	public Cotisation(){
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
