package com.everis.data.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

<<<<<<< HEAD
=======
import com.everis.data.models.Alumno;
import com.everis.data.models.CPacheco;
>>>>>>> 1d373773cce38fe4c4ec7def6a5fced3b0240606
import com.everis.data.services.AlumnoService;
import com.everis.data.services.CPachecoService;

@Controller
public class HomeController {
	@Autowired
	AlumnoService alumnoService;
<<<<<<< HEAD
	/*
	 * @RequestMapping("/") public String index(Model model) { List<Alumno>
	 * alumnos_lista = alumnoService.allAlumnos();
	 * 
	 * model.addAttribute("alumnos", alumnos_lista); return "index.jsp"; }
	 */
=======
	/*@Autowired
	CPachecoService cpachecoService;*/
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Alumno> alumnos_lista = alumnoService.allAlumnos();

		model.addAttribute("alumnos", alumnos_lista);
		return "index.jsp";
	}
	
	//CPacheco INDEX
	/*@RequestMapping("/")
	public String index(Model model) {
		
		List<CPacheco> cpachecoList = cpachecoService.allCPacheco();
		model.addAttribute("cpacheco", cpachecoList);
		
		return "CPacheco/index.jsp";
	}*/
>>>>>>> 1d373773cce38fe4c4ec7def6a5fced3b0240606
}
