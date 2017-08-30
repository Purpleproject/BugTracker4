package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Editeur;
import fr.adaming.model.Testeur;
import fr.adaming.model.Utilisateur;

@Repository
public class EditeurDaoImpl implements IGeneriqueDao<Editeur> {

	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void creer(Editeur t) {
		Session s = sf.getCurrentSession();
		s.save(t);
	}

	@Override
	public void supprimer(int id) {
		Session s = sf.getCurrentSession();
		Utilisateur u =  (Utilisateur) s.get(Utilisateur.class, id);
		s.delete(u);
	}

	@Override
	public void modifier(Editeur t) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(t);
	}

	@Override
	public Editeur rechercheParId(int id) {
		Session s = sf.getCurrentSession();

		return (Editeur) s.get(Editeur.class, id);
	}

	@Override
	public List<Editeur> rechercheTout() {
		Session s = sf.getCurrentSession();

		String req = "FROM Utilisateur WHERE roles='editeur'";

		Query query = (Query) s.createQuery(req);

		return query.list();
	}


	
	
}
