package com.iocean.model;

public class Adresse {

	private int numero;
	private String adresse;
	private String codePostal;
	private String ville;
	
	public Adresse(int numero, String adresse, String codePostal, String ville){
		this.numero = numero;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville; 
	}
	
	public Adresse(){
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville
				+ "]";
	}
	
	
	
}
