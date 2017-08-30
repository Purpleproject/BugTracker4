package fr.adaming.dao;

import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Testeur;
import fr.adaming.model.Utilisateur;

@Repository
public class TesteurDaoImpl implements IGeneriqueDao<Testeur> {

	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void creer(Testeur t) {
		Session s = sf.getCurrentSession();
		s.save(t);
	}

	@Override
	public void supprimer(int id) {
		Session s = sf.getCurrentSession();
		Utilisateur u = (Utilisateur) s.get(Utilisateur.class, id);
		s.delete(u);
	}

	@Override
	public void modifier(Testeur t) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(t);
	}

	@Override
	public Testeur rechercheParId(int id) {
		Session s = sf.getCurrentSession();

		return (Testeur) s.get(Testeur.class, id);
	}

	@Override
	public List<Testeur> rechercheTout() {
		 Session s = sf.getCurrentSession();
		
		 String req = "FROM Testeur";
		
		 Query query = (Query) s.createQuery(req);
	
		 return query.list();
		 }
	
}
