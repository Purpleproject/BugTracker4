package fr.adaming.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Test;

import fr.adaming.service.ITestService;


@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	ITestService testService;

	/**
	 * @param testService the testService to set
	 */
	public void setTestService(ITestService testService) {
		this.testService = testService;
	}

	@RequestMapping(value = "/creerTest", method = RequestMethod.POST,consumes="application/json",produces="application/json")
	public void creer(@RequestBody Test test) {
		testService.creer(test);
		System.out.println("ok");
	}

	@RequestMapping(value = "/rechercherTout", method = RequestMethod.GET, produces = "application/json")
	public List<Test> rechercherTout() {
		return testService.rechercheTout();
	}


}
