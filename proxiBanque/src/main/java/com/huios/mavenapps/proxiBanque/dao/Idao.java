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
	public void lireClient(Client client);
	public void modifierClient(Client client);
	public void suppressionClient(Compte compte, Carte carte);
	
	//Gestion des Comptes
	
	public void creerCompte(Compte compte);
	public void lireCompte(Compte compte);
	public void modifierCompte(Compte compte);
	public void suppressionCompte(Compte compte);
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
	public void creerConseiller(Conseiller conseiller);
	public void lireConseiller(Conseiller conseiller);
	public void modifierConseiller(Conseiller conseiller);
	public void suppressionConseiller(Conseiller conseiller);
	public void ajouteremployes(Employes e, Agence a);
	
	

}
