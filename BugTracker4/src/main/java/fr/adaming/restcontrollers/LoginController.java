package fr.adaming.restcontrollers; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Utilisateur;
import fr.adaming.service.IUtilisateurService;

@RestController
@RequestMapping("/authentification")
public class LoginController {

	@Autowired
	IUtilisateurService utilisateurServ;
	public void setUtiisateurServ(IUtilisateurService utilisateurServ) {
		this.utilisateurServ = utilisateurServ;
	}


	@CrossOrigin
	@RequestMapping(value="/login", 
		method=RequestMethod.POST,
		produces="application/json"
			)
	public Utilisateur login( @RequestBody Utilisateur utilisateur){
		String mail = utilisateur.getMail();
		String mdp = utilisateur.getMdp();
			return utilisateurServ.login(mail, mdp);
	}

}













