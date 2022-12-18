package com.crisCode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crisCode.model.Persona;
import com.crisCode.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
		@GetMapping("/greeting")
		public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
			//if(name==null || name.isEmpty())
				//name="CrisCode";
			//Persona per = new Persona(1, "Cristina Sánchez");
			if(name.endsWith("World")) {
				repo.delete(new Persona(2,"Cris San"));
				name = "CrisCode";
			}
			
			Persona per = new Persona(0, name);
			repo.save(per);
			
			model.addAttribute("name", name);
			return "greeting";
		}

	}


