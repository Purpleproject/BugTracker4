package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Candidature;


@Repository
public class CandidatureDaoImpl implements IGeneriqueDao<Candidature>, ICandidatureDao {

	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	// méthode qui va permettre à un testeur de postuler pour un test
	public void creer(Candidature c) {
		Session s = sf.getCurrentSession();
		s.save(c);
	}

	@Override
	// méthode qui va permettre à un testeur d'annuler sa candidature ou à un
	// éditeur
	// de refuser un testeur (possibilité d'utiliser un meessage d'explication)
	public void supprimer(int id) {
		Session s = sf.getCurrentSession();
		Candidature c =  (Candidature) s.get(Candidature.class, id);
		s.delete(c);
	}

	@Override
	public void modifier(Candidature t) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(t);}

	@Override
	public Candidature rechercheParId(int id) {
		Session s = sf.getCurrentSession();
		Candidature c =  (Candidature) s.get(Candidature.class, id);
		return c;
	}

	@Override
	public List<Candidature> rechercheTout() {
		Session s = sf.getCurrentSession();

		String req = "FROM Candidature";

		Query query = (Query) s.createQuery(req);

		return query.list();
	}

	@Override
	public List<Candidature> rechercheCandidatureTesteur(int id) {
		Session s = sf.getCurrentSession();
		
		String req = "FROM Candidature WHERE testeur_id=? AND statut = 1";
		
		Query query = s.createQuery(req);
		
		query.setParameter(0, id);
		
		return query.list();
	}

}
