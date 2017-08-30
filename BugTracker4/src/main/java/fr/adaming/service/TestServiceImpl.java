package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;

import fr.adaming.model.Test;

@Service
@Transactional
public class TestServiceImpl implements ITestService{
	
	
	@Autowired
	private IGeneriqueDao<Test> testDao;
	

	public void setTestDao(IGeneriqueDao<Test> testDao) {
		this.testDao = testDao;
	}

	@Override
	public void creer(Test t) {
		testDao.creer(t);
		
	}

	@Override
	public void supprimer(int id) {
		testDao.supprimer(id);
		
	}

	@Override
	public void modifier(Test t) {
		testDao.modifier(t);
		
	}

	@Override
	public Test rechercheParId(int id) {
		// TODO Auto-generated method stub
		return testDao.rechercheParId(id);
	}

	@Override
	public List<Test> rechercheTout() {
		return testDao.rechercheTout();
	}

	
}
