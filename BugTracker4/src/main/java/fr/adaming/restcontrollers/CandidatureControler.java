package fr.adaming.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Candidature;
import fr.adaming.service.ICandidatureService;

@RestController
@RequestMapping("/candidature")
public class CandidatureControler {

	@Autowired
	ICandidatureService candService;

	public void setCandService(ICandidatureService candService) {
		this.candService = candService;
	}

	@RequestMapping(value = "/creerCand", method = RequestMethod.POST, consumes = "application/json")
	public void creer(@RequestBody Candidature cand) {
		candService.creer(cand);
		System.out.println("ok");
	}

	@RequestMapping(value = "/supprimer", method = RequestMethod.DELETE)
	public void supprimerCandidature(@RequestParam("pId") int id) {
		candService.supprimer(id);
	}

}
