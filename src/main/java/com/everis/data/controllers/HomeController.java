package com.everis.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.data.models.Alumno;
<<<<<<< HEAD
import com.everis.data.models.MartinezModel;
=======


>>>>>>> 5a3a6d5bcb028f1b54871d460acd82081e970e68
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
	
<<<<<<< HEAD
	@RequestMapping("/api/martinez")
	public String martinezApiIndex(Model model ) {
		List<MartinezModel> martinez_lista = martinezService.allMartinez();
		model.addAttribute("martinez",martinez_lista );
		return "/martinez/index.jsp";
	}
	
=======
>>>>>>> 5a3a6d5bcb028f1b54871d460acd82081e970e68
}
