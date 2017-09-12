package com.huios.mavenapps.proxiBanque.service;

import com.huios.mavenapps.proxiBanque.metier.Carte;
import com.huios.mavenapps.proxiBanque.metier.Client;
import com.huios.mavenapps.proxiBanque.metier.Compte;

public interface IConseiller {
	
	//Signature des m�thodes pour Conseiller
	
	//CLIENT
	public void authentification(int id, int mdp);
	public void creerClient(Client client);
	public void lireClient(Client client);
	public void modifierClient(Client client);
	public void suppressionClient(Compte compte, Carte carte);
	
	//COMPTE
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

}
