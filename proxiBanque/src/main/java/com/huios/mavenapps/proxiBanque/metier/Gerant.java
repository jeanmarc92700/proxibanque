package com.huios.mavenapps.proxiBanque.metier;

import java.util.ArrayList;
import java.util.List;

public class Gerant extends Employes {
	
	private List<Conseiller> conseillers= new ArrayList <Conseiller>();
	
	//Constructeur
	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//M�thodes
	public List<Conseiller> ajouterConseiller (Conseiller c){
	 	conseillers.add(c);
	 	return conseillers;
}
	
}
