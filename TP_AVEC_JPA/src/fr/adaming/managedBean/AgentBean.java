package fr.adaming.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.adaming.model.User;
import fr.adaming.service.AgentServiceImp;
import fr.adaming.service.IAgentService;
import fr.adaming.service.IUserService;
import fr.adaming.service.UserServiceImp;

@ManagedBean(name="agentBean")
@ViewScoped
public class AgentBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes
	private String mail;
	private String password;
	private List<User> listUser;
	
	IUserService userService = new UserServiceImp();
	IAgentService agentService = new AgentServiceImp();
	
	// Constructors
	/** Constructor without params
	 * 
	 */
	public AgentBean() {
		setListUser(userService.getAllUserService());
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
	
	public String connecter(){

		String sMail=this.mail;
		String sMdp=this.password;
		
		
		int verif =agentService.isExistService(sMail, sMdp);
		
		if (verif!= 1){
			return "authErreur";
		}
		if (verif == 1){
			return "acceuil";
		}

		return null;		
	}

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}
	
	public String deleteUser(User user){
		userService.deleteUserService(user.getId_user());
		return "Acceuil.xhtml";
	}
	
	
	
}
