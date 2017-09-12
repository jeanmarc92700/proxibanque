package com.huios.mavenapps.proxiBanque.service;

import com.huios.mavenapps.proxiBanque.dao.Dao;
import com.huios.mavenapps.proxiBanque.dao.Idao;
import com.huios.mavenapps.proxiBanque.metier.Compte;

/**
* La classe AuditeurImpl est une classe qui est impl�menter par l'interface IAuditeur.
* Cette m�thode est utilis� uniquement pour l'auditeur.
* @author active_admin
*
*/
public class AuditeurImpl implements IAuditeur {
	/**
	 * Attribut qui permet de faire la relation avec la couche Dao
	 */
	private Idao dao = new Dao();
	
	/**
	 * La m�thode analyseCompte permet de faire les analyse de compte, 
	 * en verifiant qu'aucun compte particulier ne soit d�biteur de plus de 5000� 
	 * et qu'aucun compte entreprise ne soit d�biteur de plus de 50000�.
	 * La m�thode prend en argument compte.
	 */
	@Override
	public void analyseCompte(Compte compte) {
		dao.analyseCompte(compte);
	}

}
