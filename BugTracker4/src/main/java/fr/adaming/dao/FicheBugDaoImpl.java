package fr.adaming.dao; 

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.FicheBug;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(FicheBug t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FicheBug rechercheParId(int id) {
		// TODO Auto-generated method stub
		return null;
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
