package com.project.control;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.entity.MitArbeiter;
import com.project.service.MitarbeiterService;

@Controller
public class MitArbeiterController {
	
	@Autowired
	private MitarbeiterService service2;
	
	@RequestMapping("/mitarbeiterform")
	public String mitarbeiterForm(Model model) {
		model.addAttribute("mitarbeitermodel", new MitArbeiter());
		List<String> list1=Arrays.asList("Java","JavaFX","Spring Boot","Spring MVC","Angular",
				"javascript","jQuery","Bootstrap 4","JSP,JSF,JSTL","Thymeleaf","CSS3,CSS,HTML5");
		
		model.addAttribute("listprog", list1);
		return "mitarbeiter-form";
	}
	
	@RequestMapping("/mitarbeiterinfo")
	public String mitarbeiterListPage(Model model) {
		List<MitArbeiter> list2=this.service2.mitarbeiterList();
		model.addAttribute("mitarbeit", list2);
		return "mitarbeiter-info";
	}
	
	@RequestMapping("/mitarbeiterSave")
	public String mitarbeiter(@ModelAttribute("mitarbeitermodel") MitArbeiter mitarbeit) {
		if(mitarbeit.getId()!=null) {
			this.service2.mitarbeiterUpdate(mitarbeit);
		}else {
			this.service2.mitarbeiterSave(mitarbeit);
		}
		return "redirect:/mitarbeiterinfo";
	}
	
	@RequestMapping("/delete/{id}")
	public String mitarbeiterDelete(@PathVariable("id")Integer id) {
		this.service2.mitarbeiteDelete(id);
		return "redirect:/mitarbeiterinfo";
	}
	@RequestMapping("/update/{id}")
	public String mitarbeiterUpdate(@PathVariable("id")Integer id,Model model) {
		MitArbeiter mitarbeit=this.service2.mitarbeiterFindById(id);
		model.addAttribute("mitarbeitermodel", mitarbeit);
		
		List<String> list1=Arrays.asList("Java","JavaFX","Spring Boot","Spring MVC","Angular",
				"javascript","jQuery","Bootstrap 4","JSP,JSF,JSTL","Thymeleaf","CSS3,CSS,HTML5");
		
		model.addAttribute("listprog", list1);
		return "mitarbeiter-form";
	}
	
	@GetMapping("/403")
	public String notFoundPage() {		
		return "403";
	}

}
