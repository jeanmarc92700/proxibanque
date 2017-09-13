package com.huios.mavenapps.proxiBanque.metier;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private int idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private int codePostal;
	private String ville;
	private String telephone;
	private int employeId;
	//Relation entre compte et client => Un client a plusieurs compte
	private List <Compte> comptes = new ArrayList <Compte>();
	
	//Relation entre client et conseiller => Un client a un seul conseiller
	private Conseiller conseiller;
	
	//Constructeur	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	//Getters & Setters
	
	
	public int getIdClient() {
		return idClient;
	}

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getNom() {
		return nom;
	}
	

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	//toString
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", telephone=" + telephone + "]";
	}
	
	public List<Compte> ajouterEmployes (Compte comp){
	 	comptes.add(comp);
	 	return comptes;
}
	
	
}
