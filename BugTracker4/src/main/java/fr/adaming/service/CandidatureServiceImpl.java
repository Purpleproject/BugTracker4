package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.model.Candidature;

@Service
@Transactional
public class CandidatureServiceImpl implements ICandidatureService{

	
	@Autowired
	private IGeneriqueDao<Candidature> eDao;
	
	
	@Override
	public void creer(Candidature c) {
		eDao.creer(c);
	}
	

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Candidature c) {
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
