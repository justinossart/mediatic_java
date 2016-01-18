package com.iocean.model;

import java.time.LocalDate;

import com.iocean.typeEnum.TypeMedia;

public class Medias {

	// Attributs 
	
	private String titre;
	private String auteur;
	private Adherent emprunteur;
	private LocalDate dateEmprunt;
	private TypeMedia typeMedia;
	
	// Constructeur

	public Medias(){
		this("Inconnu","Inconnu",null,TypeMedia.AUTRE);
	}
	
	public Medias(String titre, String auteur, LocalDate dateEmprunt, TypeMedia typeMedia) {
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
