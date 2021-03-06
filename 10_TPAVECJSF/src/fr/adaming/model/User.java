package fr.adaming.model;

public class User {
	// Attributes
	private int id_user;
	private String nom;
	private String prenom;
	private String mail;
	private String password;
	private boolean canEdit=false;
	
	// Constructors
	/** Constructor without params
	 * 
	 */
	public User() {
		super();
	}
	/**Constructor with params without id
	 * 
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param password
	 */
	public User(String nom, String prenom, String mail, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.password = password;
	}
	/** Constructor with params with id
	 * 
	 * @param id_user
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param password
	 */
	public User(int id_user, String nom, String prenom, String mail, String password) {
		this.id_user = id_user;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.password = password;
	}
	
	// Getters and Setters
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
		return "User [id_user=" + id_user + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", password="
				+ password + "]\n\n";
	}
	public boolean isCanEdit() {
		return canEdit;
	}
	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}
	
	
	
	
}
