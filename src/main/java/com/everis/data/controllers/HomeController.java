package com.everis.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.data.models.Alumno;
import com.everis.data.models.MartinezModel;
import com.everis.data.services.AlumnoService;
import com.everis.data.services.MartinezServices;
import com.sun.el.stream.Optional;

@Controller
public class HomeController {
	@Autowired
	AlumnoService alumnoService;
	
	@Autowired
	MartinezServices martinezService;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Alumno> alumnos_lista = alumnoService.allAlumnos();

		model.addAttribute("alumnos", alumnos_lista);
		return "index.jsp";
	}
	
	@RequestMapping("/api/martinez")
	public String martinezApiIndex(Model model ) {
		List<MartinezModel> martinez_lista = martinezService.allMartinez();
		model.addAttribute("martinez",martinez_lista );
		return "/martinez/index.jsp";
	}
	
}
