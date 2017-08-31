package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.model.Candidature;
import fr.adaming.model.Test;
import fr.adaming.model.Testeur;

@Service
@Transactional
public class CandidatureServiceImpl implements ICandidatureService{

	@Autowired
	private IGeneriqueDao<Candidature> cDao;
	private IGeneriqueDao<Test> testDao;
	private IGeneriqueDao<Testeur> testeurDao;
	
	@Override
	public void creerAssos(Candidature c,int testId, int testeurId) {
		Test test = testDao.rechercheParId(testId);
        Testeur testeur = testeurDao.rechercheParId(testeurId);
       
        if ((test)!=null && testeur !=null ){
        	c.setTest(test);
            c.setTesteur(testeur);
    		cDao.creer(c);
		}
	}
	

	@Override
	public void supprimer(int id) {
		cDao.supprimer(id);
		
	}

	@Override
	public void modifier(Candidature c) {
		cDao.modifier(c);
		
	}

	@Override
	public Candidature rechercheParId(int id) {
		
		return cDao.rechercheParId(id);
	}

	@Override
	public List<Candidature> rechercheTout() {
		
		return cDao.rechercheTout();
	}


	@Override
	public void creer(Candidature c) {
		cDao.creer(c);
		
	}

	
}
