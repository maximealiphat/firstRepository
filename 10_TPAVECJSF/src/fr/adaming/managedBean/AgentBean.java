package fr.adaming.managedBean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.adaming.model.User;

@ManagedBean(name="agentBean")
@ViewScoped
public class AgentBean {
	
	// Attributes
	private String mail;
	private String password;
	private ArrayList<User> listUser;
	
	// Constructors
	/** Constructor without params
	 * 
	 */
	public AgentBean() {
	}

	// Getters and Setters

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
