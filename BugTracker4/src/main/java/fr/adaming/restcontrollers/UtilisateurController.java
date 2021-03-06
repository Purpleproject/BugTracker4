package fr.adaming.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Editeur;
import fr.adaming.model.Testeur;
import fr.adaming.model.Utilisateur;
import fr.adaming.service.IEditeurService;
import fr.adaming.service.ITesteurService;
import fr.adaming.service.IUtilisateurService;

@RestController
@RequestMapping("/user")
public class UtilisateurController {
	//
	@Autowired
	IUtilisateurService utilisateurSer;

	@Autowired
	ITesteurService testeurSer;

	@Autowired
	IEditeurService editeurSer;

	public void setUtiSer(IUtilisateurService utiSer) {
		this.utilisateurSer = utiSer;
	}

	public void setTesSer(ITesteurService tesSer) {
		this.testeurSer = tesSer;
	}

	public void setEdiSer(IEditeurService ediSer) {
		this.editeurSer = ediSer;
	}

	@CrossOrigin
	@RequestMapping(value = "/creerTesteur", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public void creer(@RequestBody Testeur user) {
		testeurSer.creer(user);
		System.out.println("ok");
	}

	@CrossOrigin
	@RequestMapping(value = "/creerEditeur", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public void creer(@RequestBody Editeur user) {
		editeurSer.creer(user);
		System.out.println("ok");
	}

	@CrossOrigin
	@RequestMapping(value = "/rechercherTout", method = RequestMethod.GET, produces = "application/json")
	public List<Utilisateur> rechercherTout() {
		return utilisateurSer.rechercheTout();
	}

	@CrossOrigin
	@RequestMapping(value = "/listeTesteurs", method = RequestMethod.GET, produces = "application/json")
	public List<Testeur> rechercherToutTesteurs() {
		return testeurSer.rechercheTout();
	}

	@CrossOrigin
	@RequestMapping(value = "/editeurId", method = RequestMethod.GET, produces = "application/json")
	public Editeur rechercherEditeurId(@RequestParam("pId") int id) {
		return editeurSer.rechercheParId(id);
	}

	@CrossOrigin
	@RequestMapping(value = "/testeurId", method = RequestMethod.GET, produces = "application/json")
	public Testeur rechercherTesteurId(@RequestParam("pId") int id) {
		return testeurSer.rechercheParId(id);
	}

	// @RequestMapping(value = "/authentification", method = RequestMethod.GET,
	// produces = "application/json")
	// public boolean authentification(@RequestParam("pMail") String mail,
	// @RequestParam("pMdp") String mdp) {
	// Utilisateur user = utilisateurSer.rechercheParMail(mail);
	// if (user != null & user.getMpd() == mdp) {
	// return true;
	// } else {
	// return false;
	// }
	// }

}
