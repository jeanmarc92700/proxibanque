package com.huios.mavenapps.proxiBanque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.huios.mavenapps.proxiBanque.metier.Agence;
import com.huios.mavenapps.proxiBanque.metier.Client;
import com.huios.mavenapps.proxiBanque.metier.Compte;
import com.huios.mavenapps.proxiBanque.metier.Conseiller;
import com.huios.mavenapps.proxiBanque.metier.Employes;


public class Dao implements Idao {
	
	@Override
	public void authentification(int id, int mdp) {
		System.out.println("AUTHENTIFICATION DU CONSEILLER");	
	}
	
	@Override
	public void creerClient(Client client) {
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque";
			String login="root";
			String mdp="";
			//CONNEXION A LA BDD
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//PREPARATION ET ENVOIE DE LA REQUETE
			String requete ="INSERT INTO client (nom,prenom,adresse,codePostal,ville,telephone) VALUES (?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setString(1,client.getNom());
			ps.setString(2,client.getPrenom());
			ps.setString(3, client.getAdresse());
			ps.setInt(4,client.getCodePostal());
			ps.setString(5,client.getVille());
			ps.setString(6,client.getTelephone());
		
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public Client lireClient(int idClient) {
		Client client = new Client();
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque";
			String login="root";
			String mdp="";
			//CONNEXION A LA BDD
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//PREPARATION ET ENVOIE DE LA REQUETE
			String requete ="SELECT * FROM client " +
							"WHERE idClient=?";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setInt(1, idClient);
			
			//RESULTATS
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
			client.setIdClient(rs.getInt(idClient));
			client.setNom(rs.getString("nom"));
			client.setPrenom(rs.getString("prenom"));
			client.setAdresse(rs.getString("adresse"));
			client.setCodePostal(rs.getInt("codePostal"));
			client.setVille(rs.getString("ville"));
			client.setTelephone(rs.getString("telephone"));
			//System.out.println(client);
			}
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return client;
		
	}

	@Override
	public void modifierClient(String adresse, int codePostal, String ville, String telephone, int idClient) {
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String ad="jdbc:mysql://localhost:3306/proxibanque";
			String login="root";
			String mdp="";
			//CONNEXION A LA BDD 
			Connection conn = DriverManager.getConnection(ad, login, mdp);
			//PREPARATION ET ENVOIE DE LA REQUETE
			String requete="UPDATE client SET adresse=?,codePostal=?,ville=?,telephone=?  "+
			"where idClient=?";		
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setString(1,adresse);
			ps.setInt(2,codePostal);
			ps.setString(3,ville);
			ps.setString(4,telephone);
			ps.setInt(5,idClient);
			ps.executeUpdate();
			//LIBERATION DES RESSOURCES
			ps.close();
			conn.close();
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
	}
	
	@Override
	public void suppressionClient(int idClient) {
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque";
			String login="root";
			String mdp="";
			//CONNEXION A LA BDD
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//PREPARATION ET ENVOIE DE LA REQUETE
			String requete="DELETE FROM client Where idClient=?";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setInt(1,idClient);
			ps.executeUpdate();
			//LIBERATION DES RESSOURCES
			ps.close();
			conn.close();
			} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			}
	}
	
	@Override
	public void creerCompte(Compte compte) {
		Client client = new Client();
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque";
			String login="root";
			String mdp="";
			//CONNEXION A LA BDD
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//PREPARATION ET ENVOIE DE LA REQUETE
			String requete ="INSERT INTO compte (solde,dateOuverture,numeroCompte) VALUES (?,?,?)";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setFloat(1,compte.getSolde());
			ps.setString(2,compte.getDateOuverture());
			ps.setInt(3, compte.getNumCompte());
			
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public Compte lireCompte(int idCompte) {
		Compte compte = new Compte();
		Client client = new Client();
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque";
			String login="root";
			String mdp="";
			//CONNEXION A LA BDD
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//PREPARATION ET ENVOIE DE LA REQUETE
			String requete ="SELECT * FROM compte WHERE idCompte = ? ";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setInt(1,idCompte);	
			//RESULTATS
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
			compte.setIdCompte(idCompte);
			compte.setSolde(rs.getInt("solde"));
			compte.setNumCompte(rs.getInt("numeroCompte"));
			compte.setDateOuverture(rs.getString("dateOuverture"));
			compte.setClient(client);
			System.out.println(compte);
			}
				ps.close();
				conn.close();
				rs.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return compte;
			
	}
	
	@Override
	public void modifierCompte(int idCompte,float solde) {
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque";
			String login="root";
			String mdp="";
			//CONNEXION A LA BDD 
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//PREPARATION ET ENVOIE DE LA REQUETE
			String requete="UPDATE compte SET solde =? "+
			"where idCompte=?";		
			PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
			ps.setFloat(1,solde);
			ps.setInt(2, idCompte);
			ps.executeUpdate();
			//LIBERATION DES RESSOURCES
			ps.close();
			conn.close();
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
	}
	
	@Override
	public void suppressionCompte(int idCompte) {
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque";
			String login="root";
			String mdp="";
			//CONNEXION A LA BDD
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//PREPARATION ET ENVOIE DE LA REQUETE
			String requete="DELETE FROM compte Where idCompte=?";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setInt(1,idCompte);
			ps.executeUpdate();
			//LIBERATION DES RESSOURCES
			ps.close();
			conn.close();
			} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			}
	}

	@Override
	public void choixCarte(Compte c) {
		System.out.println("CHOIX d'une carte !");
	}

	@Override
	public void ajouterCarte(Compte c) {
	System.out.println("AJOUT d'une carte !");
	}

	@Override
	public void suppressionCarte(Compte c) {
		System.out.println("SUPPRESSION d'une carte !");
	}

	@Override
	public int virementCompte(Compte compte1, Compte compte2) {
		System.out.println("VIREMENT compte � compte !");
		return 0;
	}

	@Override
	public void simCreditImmo(Compte c) {
		System.out.println("SIMULATION d'un cr�dit IMMO !");
	}

	@Override
	public void simCreditConso(Compte c) {
		System.out.println("SIMULATION d'un cr�dit CONSO !");
	}

	@Override
	public void gestionPatrimoine(Compte c) {
		System.out.println("GESTION de patrimoine !");
	}

	@Override
	public void analyseCompte(Compte c) {
		System.out.println("ANALYSE d'un compte !");
	}

	@Override
	public void creerConseiller(Employes employe) {
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque";
			String login="root";
			String mdp="";
			//CONNEXION A LA BDD
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//PREPARATION ET ENVOIE DE LA REQUETE
			String requete ="INSERT INTO employes (nom, prenom, email, login, mdp,agence) VALUES (?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(requete);
			ps.setString(1,employe.getNom());
			ps.setString(2,employe.getPrenom());
			ps.setString(3,employe.getEmail());
			ps.setString(4,employe.getLogin());
			ps.setString(5,employe.getMdp());
		
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void lireConseiller(Conseiller conseiller) {
		System.out.println("LECTURE d'un conseiller");
	}
	
	@Override
	public void modifierConseiller(Conseiller cons) {
		System.out.println("MODIFICATION d'un conseiller !");
	}

	@Override
	public void suppressionConseiller(Conseiller cons) {
		System.out.println("SUPRESSION d'un conseiller !");
	}

	@Override
	public void ajouteremployes(Employes e, Agence a) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int getIdClient(Client client) {
		try {
			// 1- Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			// 2- Adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque";
			String login = "root";
			String mdp = "";
			// 3- Se connecter à la BDD
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			// 4- Preparer et envoyer la requête
			String requete = "SELECT * FROM client " + 
							"where idClient=?";
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, client.getIdClient());
			// 5- Récupérer le résultat
			ResultSet rs = ps.executeQuery();
			if(rs!=null) {
			rs.next();
			client.setIdClient(rs.getInt("idClient"));
			client.setNom(rs.getString("nom"));
			client.setPrenom(rs.getString("prenom"));
			client.setAdresse(rs.getString("adresse"));
			client.setCodePostal(rs.getInt("codePostal"));
			client.setVille(rs.getString("ville"));
			client.setTelephone(rs.getString("telephone"));
			}
			else {
				System.out.println("AUCUN RESULTAT");
			}
			// 6- Liberer les ressources
			ps.close();
			conn.close();
			rs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return client.getIdClient();
	}
	
	@Override
	public void attribuerCompte(Client client, Compte compte) {
		try {
			//CHARGEMENT DU PILOTE
			Class.forName("com.mysql.jdbc.Driver");
			//ADRESSE DE LA BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque";
			String login = "root";
			String mdp = "";
			//CONNEXION A LA BDD
			Connection conn = DriverManager.getConnection(adresse, login, mdp);
			//PREPARATION ET ENVOI DE LA REQUETE
			String requete = "UPDATE compte SET clientId =? " +
							"WHERE idCompte = ?";
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, client.getIdClient());
			ps.setInt(2, compte.getIdCompte());
			ps.executeUpdate();
			//LIBERATION DES RESSOURCES
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	

}
