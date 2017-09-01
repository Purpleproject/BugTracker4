package fr.adaming.restcontrollers; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.FicheBug;
import fr.adaming.service.IFicheBugService;



@RestController
@RequestMapping("/ficheBug")
public class FicheBugController {

	@Autowired
	IFicheBugService ficheBugService;

	/**
	 * @param ficheBugService the ficheBugService to set
	 */
	public void setFicheBugService(IFicheBugService ficheBugService) {
		this.ficheBugService = ficheBugService;
	}

	@CrossOrigin
	@RequestMapping(value = "/creerFicheBug", method = RequestMethod.POST,consumes="application/json",produces="application/json")
	public void creer(@RequestBody FicheBug ficheBug) {
		ficheBugService.creer(ficheBug);
		System.out.println("ok");
	}
	
	@CrossOrigin
	@RequestMapping(value = "/creerFicheBugEtAssos", method = RequestMethod.POST, consumes="application/json",produces="application/json")
	public void creerAssos(@RequestBody FicheBug ficheBug, @RequestParam int testId, @RequestParam int testeurId){
		ficheBugService.creerAssos(ficheBug, testId, testeurId);
	}
	
/*	
	public String processSubmit(@ModelAttribute("ficheBug") FicheBug ficheBug, @RequestParam int testId,
	        BindingResult result, SessionStatus status, HttpSession session) {
	    Object userId = session.getAttribute("userId");
	    if (userId != null) {
	        rentalService.add(rental, (Long)userId, carId);
	        status.setComplete();
	    }

	    // form success
	    return "redirect:/index.htm";
	}
*/

	@CrossOrigin
	@RequestMapping(value = "/rechercherTout", method = RequestMethod.GET, produces = "application/json")
	public List<FicheBug> rechercherTout() {
		return ficheBugService.rechercheTout();
	}


}
