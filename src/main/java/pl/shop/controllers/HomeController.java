package pl.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String welcome(Model model) {
	model.addAttribute("greeting", "Witaj w sklepie internetowym!");
	model.addAttribute("tagline", "Wyjątkowym i jedynym sklepieinternetowym");
	return "Welcome";
	}
}
