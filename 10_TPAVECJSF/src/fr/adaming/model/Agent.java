package fr.adaming.model;

public class Agent {
	
	// Attributes
	private int id_agent;
	private String mail;
	private String password;
	
	// Constructors
	/** Constructor without params
	 * 
	 */
	public Agent() {
	}
	/** Constructor with params without id
	 * 
	 * @param mail
	 * @param password
	 */
	public Agent(String mail, String password) {
		this.mail = mail;
		this.password = password;
	}
	/** Constructor with params with id
	 * 
	 * @param mail
	 * @param password
	 * @param id_agent
	 */
	public Agent(String mail, String password, int id_agent) {
		this.mail = mail;
		this.password = password;
		this.id_agent = id_agent;
	}

	// Getters and Setters
	public int getId_agent() {
		return id_agent;
	}
	public void setId_agent(int id_agent) {
		this.id_agent = id_agent;
	}
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


	@Override
	public String toString() {
		return "Agent [id_agent=" + id_agent + ", mail=" + mail + ", password=" + password + "]";
	}
	
	
	
}
