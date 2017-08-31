package fr.adaming.restcontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentification")
public class LoginController {

	
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void login(){
		String req="SELECT count(1) FROM Utilisateur WHERE mail=? AND mdp=?";
		
		if (req>0)
			u 
		else
			null;
		//if mail + mdp correspond à un élément de la BD
		//envoyer sur la page d'accueil du site
		//else
		//renvoyer vers la page login + un message d'erreur
	}
}
