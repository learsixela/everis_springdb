package com.everis.data.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.data.models.Alumno;
import com.everis.data.services.AlumnoService;

@Controller
public class AlumnosController {
	/*
	private final AlumnoService alumnoService;
	
	public AlumnosController(AlumnoService alumnoService) {
		this.alumnoService=alumnoService;
	}
	*/
	@Autowired
	AlumnoService alumnoService;
	
	@RequestMapping("/alumnos")
	public String alumnos(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="pass") String pass,
			Model model) {
		System.out.println(nombre+" - "+pass);
		
		Alumno alumno= new Alumno();
		alumno.setNombre(nombre);
		alumno.setPassword(pass);
		alumno.setEdad(0);
		
		alumno = alumnoService.guardarAlumno(alumno);
		
		

		model.addAttribute("nombre", nombre);
		model.addAttribute("pass", pass);
		return "inicio.jsp";
	}

}
