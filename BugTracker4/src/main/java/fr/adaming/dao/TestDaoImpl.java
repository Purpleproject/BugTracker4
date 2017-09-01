package fr.adaming.dao; 

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Test;


@Repository
public class TestDaoImpl implements IGeneriqueDao<Test> {

	@Autowired
	private SessionFactory sf ;
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void creer(Test test) {
		Session s = sf.getCurrentSession();
		s.save(test);
	}

	@Override
	public void supprimer(int id) {
		Session s = sf.getCurrentSession();
		Test test = (Test) s.get(Test.class, id);
		s.delete(test);
	}

	@Override
	public void modifier(Test test) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(test);
	}

	@Override
	public Test rechercheParId(int id) {
		Session s = sf.getCurrentSession();
		return (Test) s.get(Test.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Test> rechercheTout() {
		Session s = sf.getCurrentSession();
		String req="FROM Test";
		Query query = s.createQuery(req);
		return query.list();
	}

}
