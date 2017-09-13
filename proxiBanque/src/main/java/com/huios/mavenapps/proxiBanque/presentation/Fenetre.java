package com.huios.mavenapps.proxiBanque.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.huios.mavenapps.proxiBanque.metier.Client;
import com.huios.mavenapps.proxiBanque.metier.Compte;
import com.huios.mavenapps.proxiBanque.service.AuditeurImpl;
import com.huios.mavenapps.proxiBanque.service.ConseillerImpl;
import com.huios.mavenapps.proxiBanque.service.GerantImpl;
import com.huios.mavenapps.proxiBanque.service.IAuditeur;
import com.huios.mavenapps.proxiBanque.service.IConseiller;
import com.huios.mavenapps.proxiBanque.service.IGerant;
public class Fenetre extends JFrame{
	
	private IConseiller con = new ConseillerImpl ();
	private IGerant ger = new GerantImpl ();
	private IAuditeur aud = new AuditeurImpl();
	
	//onglets principaux
	
	private JPanel ongletsGerant = new JPanel();
	private JPanel ongletsConseiller = new JPanel();
	private JPanel ongletsAuditeur = new JPanel();
	
	//onglets dans gerant
	private JPanel ongletCreerConseiller= new JPanel();
	
	private JPanel ongletsComptes = new JPanel();
	private JPanel ongletCreerCompte = new JPanel();
	private JPanel ongletLireCompte = new JPanel();
	private JPanel ongletModifierCompte = new JPanel();
	private JPanel ongletSupprimerCompte = new JPanel();
	
	private JPanel ongletsComptes2 = new JPanel();
	private JPanel ongletCreerCompte2 = new JPanel();
	private JPanel ongletLireCompte2 = new JPanel();
	private JPanel ongletModifierCompte2 = new JPanel();
	private JPanel ongletSupprimerCompte2 = new JPanel();
	
	private JPanel ongletsClients = new JPanel();
	private JPanel ongletCreerClient= new JPanel();
	private JPanel ongletLireClient= new JPanel();
	private JPanel ongletModifierClient= new JPanel();
	private JPanel ongletSupprimerClient= new JPanel();
	private JPanel ongletVirement= new JPanel();
	private JPanel ongletCreditConso= new JPanel();
	private JPanel ongletCreditImmo= new JPanel();
	
	//Creer compte dans gerant
	private JButton bouton1 = new JButton("valider");
	private JLabel numero = new JLabel("numero");
	private JTextField entrernumero = new JTextField (10) ;
	private JLabel solde = new JLabel("solde");
	private JTextField entrersolde = new JTextField (10);
	private JLabel date = new JLabel ("date");
	private JTextField entrerdate = new JTextField (10);
	
	//Lire compte dans gerant
	private JButton bouton2 = new JButton("valider");
	private JLabel numerocompte2 = new JLabel ("numero du compte");
	private JTextField entrernumero2 = new JTextField (10);
	
	//Modifier compte dans gerant
	private JButton bouton3 = new JButton("valider");
	private JLabel modifiernumero = new JLabel("numero");
	private JTextField entrermodifiernumero = new JTextField (10) ;
	private JLabel modifiersolde = new JLabel("solde");
	private JTextField entrermodifiersolde = new JTextField (10);
	private JLabel modifdate = new JLabel ("date");
	private JTextField entrermodifierdate = new JTextField (10);
	
	//Supprimer compte dans gerant
	private JButton bouton4 = new JButton("valider");
	private JLabel numerocompte4 = new JLabel ("numero du compte");
	private JTextField entrernumero4 = new JTextField (10);
	
	//Creer client dans gerant
	private JButton bouton5 = new JButton("valider");
	private JLabel id = new JLabel("id");
	private JTextField entrerid = new JTextField (10) ;
	private JLabel nom = new JLabel("nom");
	private JTextField entrernom = new JTextField (10) ;
	private JLabel prenom = new JLabel("prenom");
	private JTextField entrerprenom = new JTextField (10);
	private JLabel adresse = new JLabel ("adresse");
	private JTextField entreraddresse = new JTextField (10);
	private JLabel codepostal = new JLabel("code postal");
	private JTextField entrercodepostal = new JTextField (10) ;
	private JLabel ville = new JLabel("ville");
	private JTextField entrerville = new JTextField (10);
	private JLabel telephone = new JLabel ("telephone");
	private JTextField entrertelephone = new JTextField (10);
	
	//Lire client dans gerant
	private JButton bouton6 = new JButton("valider");
	private JLabel id2 = new JLabel("id");
	private JTextField entrerid2 = new JTextField (10) ;
	
	//Modifier client dans gerant
	private JButton bouton7 = new JButton("valider");
	private JLabel id3 = new JLabel("id");
	private JTextField entrerid3 = new JTextField (10) ;
	private JLabel nom2 = new JLabel("nom");
	private JTextField entrernom2 = new JTextField (10) ;
	private JLabel prenom2 = new JLabel("prenom");
	private JTextField entrerprenom2 = new JTextField (10);
	private JLabel adresse2 = new JLabel ("adresse");
	private JTextField entreraddresse2 = new JTextField (10);
	private JLabel codepostal2 = new JLabel("code postal");
	private JTextField entrercodepostal2 = new JTextField (10) ;
	private JLabel ville2 = new JLabel("ville");
	private JTextField entrerville2 = new JTextField (10);
	private JLabel telephone2 = new JLabel ("telephone");
	private JTextField entrertelephone2 = new JTextField (10);
		//test
	//onglets dans Conseiller
	private JPanel ongletsClients2 = new JPanel();
	private JPanel ongletCreerClient2= new JPanel();
	private JPanel ongletLireClient2= new JPanel();
	private JPanel ongletModifierClient2= new JPanel();
	private JPanel ongletSupprimerClient2= new JPanel();
	private JPanel ongletVirement2= new JPanel();
	private JPanel ongletCreditConso2= new JPanel();
	private JPanel ongletCreditImmo2= new JPanel();
	

	
	
	//Fenetre
	
	public Fenetre () {
		setTitle("Proxibanque");
		setSize (800 , 500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		
	//Fonction des onglets
		
		//Creer compte dans gerant
		ongletCreerCompte.add(bouton1);
		ongletCreerCompte.add(numero);
		ongletCreerCompte.add(entrernumero);
		ongletCreerCompte.add(solde);
		ongletCreerCompte.add(entrersolde);
		ongletCreerCompte.add(date);
		ongletCreerCompte.add(entrerdate);
		
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt (entrernumero.getText()));
				c.setSolde(Integer.parseInt (entrersolde.getText()));
				c.setDateOuverture(entrerdate.getText());
				con.creerCompte(c);
				entrernumero.setText("");
				entrersolde.setText("");
				entrerdate.setText("");
				
			}
		});
		
		//Lire compte dans gerant
		ongletLireCompte.add(numerocompte2);
		ongletLireCompte.add(entrernumero2);
		ongletLireCompte.add(bouton2);
		
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt (entrernumero2.getText()));
				con.lireCompte(c);
				entrernumero2.setText("");
				
			}
		});
		
		//Modifier compte dans gerant
		ongletModifierCompte.add(bouton3);
		ongletModifierCompte.add(modifiernumero);
		ongletModifierCompte.add(entrermodifiernumero);
		ongletModifierCompte.add(modifiersolde );
		ongletModifierCompte.add(entrermodifiersolde);
		ongletModifierCompte.add(modifdate);
		ongletModifierCompte.add(entrermodifierdate);
		
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt (entrermodifiernumero.getText()));
				c.setSolde(Integer.parseInt (entrermodifiersolde.getText()));
				c.setDateOuverture(entrermodifierdate.getText());
				con.modifierCompte(c);
				entrermodifiernumero.setText("");
				entrermodifiersolde.setText("");
				entrermodifierdate.setText("");
				
			}
		});
		
		//supprimer compte dans gerant
		ongletSupprimerCompte.add(numerocompte4);
		ongletSupprimerCompte.add(entrernumero4);
		ongletSupprimerCompte.add(bouton4);
		
		bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt (entrernumero4.getText()));
				con.lireCompte(c);
				entrernumero4.setText("");
				
			}
		});
		
		//creer client dans gerant
		
		ongletCreerClient.add (bouton5);
		ongletCreerClient.add (id);
		ongletCreerClient.add (entrerid);
		ongletCreerClient.add (nom); 
		ongletCreerClient.add (entrernom); 
		ongletCreerClient.add (prenom); 
		ongletCreerClient.add (entrerprenom); 
		ongletCreerClient.add (adresse);
		ongletCreerClient.add (entreraddresse);
		ongletCreerClient.add (codepostal); 
		ongletCreerClient.add (entrercodepostal); 
		ongletCreerClient.add (ville); 
		ongletCreerClient.add (entrerville); 
		ongletCreerClient.add (telephone);
		ongletCreerClient.add (entrertelephone);
		
		bouton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Client c = new Client();
				c.setIdClient(Integer.parseInt (entrerid.getText()));
				c.setNom(entrernom.getText());
				c.setPrenom(entrerprenom.getText());
				c.setAdresse(entreraddresse.getText());
				c.setCodePostal(Integer.parseInt (entrercodepostal.getText()));
				c.setVille(entrerville.getText());
				c.setTelephone(entrertelephone.getText());
				con.creerClient(c);
				entrerid.setText("");
				entrernom.setText("");
				entrerprenom.setText("");
				entrercodepostal.setText("");
				entrerville.setText("");
				entrertelephone.setText("");
			}
		});
		
		
		//Lire client dans gerant
		ongletLireClient.add(id2);
		ongletLireClient.add(entrerid2);
		ongletLireClient.add(bouton6);
		
		bouton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt (entrerid2.getText()));
				con.lireCompte(c);
				entrerid2.setText("");
			}
		});
		
		
	//Disposition des onglets
		
		JTabbedPane ongletsGerant = new JTabbedPane();
		
		JTabbedPane ongletsCreerconseiller = new JTabbedPane();
		ongletsGerant.addTab("Creer conseiller", ongletsCreerconseiller);
		
		JTabbedPane ongletsComptes = new JTabbedPane();
		ongletsGerant.addTab("Comptes", ongletsComptes);
			ongletsComptes.addTab("Creer un compte", ongletCreerCompte);
			ongletsComptes.addTab("Lire comptes", ongletLireCompte);
			ongletsComptes.addTab("Modifier comptes", ongletModifierCompte);
			ongletsComptes.addTab("Supprimer comptes", ongletSupprimerCompte);
			
		JTabbedPane ongletsClients = new JTabbedPane();	
		ongletsGerant.addTab("Client", ongletsClients);	
			ongletsClients.addTab("Creer client ", ongletCreerClient);
			ongletsClients.addTab("Lire client", ongletLireClient);
			ongletsClients.addTab("Modifier client ", ongletModifierClient);
			ongletsClients.addTab("Supprimer client " , ongletSupprimerClient);
			ongletsClients.addTab("Virement " , ongletVirement);
			ongletsClients.addTab("Credit conso", ongletCreditConso);
			ongletsClients.addTab("Credit immobilier", ongletCreditImmo);
		
		
		JTabbedPane ongletsConseiller = new JTabbedPane();
		
		JTabbedPane ongletsComptes2 = new JTabbedPane();
		ongletsConseiller.addTab("Comptes", ongletsComptes2);
		ongletsComptes2.addTab("Creer un compte", ongletCreerCompte2);
		ongletsComptes2.addTab("Lire comptes", ongletLireCompte2);
		ongletsComptes2.addTab("Modifier comptes", ongletModifierCompte2);
		ongletsComptes2.addTab("Supprimer comptes", ongletSupprimerCompte2);
		
		JTabbedPane ongletsClient2 = new JTabbedPane();
		ongletsConseiller.addTab("Client", ongletsClient2);
		ongletsClient2.addTab("Creer client ", ongletCreerClient2);
		ongletsClient2.addTab("Lire client", ongletLireClient2);
		ongletsClient2.addTab("Modifier client ", ongletModifierClient2);
		ongletsClient2.addTab("Supprimer client " , ongletSupprimerClient2);
		ongletsClient2.addTab("Virement " , ongletVirement2);
		ongletsClient2.addTab("Credit conso", ongletCreditConso2);
		ongletsClient2.addTab("Credit immobilier", ongletCreditImmo2);
		
	
		
		JTabbedPane onglets = new JTabbedPane();
		onglets.addTab("Gerant",ongletsGerant);
		onglets.addTab("Conseiller",ongletsConseiller);
		onglets.addTab("Auditeur",ongletsAuditeur);	
		
		getContentPane().add(onglets);
			
	}
}