package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Utilisateur;

public interface IUtilisateurService {

	public void creer(Utilisateur u);

	public void supprimer(int id);

	public void modifier(Utilisateur u);

	public Utilisateur rechercheParId(int id);

	public List<Utilisateur> rechercheTout();

	public Utilisateur rechercheParMail(String mail);
	
}
