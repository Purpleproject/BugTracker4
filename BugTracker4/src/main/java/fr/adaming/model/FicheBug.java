package fr.adaming.model; 

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fichebugs")
public class FicheBug  implements Serializable{
	//attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_fichebug")
	private int id;
		
	private String libelle;
	private String description;
	private String statut;
	
	//association many to one
	@ManyToOne
	@JoinColumn(name="testeur_id",referencedColumnName="id_utilisateur")
	private Testeur testeur;
	//association many to one
	@ManyToOne
	@JoinColumn(name="test_id",referencedColumnName="id_test")
	private Test test;
	

	/*******************************************
	*				Constructeurs
	********************************************/
	
	/**
	 * Constructeur vide
	 */
	public FicheBug() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec id
	 * @param id
	 * @param libelle
	 * @param description
	 * @param statut
	 */
	public FicheBug(int id, String libelle, String description, String statut) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.statut = statut;
	}

	/**
	 * Constructeur sans id
	 * @param libelle
	 * @param description
	 * @param statut
	 */
	public FicheBug(String libelle, String description, String statut) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.statut = statut;
	}  
	
	/*************************************
	 * 		Assesseurs et mutateurs 
	 * 
	 ************************************/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Testeur getTesteur() {
		return testeur;
	}

	public void setTesteur(Testeur testeur) {
		this.testeur = testeur;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	/*************************
	 * toString
	 **************************/
	@Override
	public String toString() {
		return "FicheBug [id=" + id + ",  libelle=" + libelle + ", description=" + description
				+ ", statut=" + statut + "]";
	}
	
	
	 
	

}
