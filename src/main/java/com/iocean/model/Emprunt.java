package com.iocean.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emprunt")
public class Emprunt {
	
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Adherent adherent;
	@ManyToOne
	private Media media;
	@Column
	private LocalDate date_emprunt;
	@Column
	private LocalDate date_retour;
	
	public Emprunt(){}

	public Emprunt(Adherent adherent, Media media, LocalDate date_emprunt, LocalDate date_retour) {
		this.adherent = adherent;
		this.media = media;
		this.date_emprunt = date_emprunt;
		this.date_retour = date_retour;
	}
	
	public Long getId() {
		return id;
	}

	public Adherent getAdherent() {
		return adherent;
	}

	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public LocalDate getDate_emprunt() {
		return date_emprunt;
	}

	public void setDate_emprunt(LocalDate date_emprunt) {
		this.date_emprunt = date_emprunt;
	}

	public LocalDate getDate_retour() {
		return date_retour;
	}

	public void setDate_retour(LocalDate date_retour) {
		this.date_retour = date_retour;
	}

	@Override
	public String toString() {
		return "Emprunt [adherent=" + adherent + ", media=" + media + ", date_emprunt=" + date_emprunt
				+ ", date_retour=" + date_retour + "]";
	}

	

}
