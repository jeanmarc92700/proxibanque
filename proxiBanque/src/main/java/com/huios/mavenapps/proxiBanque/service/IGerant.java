package com.huios.mavenapps.proxiBanque.service;

import com.huios.mavenapps.proxiBanque.metier.Agence;
import com.huios.mavenapps.proxiBanque.metier.Conseiller;
import com.huios.mavenapps.proxiBanque.metier.Employes;

public interface IGerant {
	
	public void suppressionConseiller(Conseiller conseiller);
	public void creerConseiller(Employes employe);
	public void modifierConseiller(Conseiller conseiller);
	public void lireConseiller(Conseiller conseiller);
	public void ajouteremployes(Employes e, Agence a);
	

}
