package fr.adaming.restcontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentification")
public class LoginController {

	
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void login(){
		
			null;
	}
}
