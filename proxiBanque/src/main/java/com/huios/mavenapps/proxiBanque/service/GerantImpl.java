package com.huios.mavenapps.proxiBanque.service;

import com.huios.mavenapps.proxiBanque.dao.Dao;
import com.huios.mavenapps.proxiBanque.dao.Idao;
import com.huios.mavenapps.proxiBanque.metier.Agence;
import com.huios.mavenapps.proxiBanque.metier.Conseiller;
import com.huios.mavenapps.proxiBanque.metier.Employes;

/**
 * La classe GerantImpl est une classe fille de la classe ConseillerImpl 
 * et elle est impl�menter par l'interface IGerant.
 * Cette classe regroupe toutes les m�thodes utilis� par le gerant. 
 * @author active_admin
 *
 */
public class GerantImpl extends ConseillerImpl implements IGerant {
	/**
	 * Attribut qui permet de faire la relation avec la couche Dao
	 */
	private Idao dao = new Dao();
	
	/**
	 * La m�thode creerConseiller permet de cr�er un conseiller dans la base de donn�e. 
	 */
	@Override
	public void creerConseiller(Conseiller conseiller) {
		dao.creerConseiller(conseiller);
	}
	
	/**
	  * La m�thode lireConseiller permet de lire les informations du conseiller de la base de donn�e.
	  */
	@Override
	public void lireConseiller(Conseiller conseiller) {
		dao.lireConseiller(conseiller);
	}
	/**
	 *  La m�thode modifierConseiller permet de modifier les informations du conseiller dans la base de donn�e.
	 */

	@Override
	public void modifierConseiller(Conseiller conseiller) {
		dao.modifierConseiller(conseiller);
	}
	
	/**
	 *  La m�thode suppressionConseiller permet de supprimer un conseiller de la base de donn�e.
	 */

	@Override
	public void suppressionConseiller(Conseiller conseiller) {
		dao.suppressionConseiller(conseiller);
	}

	@Override
	public void ajouteremployes(Employes e, Agence a) {
		// TODO Auto-generated method stub
		
	}

	

	

}
