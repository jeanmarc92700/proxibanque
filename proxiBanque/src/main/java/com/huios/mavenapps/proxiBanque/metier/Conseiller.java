package com.huios.mavenapps.proxiBanque.metier;

import java.util.ArrayList;
import java.util.List;

public class Conseiller extends Employes {
	//Relation entre conseiller et g�rant
	private Gerant gerant = new Gerant();
	
	//Relation entre conseiller et client => Un conseiller a 10 clients
	private List <Client> clients = new ArrayList <Client>();
	
	//Constructeur
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Client> ajouterClient (Client cli){
	 	clients.add(cli);
	 	return clients;
	}

}
