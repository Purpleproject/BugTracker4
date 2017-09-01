package fr.adaming.dao; 

import java.util.List;

import fr.adaming.model.Candidature;

public interface ICandidatureDao {
	
	public List<Candidature> rechercheCandidatureTesteur(int id);  

}
