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
	public Editeur(int id, String nomUtilisateur, String mail, String mdp, Date date) {
		super(id, nomUtilisateur, mail, mdp, date, "editeur");
		// TODO Auto-generated constructor stub
	}
	public Editeur(String nomUtilisateur, String mail, String mdp, Date date) {
		super(nomUtilisateur, mail, mdp, date, "editeur");
		// TODO Auto-generated constructor stub
	}

}
