package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.model.Editeur;
import fr.adaming.model.Utilisateur;

@Service
@Transactional
public class EditeurServiceImpl implements IEditeurService {
	
	@Autowired
	private IGeneriqueDao<Editeur> eDao;

	public void setuDao(IGeneriqueDao<Editeur> eDao) {
		this.eDao = eDao;
	}


	@Override
	public void creer(Editeur t) {
		eDao.creer(t);
	}

	@Override
	public void supprimer(int id) {
		eDao.supprimer(id);
	}

	@Override
	public void modifier(Editeur t) {
		eDao.modifier(t);
	}

	@Override
	public Editeur rechercheParId(int id) {
		return eDao.rechercheParId(id);
	}

	@Override
	public List<Editeur> rechercheTout() {
		return eDao.rechercheTout();
	}

}
