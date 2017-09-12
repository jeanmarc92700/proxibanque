package com.huios.mavenapps.proxiBanque.metier;

public class CompteCourant extends Compte {
	
	//Attributs
	private int decouvert;
	
	//Constructeur
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Getters & Setters
	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	//toString
	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}
	
	

}
