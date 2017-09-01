package fr.adaming.dao;

import fr.adaming.model.Utilisateur;

public interface IUtilisateurDao {

	//public Utilisateur rechercherParMail(String mail);
	
	public Utilisateur login(String mail, String mdp);  
}
