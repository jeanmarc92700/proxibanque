package com.huios.mavenapps.proxiBanque.presentation;

import com.huios.mavenapps.proxiBanque.metier.Client;
import com.huios.mavenapps.proxiBanque.metier.Compte;
import com.huios.mavenapps.proxiBanque.metier.Conseiller;
import com.huios.mavenapps.proxiBanque.metier.Employes;
import com.huios.mavenapps.proxiBanque.service.AuditeurImpl;
import com.huios.mavenapps.proxiBanque.service.ConseillerImpl;
import com.huios.mavenapps.proxiBanque.service.GerantImpl;
import com.huios.mavenapps.proxiBanque.service.IAuditeur;
import com.huios.mavenapps.proxiBanque.service.IConseiller;
import com.huios.mavenapps.proxiBanque.service.IGerant;


public class App 
{
    public static void main( String[] args )
    {
    	Fenetre f = new Fenetre();
		//rendre la fenêtre visible
		f.setVisible(true);
    	/*IAuditeur ia = new AuditeurImpl();
		IConseiller ic = new ConseillerImpl();
		IGerant ig = new GerantImpl();
		
		Client client = new Client();
		Compte compte = new Compte();
		Conseiller conseiller = new Conseiller();
		
		//******************CLIENT**********************
		client.setNom("VEN");
		client.setPrenom("Bava");
		client.setAdresse("11, rue Saint Maur");
		client.setCodePostal(94100);
		client.setVille("Saint Maur des Fosses");
		client.setTelephone("0612345678");
		//ic.creerClient(client);
		//System.out.println(ic.lireClient(1));
		//ic.modifierClient("rue des flandres", 95200, "Sarcelles", "0123456789", 1);
		//ic.suppressionClient(1);
		
		conseiller.setNom("NomConseiller1");
		conseiller.setPrenom("PrenomConseiller1");
		conseiller.setEmail("Conseiller@banque.fr");
		conseiller.setLogin("LoginConseiller");
		conseiller.setMdp("1234");
		conseiller.setIdEmployes(idEmployes);
		ig.creerConseiller(employe);*/
		
    }
}
