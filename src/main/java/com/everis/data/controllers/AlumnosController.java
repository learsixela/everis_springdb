package com.everis.data.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
			@RequestParam(value="edad") String edad) {
		System.out.println(nombre+" - "+pass);
		
		Alumno alumno= new Alumno();
		alumno.setNombre(nombre);
		alumno.setPassword(pass);
		alumno.setEdad(Integer.parseInt(edad));
		
		alumno = alumnoService.guardarAlumno(alumno);
		
		/*
		List<Alumno> alumnos_lista = alumnoService.allAlumnos();

		model.addAttribute("alumnos", alumnos_lista);
		return "index.jsp";
		 */
		return "redirect:/";
	}
	
	@RequestMapping("/alumnos/eliminar/{id}")
	public String eliminarAlumno(@PathVariable("id") Long id) {
	
		alumnoService.deleteById(id);
		return "redirect:/";
	}

	@RequestMapping("/alumnos/editar/{id}")
	public String editarAlumno(@PathVariable("id") Long id,
			Model model) {
		Optional<Alumno> alumno = alumnoService.findById(id);
		model.addAttribute("alumno", alumno);
		return "editar.jsp";
	}
	
	@RequestMapping("/alumno/actualizar/")
	public String actualizarAlumno(@Valid @ModelAttribute("alumno") Alumno alumno
			//BindingResult result
			//,@PathVariable("id") Long id
			) {
	
		alumnoService.actualizarAlumno(alumno);
		return "redirect:/";
	}
}
