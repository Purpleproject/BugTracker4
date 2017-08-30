package fr.adaming.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("testeur")
public class Testeur extends Utilisateur {

	private String nom;
	private String prenom;

	public Testeur() {
		super();
	}

	public Testeur(int id, String nomUtilisateur, String mail, String mpd, Date date,String nom, String prenom) {
		super(id, nomUtilisateur, mail, mpd, date);
		this.nom = nom;
		this.prenom = prenom;
	}

	public Testeur(String nomUtilisateur, String mail, String mpd, Date date,String nom, String prenom) {
		super(nomUtilisateur, mail, mpd, date);
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

	@Override
	public String toString() {
		return "Testeur [" + (nom != null ? "nom=" + nom + ", " : "") + (prenom != null ? "prenom=" + prenom : "")
				+ "]";
	}

	
	
	
}
