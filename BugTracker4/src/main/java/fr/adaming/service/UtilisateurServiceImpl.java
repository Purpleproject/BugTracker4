package fr.adaming.service; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGeneriqueDao;
import fr.adaming.dao.IUtilisateurDao;
import fr.adaming.model.Utilisateur;

@Service
@Transactional
public class UtilisateurServiceImpl implements IUtilisateurService {

	@Autowired
	private IGeneriqueDao<Utilisateur> uDao;

	@Autowired
	private IUtilisateurDao utiDao;

	public void setuDao(IGeneriqueDao<Utilisateur> uDao) {
		this.uDao = uDao;
	}

	public void setUtiDao(IUtilisateurDao utiDao) {
		this.utiDao = utiDao;
	}

	@Override
	public void creer(Utilisateur u) {
		uDao.creer(u);
	}

	@Override
	public void supprimer(int id) {
		uDao.supprimer(id);
	}

	@Override
	public void modifier(Utilisateur u) {
		uDao.modifier(u);
	}

	@Override
	public Utilisateur rechercheParId(int id) {
		return uDao.rechercheParId(id);
	}

	@Override
	public List<Utilisateur> rechercheTout() {
		return uDao.rechercheTout();
	}

	@Override
	public Utilisateur login(String mail, String mdp) {
		return utiDao.login(mail, mdp);
	}

//	public Utilisateur rechercheParMail(String mail){
//		return utiDao.rechercherParMail(mail);
//	}
	
}
