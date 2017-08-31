package fr.adaming.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("editeur")
public class Editeur extends Utilisateur {

	public Editeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Editeur(int id, String nomUtilisateur, String mail, String mpd, Date date, String role) {
		super(id, nomUtilisateur, mail, mpd, date, role);
		// TODO Auto-generated constructor stub
	}

	public Editeur(String nomUtilisateur, String mail, String mpd, Date date, String role) {
		super(nomUtilisateur, mail, mpd, date, role);
		// TODO Auto-generated constructor stub
	}

	
	
}
