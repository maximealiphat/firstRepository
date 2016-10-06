package fr.adaming.managedBean;

import java.util.ArrayList;

import fr.adaming.model.User;

public class UserBean {
	// Attributes
private User user;
private ArrayList<User> listeUser;
	// Constructors
	/** Constructor without params
	 * 
	 */
	public UserBean() {
		this.setUser(new User());
	}


	// Getters and Setters
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<User> getListeUser() {
		return listeUser;
	}
	public void setListeUser(ArrayList<User> listeUser) {
		this.listeUser = listeUser;
	}
}
