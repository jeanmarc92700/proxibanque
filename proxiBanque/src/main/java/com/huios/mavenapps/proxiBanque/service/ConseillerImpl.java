package com.huios.mavenapps.proxiBanque.service;

import com.huios.mavenapps.proxiBanque.dao.Dao;
import com.huios.mavenapps.proxiBanque.dao.Idao;
import com.huios.mavenapps.proxiBanque.metier.Carte;
import com.huios.mavenapps.proxiBanque.metier.Client;
import com.huios.mavenapps.proxiBanque.metier.Compte;

/**
 * La classe ConseillerImpl est impl�menter par l'interface IConseiller.
 * Cette classe regroupe toutes les m�thodes utilis� par le conseiller. 
 * @author active_admin
 *
 */
public class ConseillerImpl implements IConseiller{
	
	/**
	 * Attribut qui permet de faire la relation avec la couche Dao
	 */
	private Idao dao = new Dao();
	 /**
	  * La m�thode authentification permet au conseiller de s'authentifier 
	  * afin d'acc�der aux informations et aux comptes des clients
	  */
	@Override
	public void authentification(int id, int mdp) {
		dao.authentification(id, mdp);
	}
	
	/**
	 * La m�thode creerClient permet de cr�er un client dans la base de donn�es
	 */
	@Override
	public void creerClient(Client client) {
		dao.creerClient(client);
	}
	
	/**
	 * La m�thode lireClient permet de lire les informations du client dans la base de donn�es
	 */
	@Override
	public void lireClient(Client client) {
		dao.lireClient(client);
	}
	
	/**
	 * La m�thode modifierClient permet de modifier les informations du client dans la base de donn�es
	 */
	@Override
	public void modifierClient(Client client) {
		dao.modifierClient(client);
	}
	
	/**
	 * La m�thode suppressionClient permet de supprimer un client de la base de donn�es
	 */

	@Override
	public void suppressionClient(Compte compte, Carte carte) {
		dao.suppressionClient(compte, carte);
	}
	
	/**
	 * La m�thode creerCompte permet de creer un nouveau compte pour un client dans la base de donn�es
	 */
	@Override
	public void creerCompte(Compte compte) {
		dao.creerCompte(compte);
	}
	
	/**
	 * La m�thode lireCompte permet de lire les informations du compte client dans la base de donn�es
	 */
	@Override
	public void lireCompte(Compte compte) {
		dao.lireCompte(compte);
	}
	
	/**
	 * La m�thode modifierCompte permet de modifier les informations du compte dans la base de donn�es
	 */
	@Override
	public void modifierCompte(Compte compte) {
		dao.modifierCompte(compte);
	}
	
	/**
	 * La m�thode suppressionCompte permet de supprimer un compte client de la base de donn�es
	 */
	@Override
	public void suppressionCompte(Compte compte) {
		dao.suppressionCompte(compte);
	}
	
	/**
	 * La m�thode choixCarte permet de choisir une carte bleue (VisaElectron ou VisaPremier)
	 */

	@Override
	public void choixCarte(Compte compte) {
		dao.choixCarte(compte);
	}
	
	/**
	 * La m�thode choixCarte permet d'ajouter une carte � un compte
	 */

	@Override
	public void ajouterCarte(Compte compte) {
		dao.ajouterCarte(compte);
	}
	
	/**
	 * La m�thode suppressionCarte permet de supprimer une carte � un compte
	 */
	@Override
	public void suppressionCarte(Compte compte) {
		dao.suppressionCarte(compte);
	}
	
	/**
	 * La m�thode virementCompte permet d'effectuer un virement entre deux comptes
	 */
	@Override
	public int virementCompte(Compte compte1, Compte compte2) {
		dao.virementCompte(compte1, compte2);
		return 0;
	}
	
	/**
	 * La m�thode simCreditImmo permet de faire la simulation d'un cr�dit immobilier en fonction des comptes
	 */

	@Override
	public void simCreditImmo(Compte compte) {
		dao.simCreditImmo(compte);
	}

	/**
	 * La m�thode simCreditConso permet de faire la simulation d'un cr�dit � la consommation en fonction des comptes
	 */
	@Override
	public void simCreditConso(Compte compte) {
		dao.simCreditConso(compte);
	}
	
	/**
	 * La m�thode gestionPatrimoine permet de gerer le patrimoine des clients fortun�s (>500 000�)
	 */
	@Override
	public void gestionPatrimoine(Compte compte) {
		dao.gestionPatrimoine(compte);
	}

}
