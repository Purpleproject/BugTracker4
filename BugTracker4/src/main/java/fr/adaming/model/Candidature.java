package fr.adaming.model; 

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="candidatures")
public class Candidature implements Serializable{
   /**Attributs
    * 
    */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_candidature")
	private int id;
	
	private int note;
	private String lettreMotivation;
	private String commentaireNote;
	@Column(nullable = false, columnDefinition = "TINYINT", length = 1)
	private boolean statut;	
	
	//Associations
	@ManyToOne
	@JoinColumn(name="testeur_id", referencedColumnName="id_utilisateur")
	private Testeur testeur;
	@ManyToOne
	@JoinColumn(name="test_id", referencedColumnName="id_test")
	private Test test;
	 /***************************
	    * Constructeurs
	    ************************/
	
	/**
	 * Constructeur vide
	 */
	public Candidature() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec id
	 * @param id
	 * @param testeur
	 * @param test
	 * @param note
	 * @param lettreMotivation
	 * @param commentaireNote
	 * @param statut
	 */
	public Candidature(int id, int note, String lettreMotivation, String commentaireNote,
			boolean statut) {
		super();
		this.id = id;
		this.note = note;
		this.lettreMotivation = lettreMotivation;
		this.commentaireNote = commentaireNote;
		this.statut = statut;
	}

	/**
	 * Constructeur sans id
	 * @param testeur
	 * @param test
	 * @param note
	 * @param lettreMotivation
	 * @param commentaireNote
	 * @param statut
	 */
	public Candidature(int note, String lettreMotivation, String commentaireNote,
			boolean statut) {
		super();
		this.note = note;
		this.lettreMotivation = lettreMotivation;
		this.commentaireNote = commentaireNote;
		this.statut = statut;
	}

	/*****************************
	 * Assesseurs et mutateurs
	 ******************************/

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

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getLettreMotivation() {
		return lettreMotivation;
	}

	public void setLettreMotivation(String lettreMotivation) {
		this.lettreMotivation = lettreMotivation;
	}

	public String getCommentaireNote() {
		return commentaireNote;
	}

	public void setCommentaireNote(String commentaireNote) {
		this.commentaireNote = commentaireNote;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	/********************
	 * toString
	 *******************/
	@Override
	public String toString() {
		return "Candidature [id=" + id + ", note=" + note
				+ ", lettreMotivation=" + lettreMotivation + ", commentaireNote=" + commentaireNote + ", statut="
				+ statut + "]";
	}
	
	
	
	
	
}
