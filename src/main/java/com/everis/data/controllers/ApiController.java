package com.everis.data.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.data.models.Alumno;
import com.everis.data.repositories.AlumnoRepository;
import com.everis.data.services.AlumnoService;

@RestController
public class ApiController {
	
	@Autowired
	AlumnoService alumnoService;
	@Autowired
	AlumnoRepository alumnoRepository;
	
	@RequestMapping("/api/alumnos")
	public List<Alumno> listaAlumnos(){
		
		List<Alumno> alumnos_lista = alumnoService.allAlumnos();
		
		return alumnos_lista;
	}
	@RequestMapping("/api/alumnos/{id}")
	public Optional<Alumno> buscarAlumno(@PathVariable("id") Long id) {
		
		Optional<Alumno> alumno = alumnoRepository.findById(id);
		return alumno;
	}
	
	@RequestMapping("/api/alumnos/eliminar/{id}")
	public String eliminarAlumno(@PathVariable("id") Long id) {
	
		alumnoRepository.deleteById(id);
		return "Alumno eliminado";
	}

}
