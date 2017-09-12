package com.huios.mavenapps.proxiBanque.metier;

import java.util.ArrayList;
import java.util.List;

public class Agence {
	
	//Attributs
	private int numeroAgence;
	private String dateDeCreation;
	private List<Employes> employes= new ArrayList <Employes>();
	
	//Constructeur
	public Agence() {
		super();
	}
	
	//Getters & Setters
	public int getIdAgence() {
		return numeroAgence;
	}
	public void setIdAgence(int numeroAgence) {
		this.numeroAgence = numeroAgence;
	}
	public String getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	
	//toString
	@Override
	public String toString() {
		return "Agence [idAgence=" + numeroAgence + ", dateDeCreation=" + dateDeCreation + "]";
	} 
	
	public List<Employes> ajouterEmployes (Employes e){
		 	employes.add(e);
		 	return employes;
	}
	
}
