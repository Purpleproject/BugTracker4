package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Candidature;

public interface ICandidatureService {
	
	public void creer(Candidature c);

	public void supprimer(int id);

	public void modifier(Candidature c);

	public Candidature rechercheParId(int id);

	public List<Candidature> rechercheTout();

}
