package fr.adaming.service; 

import java.util.List;

import fr.adaming.model.Test;

public interface ITestService {
	//

	public void creer(Test t);
	
	public void supprimer(int id);
	
	public void modifier(Test t);
	
	public Test rechercheParId(int id);
	
	public List<Test> rechercheTout();
}
