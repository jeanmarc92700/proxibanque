package com.huios.mavenapps.proxiBanque.service;

import com.huios.mavenapps.proxiBanque.metier.Client;
import com.huios.mavenapps.proxiBanque.metier.Compte;

public interface IConseiller {
	
	//Signature des m�thodes pour Conseiller
	
	//CLIENT
	public void authentification(int id, int mdp);
	public void creerClient(Client client);
	public Client lireClient(int idClient);
	public void modifierClient(String adresse, int codePostal, String ville, String telephone, int idClient);
	public void suppressionClient(int idClient);
	
	//COMPTE
	public void creerCompte(Compte compte);
	public Compte lireCompte(int idCompte);
	public void modifierCompte(int idCompte, float solde);
	public void suppressionCompte(int idCompte);
	public void choixCarte(Compte compte);
	public void ajouterCarte(Compte compte);
	public void suppressionCarte(Compte compte);
	public int virementCompte(Compte compte1, Compte compte2);
	public void simCreditImmo(Compte compte);
	public void simCreditConso(Compte compte);
	public void gestionPatrimoine(Compte compte);
	public int getIdClient(Client client);
	public void attribuerCompte(Client client, Compte compte);
	
	
	
	
	
	

}
