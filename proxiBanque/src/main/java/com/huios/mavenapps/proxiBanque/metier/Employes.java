package com.huios.mavenapps.proxiBanque.metier;

public class Employes {
	
	//Attributs
	private int idEmployes;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String mdp;
	private Agence monagence;
	
	//Constructeurs
	public Employes() {
		super();	
	}
	
	//Getters & Setters
	public int getIdEmployes() {
		return idEmployes;
	}
	public void setIdEmployes(int idEmployes) {
		this.idEmployes = idEmployes;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Agence getMonagence() {
		return monagence;
	}

	public void setMonagence(Agence monagence) {
		this.monagence = monagence;
	}

	//toString
	@Override
	public String toString() {
		return "Employes [idEmployes=" + idEmployes + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", login=" + login + ", mdp=" + mdp + ", monagence=" + monagence + "]";
	}

	
	
	
	
	

	

}
