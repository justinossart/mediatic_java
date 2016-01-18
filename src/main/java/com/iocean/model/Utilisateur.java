package com.iocean.model;

import com.iocean.utiltaires.Utilitaires;

public class Utilisateur extends Personne {
	
	private String login;
	private String password;
	private int authentification;
	
	public Utilisateur(String nom, String prenom, String email , String login, String password, int auth){
		super(nom, prenom, email);
		this.login = login;
		try{
			Utilitaires.verifierPassword(password);
		}
		catch(Exception e){
			System.out.println("Password incorect !!");
		}
		this.password = password;
		this.authentification = auth;
	}
	
	public Utilisateur() {
		this("John","Doe","alexis.lucien@polygone.fr", "Inconnu", "123456", 0);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAuthentification() {
		return authentification;
	}

	public void setAuthentification(int authentification) {
		this.authentification = authentification;
	}

	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", password=" + password + ", authentification=" + authentification
				+ "]";
	}
	
	
	
	
	
	
	

}
