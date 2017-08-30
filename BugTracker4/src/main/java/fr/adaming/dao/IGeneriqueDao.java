package fr.adaming.dao;

import java.util.List;

public interface IGeneriqueDao<T> {

	
	public void creer(T t);
	
	public void supprimer(int id);
	
	public void modifier(T t);
	
	public T rechercheParId(int id);
	
	public List<T> rechercheTout();
}
