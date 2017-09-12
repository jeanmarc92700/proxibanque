package com.huios.mavenapps.proxiBanque.metier;

public class CompteEpargne extends Compte {
	
	//Attributs
	private int tauxRemuneration;
	
	//Constructeur
	public CompteEpargne() {
		super();
	}

	//Getters & Setters
	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	//toString
	@Override
	public String toString() {
		return "CompteEpargne [tauxRemuneration=" + tauxRemuneration + "]";
	}
	
	
	

}
