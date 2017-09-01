package fr.adaming.model; 

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@DiscriminatorValue("editeur")
@JsonIgnoreProperties("lTests")
public class Editeur extends Utilisateur {

	@OneToMany(mappedBy="editeur", cascade=CascadeType.ALL)
	private List<Test> lTests;
	
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
