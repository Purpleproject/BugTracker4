package fr.adaming.service; 

import java.util.List;

import fr.adaming.model.Testeur;

public interface ITesteurService {

	
	public void creer(Testeur t);

	public void supprimer(int id);

	public void modifier(Testeur t);

	public Testeur rechercheParId(int id);

	public List<Testeur> rechercheTout();

}
