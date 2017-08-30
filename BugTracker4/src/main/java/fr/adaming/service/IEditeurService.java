package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Editeur;
import fr.adaming.model.Utilisateur;

public interface IEditeurService {

	public void creer(Editeur t);

	public void supprimer(int id);

	public void modifier(Editeur t);

	public Editeur rechercheParId(int id);

	public List<Editeur> rechercheTout();

}
