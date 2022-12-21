package com.domain.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/home")
	//creamos metodo
	public String goIndex(){
		return "Index";
	}
	
	@RequestMapping("/")
	public String getPresentacion(){
		return "Presentacion";
	}

	@RequestMapping("/listado")
	public String goListado(Model model) {
		List<String> alumnos = new ArrayList<String>();
		alumnos.add("Ándres");
		alumnos.add("María");
		alumnos.add("Pepita");
		
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("profesor", "Gabriel Casas");
		model.addAttribute("alumnos", alumnos);

		return "Listado";
	}
}
