package fr.adaming.model;

public class Competence {

	//Attributs 
	private int id;
	private String libelle;
	
	
	/*******************************************
	*				Constructeurs
	********************************************/
	
	/**
	 * Constructeur vide
	 */
	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur avec id
	 * @param id
	 * @param libelle
	 */
	public Competence(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	/**
	 * Constructeur sans id
	 * @param libelle
	 */
	public Competence(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	/*******************************************
	*			Accesseurs et mutateurs
	********************************************/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Competence [id=" + id + ", libelle=" + libelle + "]";
	}
	
	
	
	
	
}
