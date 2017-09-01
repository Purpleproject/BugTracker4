package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="tests")
@JsonIgnoreProperties({"lCandidatures","lBugs"})
public class Test implements Serializable{
	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_test")
	private int id;
	private String nomTest;
	private String description;
	private Date datePublication;
	private Date dateFin;
	private String remuneration;
	private int nbTesteurAttendu;
	@Column(nullable = false, columnDefinition = "TINYINT", length = 1)
	private boolean statut;
	
	//Associations
	//association one to many
	@OneToMany(mappedBy="test", cascade=CascadeType.ALL)
	private List<Candidature> lCandidatures;
	
	//association one to many
	@OneToMany(mappedBy="test", cascade=CascadeType.ALL)
	private List<FicheBug> lBugs;
	
	@ManyToOne
	@JoinColumn(name="id_editeur", referencedColumnName="id_utilisateur")
	private Editeur editeur;
	
	/*******************************************
	*				Constructeurs
	********************************************/	
	

	
	public Test(int id, String nomTest, String description, Date datePublication, Date dateFin, String remuneration,
			int nbTesteurAttendu, boolean statut, Editeur editeur) {
		super();
		this.id = id;
		this.nomTest = nomTest;
		this.description = description;
		this.datePublication = datePublication;
		this.dateFin = dateFin;
		this.remuneration = remuneration;
		this.nbTesteurAttendu = nbTesteurAttendu;
		this.statut = statut;
		this.editeur = editeur;
	}

	public Test(String nomTest, String description, Date datePublication, Date dateFin, String remuneration,
			int nbTesteurAttendu, boolean statut, Editeur editeur) {
		super();
		this.nomTest = nomTest;
		this.description = description;
		this.datePublication = datePublication;
		this.dateFin = dateFin;
		this.remuneration = remuneration;
		this.nbTesteurAttendu = nbTesteurAttendu;
		this.statut = statut;
		this.editeur = editeur;
	}

	/**
	 * Constructeur vide
	 */
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Assesseurs et mutateurs
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomTest() {
		return nomTest;
	}
	public void setNomTest(String nomTest) {
		this.nomTest = nomTest;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDatePublication() {
		return datePublication;
	}
	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getRemuneration() {
		return remuneration;
	}
	public void setRemuneration(String remuneration) {
		this.remuneration = remuneration;
	}
	public int getNbTesteurAttendu() {
		return nbTesteurAttendu;
	}
	public void setNbTesteurAttendu(int nbTesteurAttendu) {
		this.nbTesteurAttendu = nbTesteurAttendu;
	}
	
	

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	/**
	 * @return the lCandidatures
	 */
	public List<Candidature> getlCandidatures() {
		return lCandidatures;
	}

	/**
	 * @param lCandidatures the lCandidatures to set
	 */
	public void setlCandidatures(List<Candidature> lCandidatures) {
		this.lCandidatures = lCandidatures;
	}

	public boolean isStatut() {
		return statut;
	}
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	public List<FicheBug> getlBugs() {
		return lBugs;
	}
	public void setlBugs(List<FicheBug> lBugs) {
		this.lBugs = lBugs;
	}
	
	/*****************************
	 * 			toString
	 * 
	 *****************************/
	@Override
	public String toString() {
		return "Test [id=" + id + ", " + (nomTest != null ? "nomTest=" + nomTest + ", " : "")
				+ (description != null ? "description=" + description + ", " : "")
				+ (datePublication != null ? "datePublication=" + datePublication + ", " : "")
				+ (dateFin != null ? "dateFin=" + dateFin + ", " : "")
				+ (remuneration != null ? "remuneration=" + remuneration + ", " : "") + "nbTesteurAttendu="
				+ nbTesteurAttendu + ", statut=" + statut + ", "
				+ (lCandidatures != null ? "lCandidatures=" + lCandidatures + ", " : "")
				+ (lBugs != null ? "lBugs=" + lBugs + ", " : "") + (editeur != null ? "editeur=" + editeur : "") + "]";
	}

	
	
	
	
	
}
