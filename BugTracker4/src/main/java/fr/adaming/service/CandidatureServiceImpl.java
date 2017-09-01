package fr.adaming.service; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.ICandidatureDao;
import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.model.Candidature;


@Service
@Transactional
public class CandidatureServiceImpl implements ICandidatureService{

	@Autowired
	private IGeneriqueDao<Candidature> cDao;

	@Autowired
	private ICandidatureDao caDao;
	


	public void setcDao(IGeneriqueDao<Candidature> cDao) {
		this.cDao = cDao;
	}

	public void setCaDao(ICandidatureDao caDao) {
		this.caDao = caDao;
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


	@Override
	public List<Candidature> rechercheCandidatureTesteur(int id) {
		
		return caDao.rechercheCandidatureTesteur(id);
	}

	
}
