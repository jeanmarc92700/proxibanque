package com.huios.mavenapps.proxiBanque.metier;

public class Carte {
	
	//Attributs
	private int numCarte;
	private String dateExpiration;
	
	//Relation entre compte et carte => Une carte correspond � un seul compte
	private Compte compte;
	
	//Constructeur	
	public Carte() {
		// TODO Auto-generated constructor stub
	}

	//Getters & Setters
	public int getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}
	public String getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	
	//toString
	@Override
	public String toString() {
		return "Carte [numCarte=" + numCarte + ", dateExpiration=" + dateExpiration + "]";
	}
	
	
}
