
package fr.adaming.model;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateurs")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role")
@DiscriminatorValue("utilisateur")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;

	protected String nomUtilisateur;
	protected String mail;
	protected String mpd;
	protected Date date;

	public Utilisateur() {
		super();
	}

	
	public Utilisateur(String nomUtilisateur, String mail, String mpd, Date date) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.mail = mail;
		this.mpd = mpd;
		this.date = date;
	}


	public Utilisateur(int id, String nomUtilisateur, String mail, String mpd, Date date) {
		super();
		this.id = id;
		this.nomUtilisateur = nomUtilisateur;
		this.mail = mail;
		this.mpd = mpd;
		this.date = date;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMpd() {
		return mpd;
	}

	public void setMpd(String mpd) {
		this.mpd = mpd;
	}
	
	

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", "
				+ (nomUtilisateur != null ? "nomUtilisateur=" + nomUtilisateur + ", " : "")
				+ (mail != null ? "mail=" + mail + ", " : "") + (mpd != null ? "mpd=" + mpd + ", " : "")
				+ (date != null ? "date=" + date : "") + "]";
	}



}
