package de.otto.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import de.otto.demo.service.PlayerService;

@Controller
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	@RequestMapping("players")
	public ModelAndView all() {
		
		ModelAndView model = new ModelAndView("players");
		model.addObject("players", playerService.getAll());
		System.out.println("SFASFASDFASDFASDF");
		return model;
	}
	
	

}
