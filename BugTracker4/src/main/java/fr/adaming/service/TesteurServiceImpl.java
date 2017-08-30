package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.dao.IUtilisateurDao;
import fr.adaming.model.Testeur;
import fr.adaming.model.Utilisateur;

@Service
@Transactional
public class TesteurServiceImpl implements ITesteurService {
	
	@Autowired
	private IGeneriqueDao<Testeur> tDao;

	public void setuDao(IGeneriqueDao<Testeur> tDao) {
		this.tDao = tDao;
	}


	@Override
	public void creer(Testeur t) {
	tDao.creer(t);
	}

	@Override
	public void supprimer(int id) {
	tDao.supprimer(id);
	}

	@Override
	public void modifier(Testeur t) {
	tDao.modifier(t);
	}

	@Override
	public Testeur rechercheParId(int id) {
			return tDao.rechercheParId(id);
	}

	@Override
	public List<Testeur> rechercheTout() {
		return tDao.rechercheTout();
	}


	

}
