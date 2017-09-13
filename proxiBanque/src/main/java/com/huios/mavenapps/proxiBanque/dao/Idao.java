package com.huios.mavenapps.proxiBanque.dao;

import com.huios.mavenapps.proxiBanque.metier.Agence;
import com.huios.mavenapps.proxiBanque.metier.Carte;
import com.huios.mavenapps.proxiBanque.metier.Client;
import com.huios.mavenapps.proxiBanque.metier.Compte;
import com.huios.mavenapps.proxiBanque.metier.Conseiller;
import com.huios.mavenapps.proxiBanque.metier.Employes;

public interface Idao {
	
	//Signature des m�thodes
	
	//Gestion des Clients
	public void authentification(int id, int mdp);
	public void creerClient(Client client);
	public Client lireClient(int idClient);
	public void modifierClient(String adresse, int codePostal, String ville, String telephone, int idClient);
	public void suppressionClient(int idClient);
	
	//Gestion des Comptes
	
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
	public void gestionPatrimoine(Compte compte); //Client fortun� >500 000�
	
	//Audit
	public void analyseCompte(Compte compte); //Aucun compte d�biteur
	
	//Gestion des Conseiller
	public void creerConseiller(Employes employe);
	public void lireConseiller(Conseiller conseiller);
	public void modifierConseiller(Conseiller conseiller);
	public void suppressionConseiller(Conseiller conseiller);
	public void ajouteremployes(Employes e, Agence a);
	public int getIdClient(Client client);
	public void attribuerCompte(Client client, Compte compte);
	
	
	
	
	
	
	
	
	

}
