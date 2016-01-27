package com.iocean.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.iocean.typeEnum.TypeMedia;

@Entity
@Table(name="media")
public class Media {

	// Attributs 
	
	@Column
	private String titre;
	@Column
	private String auteur;
	
	@Column(name="id_emprunteur")
	@OneToMany(mappedBy="listeMedias")
	private Adherent emprunteur;
	
	@Column
	private LocalDate dateEmprunt;
	
	@Column
	@Enumerated(value = EnumType.STRING)
	private TypeMedia typeMedia;
	
	// Constructeur

	public Media(){
	}
	
	public Media(String titre, String auteur, LocalDate dateEmprunt, TypeMedia typeMedia) {
		this.titre = titre;
		this.auteur = auteur;
		this.dateEmprunt = dateEmprunt;
		this.typeMedia = typeMedia;
	}
	
	// Getters

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public TypeMedia getTypeMedia() {
		return typeMedia;
	}
	
	public Adherent getEmprunteur() {
		return emprunteur;
	}	
	
	// Setters
	
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public void setTypeMedia(TypeMedia typeMedia) {
		this.typeMedia = typeMedia;
	}
	public void setEmprunteur(Adherent emprunteur) throws Exception {
		if(this.emprunteur==null){
			this.emprunteur=emprunteur;
			if(emprunteur!=null){
				emprunteur.addMedia(this);
			}
		}else{
			throw new Exception("Ouvrage déjà emprunté.");
		}
	}

	@Override
	public String toString() {
		return "Medias [titre=" + titre + ", auteur=" + auteur + ", emprunteur=" + emprunteur + ", dateEmprunt="
				+ dateEmprunt + ", typeMedia=" + typeMedia + "]";
	}
	
	
	
}
