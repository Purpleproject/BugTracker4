package fr.adaming.service;

import java.util.List;

import fr.adaming.model.FicheBug;

public interface IFicheBugService {
	
	public void creer(FicheBug ficheBug);

	public void supprimer(int id);

	public void modifier(FicheBug ficheBug);

	public FicheBug rechercheParId(int id);

	public List<FicheBug> rechercheTout();
	
	public void creerAssos(FicheBug ficheBug, int testId, int testeurId);
}
