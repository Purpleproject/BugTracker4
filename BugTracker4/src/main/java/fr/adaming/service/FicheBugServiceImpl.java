package fr.adaming.service; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.model.FicheBug;
import fr.adaming.model.Test;
import fr.adaming.model.Testeur;

@Service
@Transactional
public class FicheBugServiceImpl implements IFicheBugService {

	@Autowired
	private IGeneriqueDao<FicheBug> ficheBugDao;
	/**
	 * @param ficheBugDao the ficheBugDao to set
	 */
	public void setFicheBugDao(IGeneriqueDao<FicheBug> ficheBugDao) {
		this.ficheBugDao = ficheBugDao;
	}
	
	@Autowired
	private IGeneriqueDao<Test> testDao;
	
	/**
	 * @param testDao the testDao to set
	 */
	public void setTestDao(IGeneriqueDao<Test> testDao) {
		this.testDao = testDao;
	}
	@Autowired
	private IGeneriqueDao<Testeur> testeurDao;
	/**
	 * @param testeurDao the testeurDao to set
	 */
	public void setTesteurDao(IGeneriqueDao<Testeur> testeurDao) {
		this.testeurDao = testeurDao;
	}
	
	
	@Override
	public void creer(FicheBug ficheBug) {
		ficheBugDao.creer(ficheBug);
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(FicheBug ficheBug) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FicheBug rechercheParId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FicheBug> rechercheTout() {
		return ficheBugDao.rechercheTout();
	}

	@Override
	public void creerAssos(FicheBug ficheBug, int testId, int testeurId) {
		Test test = testDao.rechercheParId(testId);
		Testeur testeur = testeurDao.rechercheParId(testeurId);
		if ((test)!=null && testeur !=null ){
			ficheBug.setTest(test);
			ficheBug.setTesteur(testeur);
			ficheBugDao.creer(ficheBug);
		}
	}

	
}
