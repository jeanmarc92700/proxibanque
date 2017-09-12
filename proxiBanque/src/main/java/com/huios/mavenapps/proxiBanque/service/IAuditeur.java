package com.huios.mavenapps.proxiBanque.service;

import com.huios.mavenapps.proxiBanque.metier.Compte;

public interface IAuditeur {
	
	//Signature des m�thodes pour l'auditeur
	public void analyseCompte(Compte compte); //Aucun compte d�biteur

}
