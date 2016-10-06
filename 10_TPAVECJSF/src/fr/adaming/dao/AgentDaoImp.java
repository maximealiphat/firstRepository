package fr.adaming.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgentDaoImp implements IAgentDao{
	
	private static final String url = "jdbc:mysql://localhost:3306/dbjspservlet?autoReconnect=true&useSSL=false";
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String login = "root";
	private static final String password = "root";
	
	private Connection cn = null;
	private PreparedStatement ps = null;
	
	
	public int isExistDao(String login, String password){
		
		try {
			// Chargement du driver
			Class.forName(driver);
			// Création de la connexion
			cn = DriverManager.getConnection(url,AgentDaoImp.login,AgentDaoImp.password);
			// Création de la requete
			String sqlReq = "Select count(id_agent) from agent where mail=? AND mdp=?;";
			// Statement
			ps = cn.prepareStatement(sqlReq);
			//Passer les valeurs des paramètres de la requete
			ps.setString(1, login);
			ps.setString(2, password);
			// Envoyer la requête
			ResultSet rs = ps.executeQuery();
			
			// Utilisation des résultats
			rs.next();
			return rs.getInt(1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur SQL");System.out.println("Erreur SQL");System.out.println("Erreur SQL");System.out.println("Erreur SQL");System.out.println("Erreur SQL");System.out.println("Erreur SQL");
		} 
		finally {
			if (cn!=null){
				try {
					cn.close();
					if (ps!=null){
						ps.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return 0;
	}
}
