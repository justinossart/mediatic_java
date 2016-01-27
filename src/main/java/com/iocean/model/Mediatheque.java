package com.iocean.model;

import java.util.ArrayList;

public class Mediatheque {

	private ArrayList<Utilisateur> utilisateurs;
	private ArrayList<Adherent> adherent;
	private ArrayList<Medias> media;

	
	// constructeur
	public Mediatheque(ArrayList<Utilisateur> utilisateurs, ArrayList<Adherent> adherent, ArrayList<Medias> media) {
		super();
		this.utilisateurs = utilisateurs;
		this.adherent = adherent;
		this.media = media;
	}

	
	public ArrayList<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public ArrayList<Adherent> getAdherent() {
		return adherent;
	}

	public void setAdherent(ArrayList<Adherent> adherent) {
		this.adherent = adherent;
	}

	public ArrayList<Medias> getMedia() {
		return media;
	}

	public void setMedia(ArrayList<Medias> media) {
		this.media = media;
	}

	
	
	@Override
	public String toString() {
		return "Mediatheque [utilisateurs=" + utilisateurs + ", adherent=" + adherent + ", media=" + media + "]";
	}

}
