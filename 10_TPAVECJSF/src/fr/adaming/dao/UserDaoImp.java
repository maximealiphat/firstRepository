package fr.adaming.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fr.adaming.model.User;

public class UserDaoImp implements IUserDao{
	
	private static final String url = "jdbc:mysql://localhost:3306/dbjspservlet?autoReconnect=true&useSSL=false";
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String login = "root";
	private static final String password = "root";
	
	private Connection cn = null;
	private PreparedStatement ps = null;
	
	

	@Override
	public ArrayList<User> getAllUserDao() {
		try {
			ArrayList<User> userList = new ArrayList<User>();
			// Chargement du driver
			Class.forName(driver);
			// Création de la connexion
			cn = DriverManager.getConnection(url,UserDaoImp.login,UserDaoImp.password);
			
			// Création de la requete
			String sqlReq = "Select * from user;";
			// Statement
			ps = cn.prepareStatement(sqlReq);
			//Passer les valeurs des paramètres de la requete
			
			// Envoyer la requête
			ResultSet rs = ps.executeQuery();
			
			// Utilisation des résultats
			while (rs.next()){
				userList.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
			return userList;
			
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
		return null;
	}

	@Override
	public User getByIdDao(int id) {
		User user = null;
		try {
			ArrayList<User> userList = new ArrayList<User>();
			// Chargement du driver
			Class.forName(driver);
			// Création de la connexion
			cn = DriverManager.getConnection(url,UserDaoImp.login,UserDaoImp.password);
			
			// Création de la requete
			String sqlReq = "Select * from user where id_user=?";
			// Statement
			ps = cn.prepareStatement(sqlReq);
			//Passer les valeurs des paramètres de la requete
			ps.setInt(1, id);
			
			// Envoyer la requête
			ResultSet rs = ps.executeQuery();
			
			// Utilisation des résultats
			if (rs.next()){
				return new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
			
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
		return user;
	}

	@Override
	public int DeleteUserDao(int id) {
		try {
			// Chargement du driver
			Class.forName(driver);
			// Création de la connexion
			cn = DriverManager.getConnection(url,UserDaoImp.login,UserDaoImp.password);
			
			// Création de la requete
			String sqlReq = "DELETE from user where id_user=?";
			// Statement
			ps = cn.prepareStatement(sqlReq);
			//Passer les valeurs des paramètres de la requete
			ps.setInt(1, id);
			
			// Envoyer la requête
			return ps.executeUpdate();
			
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

	@Override
	public int addUserDao(User user) {
			try {
				ArrayList<User> userList = new ArrayList<User>();
				// Chargement du driver
				Class.forName(driver);
				// Création de la connexion
				cn = DriverManager.getConnection(url,UserDaoImp.login,UserDaoImp.password);
				
				// Création de la requete
				String sqlReq = "insert into user (nom,prenom,mail,mdp) values (?,?,?,?)";
				// Statement
				ps = cn.prepareStatement(sqlReq);
				//Passer les valeurs des paramètres de la requete
				ps.setString(1, user.getNom());
				ps.setString(2, user.getPrenom());
				ps.setString(3, user.getMail());
				ps.setString(4, user.getPassword());
				
				// Envoyer la requête
				return ps.executeUpdate();
				
				
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

	@Override
	public int UpdateUserDao(User user) {
		try {
			// Chargement du driver
			Class.forName(driver);
			// Création de la connexion
			cn = DriverManager.getConnection(url,UserDaoImp.login,UserDaoImp.password);
			
			// Création de la requete
			String sqlReq = "update user set nom=? , prenom=? , mail=? , mdp=? where id_user=?";
			// Statement
			ps = cn.prepareStatement(sqlReq);
			//Passer les valeurs des paramètres de la requete
			ps.setString(1, user.getNom());
			ps.setString(2, user.getPrenom());
			ps.setString(3, user.getMail());
			ps.setString(4, user.getPassword());
			ps.setInt(5, user.getId_user());
			
			// Envoyer la requête
			return ps.executeUpdate();
			
			
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
