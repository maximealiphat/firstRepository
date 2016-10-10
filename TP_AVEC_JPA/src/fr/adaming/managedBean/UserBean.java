package fr.adaming.managedBean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.adaming.model.User;
import fr.adaming.service.IUserService;
import fr.adaming.service.UserServiceImp;

@ManagedBean(name="userBean")
@ViewScoped
public class UserBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
// Attributes
private User user;
private ArrayList<User> listeUser;
IUserService userService = new UserServiceImp();



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
	
	public String addUser(){
		userService.addUserService(this.user);
		return "Acceuil.xhtml";
	}
	
	public String deleteUser(){
		userService.deleteUserService(user.getId_user());
		return "Acceuil.xhtml";
	}
	
	
	public String updateUser(){
		userService.updateUserService(this.user);
		return "Acceuil.xhtml";
	}
	
	
	
	
	
}
