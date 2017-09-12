package com.huios.mavenapps.proxiBanque.metier;

public class Compte {
	
	//Attributs
	private int numCompte;
	private float solde;
	private String dateOuverture;
	
	//Relation entre compte et client => Un compte correspond qu'� un seul client
	private Client client;
	
	//Relation entre carte et compte => Un compte correspond � une seule carte
	private Carte carte;
	
	//Constructeur
	public Compte() {
		// TODO Auto-generated constructor stub
	}

	//Getters & Setters
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public String getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	//toString
	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
	}
	
	

}
