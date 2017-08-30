package fr.adaming.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Candidature;

@Repository
public class CandidatureDaoImpl implements IGeneriqueDao<Candidature> {

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

	}

	@Override
	public void modifier(Candidature t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Candidature rechercheParId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidature> rechercheTout() {
		// TODO Auto-generated method stub
		return null;
	}

}
