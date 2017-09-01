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
public class UtilisateurDaoImpl implements IGeneriqueDao<Utilisateur>, IUtilisateurDao {

	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void creer(Utilisateur u) {
		Session s = sf.getCurrentSession();
		s.save(u);
	}

	@Override
	public void supprimer(int id) {
		Session s = sf.getCurrentSession();
		Utilisateur u = (Utilisateur) s.get(Utilisateur.class, id);
		s.delete(u);

	}

	@Override
	public void modifier(Utilisateur u) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(u);
	}

	@Override
	public Utilisateur rechercheParId(int id) {
		Session s = sf.getCurrentSession();

		return (Utilisateur) s.get(Utilisateur.class, id);
	}

	@Override
	public List<Utilisateur> rechercheTout() {
		Session s = sf.getCurrentSession();

		String req = "FROM Utilisateur";

		Query query = (Query) s.createQuery(req);

		return query.list();
	}

	// @Override
	// public Utilisateur rechercherParMail(String mail) {
	// Session s = sf.getCurrentSession();
	//
	// String req = "FROM Utilisateur WHERE mail = :?";
	//
	// Query query = (Query) s.createQuery(req);
	// query.setParameter(1, mail);
	// return (Editeur) query.uniqueResult();
	// }

	@Override
	public Utilisateur login(String mail, String mdp) {
		Session s = sf.getCurrentSession();

		String reqTesteur = "SELECT * FROM Testeur WHERE mail=? AND mdp=?";
		String reqEditeur = "SELECT * FROM Editeur WHERE mail=? AND mdp=?";
		
		Query queryTesteur = s.createQuery(reqTesteur);
		Query queryEditeur = s.createQuery(reqEditeur);

		queryTesteur.setParameter(0, mail);
		queryTesteur.setParameter(1, mdp);
		
		queryEditeur.setParameter(0, mail);
		queryEditeur.setParameter(1, mdp);
		
		List<Testeur> lTesteur = queryTesteur.list();
		List<Editeur> lEditeur = queryEditeur.list();

		
		if (lTesteur.size() > 0) {
			Testeur testeur = lTesteur.get(0);
			testeur.setRole("testeur");
			return testeur;
		} else if (lEditeur.size() > 0) {
			Editeur editeur = lEditeur.get(0);
			editeur.setRole("editeur");
			return editeur;
		}else{  
			return null;
		}

	}
}
