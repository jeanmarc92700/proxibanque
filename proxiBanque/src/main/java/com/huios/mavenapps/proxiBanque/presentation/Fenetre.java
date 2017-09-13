package com.huios.mavenapps.proxiBanque.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.huios.mavenapps.proxiBanque.metier.Client;
import com.huios.mavenapps.proxiBanque.metier.Compte;
import com.huios.mavenapps.proxiBanque.metier.Conseiller;
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
	
	//Creer conseiller dans gerant
	private JLabel idEmployes = new JLabel ("id");
	private JTextField entrerIdEmployes = new JTextField (10) ;	
	private JLabel nomEmployes = new JLabel("nom");
	private JTextField entrerNomEmployes = new JTextField (10) ;
	private JLabel prenomEmployes  = new JLabel ("prenom");
	private JTextField entrerPrenomEmployes = new JTextField (10) ;
	private JLabel email = new JLabel ("email");
	private JTextField entrerEmail = new JTextField (10) ;
	private JLabel login = new JLabel ("login");
	private JTextField entrerLogin = new JTextField (10);
	private JButton bouton = new JButton("valider");
	
	//Creer compte dans gerant
	private JLabel numero = new JLabel("numero");
	private JTextField entrernumero = new JTextField (10) ;
	private JLabel solde = new JLabel("solde");
	private JTextField entrersolde = new JTextField (10);
	private JLabel date = new JLabel ("date");
	private JTextField entrerdate = new JTextField (10);
	private JButton bouton1 = new JButton("valider");
	
	//Lire compte dans gerant
	private JLabel numerocompte2 = new JLabel ("numero du compte");
	private JTextField entrernumero2 = new JTextField (10);
	private JLabel donneescompte = new JLabel ();
	private JButton bouton2 = new JButton("valider");
	
	//Modifier compte dans gerant
	private JLabel modifierid = new JLabel("id");
	private JTextField entrermodifierid = new JTextField (10) ;
	private JLabel modifiersolde = new JLabel("solde");
	private JTextField entrermodifiersolde = new JTextField (10);
	private JLabel modifdate = new JLabel ("date");
	private JTextField entrermodifierdate = new JTextField (10);
	private JButton bouton3 = new JButton("valider");
	
	//Supprimer compte dans gerant
	private JLabel numeroid = new JLabel ("id");
	private JTextField entrernumeroid = new JTextField (10);
	private JButton bouton4 = new JButton("valider");
	
	//Creer client dans gerant
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
	private JButton bouton5 = new JButton("valider");
	
	//Lire client dans gerant
	private JLabel id2 = new JLabel("id");
	private JTextField entrerid2 = new JTextField (10) ;
	private JButton bouton6 = new JButton("valider");
	
	//Modifier client dans gerant
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
	private JButton bouton7 = new JButton("valider");
	
	
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
		setSize (1000 , 500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		
	//Fonction des onglets
		
		//Creeer conseiller
		
		/*ongletCreerConseiller.add (idEmployes);
		ongletCreerConseiller.add (entrerIdEmployes)  ;	
		ongletCreerConseiller.add (nomEmployes) ;
		ongletCreerConseiller.add (entrerNomEmployes); 
		ongletCreerConseiller.add (prenomEmployes);  
		ongletCreerConseiller.add (entrerPrenomEmployes); 
		ongletCreerConseiller.add (email );
		ongletCreerConseiller.add (entrerEmail );
		ongletCreerConseiller.add (login );
		ongletCreerConseiller.add (entrerLogin );
		ongletCreerConseiller.add(bouton);
		
		bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Employes e = new Employes();
				c.setIdEmployes(Integer.parseInt (entrerIdEmployes.getText()));
				c.setSolde( (entrerNomEmployes.getText()));
				c.setDateOuverture(entrerdate.getText());
				con.creerCompte(c);
				entrernumero.setText("");
				entrersolde.setText("");
				entrerdate.setText("");
				
			}
		});*/
		
		//Creer compte dans gerant
		ongletCreerCompte.add(numero);
		ongletCreerCompte.add(entrernumero);
		ongletCreerCompte.add(solde);
		ongletCreerCompte.add(entrersolde);
		ongletCreerCompte.add(date);
		ongletCreerCompte.add(entrerdate);
		ongletCreerCompte.add(bouton1);
		
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Compte c = new Compte();
				c.setNumCompte(Integer.parseInt (entrernumero.getText()));
				c.setSolde(Float.parseFloat (entrersolde.getText()));
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
		ongletLireCompte.add(donneescompte);
		ongletLireCompte.add(bouton2);
		
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Compte c = new Compte();
				//c.setNumCompte(Integer.parseInt (entrernumero2.getText()));
				con.lireCompte(Integer.parseInt (entrernumero2.getText()));;
				//List <Compte> comptes = new ArrayList <Compte>();
				//for (Compte c1 : 10) {
				//	System.out.println(c);
				//}
				
				entrernumero2.setText("");
				
			}
		});
		
		//Modifier compte dans gerant
		ongletModifierCompte.add(modifierid);
		ongletModifierCompte.add(entrermodifierid);
		ongletModifierCompte.add(modifiersolde );
		ongletModifierCompte.add(entrermodifiersolde);
		ongletModifierCompte.add(modifdate);
		ongletModifierCompte.add(entrermodifierdate);
		ongletModifierCompte.add(bouton3);
		
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
				con.modifierCompte((Integer.parseInt (entrermodifierid.getText())),(Float.parseFloat (entrermodifiersolde.getText())));
				entrermodifierid.setText("");
				entrermodifiersolde.setText("");
				
			}
		});
		
		//supprimer compte dans gerant
		ongletSupprimerCompte.add(numeroid);
		ongletSupprimerCompte.add(entrernumeroid);
		ongletSupprimerCompte.add(bouton4);
		
		bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Compte c = new Compte();
				//c.setNumCompte(Integer.parseInt (entrernumero4.getText()));
				con.suppressionCompte(Integer.parseInt (entrernumeroid.getText()));
				entrernumeroid.setText("");
				
			}
		});
		
		//creer client dans gerant
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
		ongletCreerClient.add (bouton5);
		
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
		
				con.lireClient(Integer.parseInt (entrerid2.getText()));
				entrerid2.setText("");
			}
		});
		
		//Modifier client dans gerant
		ongletModifierClient.add (id3);
		ongletModifierClient.add (entrerid3);
		ongletModifierClient.add (adresse2);
		ongletModifierClient.add (entreraddresse2);
		ongletModifierClient.add (codepostal2); 
		ongletModifierClient.add (entrercodepostal2); 
		ongletModifierClient.add (ville2); 
		ongletModifierClient.add (entrerville2); 
		ongletModifierClient.add (telephone2);
		ongletModifierClient.add (entrertelephone2);
		ongletModifierClient.add (bouton7);
		
		bouton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Client c = new Client();
				//c.setIdClient(Integer.parseInt (entrerid3.getText()));
				//c.setAdresse(entreraddresse2.getText());
				//c.setCodePostal(Integer.parseInt (entrercodepostal2.getText()));
				//c.setVille(entrerville2.getText());
				//c.setTelephone(entrertelephone2.getText());
				con.modifierClient(entreraddresse2.getText(),Integer.parseInt (entrercodepostal2.getText()),entrerville2.getText(),entrertelephone2.getText(),Integer.parseInt (entrerid3.getText()));;
				entrerid3.setText("");
				entrernom2.setText("");
				entrerprenom2.setText("");
				entrercodepostal2.setText("");
				entrerville2.setText("");
				entrertelephone2.setText("");
				
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