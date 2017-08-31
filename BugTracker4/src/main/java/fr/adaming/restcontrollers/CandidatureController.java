package fr.adaming.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Candidature;
import fr.adaming.model.Test;
import fr.adaming.service.ICandidatureService;

@RestController
@RequestMapping("/candidature")
public class CandidatureController {

	@Autowired
	ICandidatureService candService;

	public void setCandService(ICandidatureService candService) {
		this.candService = candService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/rechercherTout", method = RequestMethod.GET, produces = "application/json")
	public List<Candidature> rechercherTout() {
		return candService.rechercheTout();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/creerCand", method = RequestMethod.POST, consumes = "application/json")
	public void creer(@RequestBody Candidature cand) {
		candService.creer(cand);
		System.out.println("ok");
	}

	@CrossOrigin
	@RequestMapping(value = "/creerCandAssos", method = RequestMethod.POST, consumes = "application/json")
	public void creerAssos(@RequestBody Candidature cand,@RequestParam int testId, @RequestParam int testeurId) {
		candService.creerAssos(cand,testId,testeurId);
		System.out.println("ok");
	}

	
	@RequestMapping(value = "/supprimer", method = RequestMethod.DELETE)
	public void supprimerCandidature(@RequestParam("pId") int id) {
		candService.supprimer(id);
	}

}
