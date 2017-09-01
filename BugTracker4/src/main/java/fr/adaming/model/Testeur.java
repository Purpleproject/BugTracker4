package fr.adaming.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@DiscriminatorValue("testeur")
@JsonIgnoreProperties("lCandidatures")
public class Testeur extends Utilisateur {

	private String nom;
	private String prenom;

	@OneToMany(mappedBy = "testeur", cascade = CascadeType.ALL)
	private List<Candidature> lCandidatures;

	public Testeur() {
		super();
	}

	
	public Testeur(int id, String nomUtilisateur, String mail, String mdp, Date date, String nom, String prenom) {
		super(id, nomUtilisateur, mail, mdp, date, "testeur");
		this.nom = nom;
		this.prenom = prenom;
	}


	public Testeur(String nomUtilisateur, String mail, String mdp, Date date, String nom, String prenom) {
		super(nomUtilisateur, mail, mdp, date, "testeur");
		this.nom = nom;
		this.prenom = prenom;
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

	public List<Candidature> getlCandidatures() {
		return lCandidatures;
	}

	public void setlCandidatures(List<Candidature> lCandidatures) {
		this.lCandidatures = lCandidatures;
	}

	@Override
	public String toString() {
		return "Testeur [" + (nom != null ? "nom=" + nom + ", " : "") + (prenom != null ? "prenom=" + prenom : "")
				+ "]";
	}

}
