
package fr.adaming.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "utilisateurs") 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role")
@DiscriminatorValue("utilisateur")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_utilisateur")
	protected int id;

	protected String nomUtilisateur;
	protected String mail;
	protected String mdp;
	protected Date date;
	
	@Transient
	protected String role;

	public Utilisateur() {
		super();
	}

	
	public Utilisateur(String nomUtilisateur, String mail, String mdp, Date date, String role) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.mail = mail;
		this.mdp = mdp;
		this.date = date;
		this.role = role;
	}


	public Utilisateur(int id, String nomUtilisateur, String mail, String mdp, Date date, String role) {
		super();
		this.id = id;
		this.nomUtilisateur = nomUtilisateur;
		this.mail = mail;
		this.mdp = mdp;
		this.date = date;
		this.role = role;
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

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", "
				+ (nomUtilisateur != null ? "nomUtilisateur=" + nomUtilisateur + ", " : "")
				+ (mail != null ? "mail=" + mail + ", " : "") + (mdp != null ? "mdp=" + mdp + ", " : "")
				+ (date != null ? "date=" + date : "") + (role != null ? "role=" + role : "") + "]";
	}



}
