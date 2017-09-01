package fr.adaming.dao; 

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.FicheBug;
import fr.adaming.model.Test;

@Repository
public class FicheBugDaoImpl implements IGeneriqueDao<FicheBug> {

	@Autowired
	private SessionFactory sf ;
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void creer(FicheBug ficheBug) {
		Session s = sf.getCurrentSession();
		s.save(ficheBug);
	}

	@Override
	public void supprimer(int id) {
		Session s = sf.getCurrentSession();
		FicheBug ficheBug = (FicheBug) s.get(FicheBug.class, id);
		s.delete(ficheBug);
	}

	@Override
	public void modifier(FicheBug ficheBug) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(ficheBug);
	}

	@Override
	public FicheBug rechercheParId(int id) {
		Session s = sf.getCurrentSession();
		return (FicheBug) s.get(FicheBug.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FicheBug> rechercheTout() {
		Session s = sf.getCurrentSession();
		String req="FROM FicheBug";
		Query query = s.createQuery(req);
		return query.list();
	}

}
