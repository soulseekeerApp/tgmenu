package com.example.hybrisarchitecture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.hybrisarchitecture.facade.PlantFacade;

@Controller
public class HomeController
{
    // controller use the facade so its a dependency of it
	private final PlantFacade plantFacade;

	@Autowired
	public HomeController(PlantFacade plantFacade)
	{
		this.plantFacade = plantFacade;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model)
	{

		// here we use the facade to get the planst data and we send it to the view like this
		// we added an attribute with name "plants" and the value its the return of the plantFacade.findAll()
		model.addAttribute("plants", plantFacade.findAll());
		
		//Return the name of the view
		return "index";
	}
}
