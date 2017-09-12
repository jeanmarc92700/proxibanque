package com.huios.mavenapps.proxiBanque.dao;

import com.huios.mavenapps.proxiBanque.metier.Agence;
import com.huios.mavenapps.proxiBanque.metier.Carte;
import com.huios.mavenapps.proxiBanque.metier.Client;
import com.huios.mavenapps.proxiBanque.metier.Compte;
import com.huios.mavenapps.proxiBanque.metier.Conseiller;
import com.huios.mavenapps.proxiBanque.metier.Employes;

public class Dao implements Idao {
	
	@Override
	public void authentification(int id, int mdp) {
		System.out.println("AUTHENTIFICATION DU CONSEILLER");	
	}
	
	@Override
	public void creerClient(Client client) {
		System.out.println("CREATION d'un client !");		
	}
	
	@Override
	public void lireClient(Client client) {
		System.out.println("LECTURE d'un client !");
	}

	@Override
	public void modifierClient(Client client) {
		System.out.println("MODIFICATION d'un client !");
	}
	
	@Override
	public void suppressionClient(Compte compte, Carte carte) {
		System.out.println("SUPPRESSION d'un client !");
	}
	
	@Override
	public void creerCompte(Compte compte) {
		System.out.println("CREATION d'un compte !");
	}
	
	@Override
	public void lireCompte(Compte compte) {
		System.out.println("LECTURE d'un compte !");
	}
	
	@Override
	public void modifierCompte(Compte compte) {
		System.out.println("MODIFICATION d'un compte !");
	}
	
	@Override
	public void suppressionCompte(Compte compte) {
		System.out.println("SUPPRESSION d'un compte !");
	}

	@Override
	public void choixCarte(Compte c) {
		System.out.println("CHOIX d'une carte !");
	}

	@Override
	public void ajouterCarte(Compte c) {
	System.out.println("AJOUT d'une carte !");
	}

	@Override
	public void suppressionCarte(Compte c) {
		System.out.println("SUPPRESSION d'une carte !");
	}

	@Override
	public int virementCompte(Compte compte1, Compte compte2) {
		System.out.println("VIREMENT compte � compte !");
		return 0;
	}

	@Override
	public void simCreditImmo(Compte c) {
		System.out.println("SIMULATION d'un cr�dit IMMO !");
	}

	@Override
	public void simCreditConso(Compte c) {
		System.out.println("SIMULATION d'un cr�dit CONSO !");
	}

	@Override
	public void gestionPatrimoine(Compte c) {
		System.out.println("GESTION de patrimoine !");
	}

	@Override
	public void analyseCompte(Compte c) {
		System.out.println("ANALYSE d'un compte !");
	}

	@Override
	public void creerConseiller(Conseiller cons) {
		System.out.println("CREATION d'un conseiller !");
	}

	@Override
	public void lireConseiller(Conseiller conseiller) {
		System.out.println("LECTURE d'un conseiller");
	}
	
	@Override
	public void modifierConseiller(Conseiller cons) {
		System.out.println("MODIFICATION d'un conseiller !");
	}

	@Override
	public void suppressionConseiller(Conseiller cons) {
		System.out.println("SUPRESSION d'un conseiller !");
	}

	@Override
	public void ajouteremployes(Employes e, Agence a) {
		// TODO Auto-generated method stub
		
	}

	

	

}
