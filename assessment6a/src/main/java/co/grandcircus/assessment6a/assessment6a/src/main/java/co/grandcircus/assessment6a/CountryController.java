package co.grandcircus.assessment6a;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CountryController {

@Autowired
private CountryDao dao;

	
	@RequestMapping("/countries")
	public ModelAndView index() {
		List<Country> countries = dao.findAll();
		return new ModelAndView("index", "countries", countries);
	}
	
}
