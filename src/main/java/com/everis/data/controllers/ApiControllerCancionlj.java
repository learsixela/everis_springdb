package com.everis.data.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.data.models.Cancionlj;
import com.everis.data.repositories.CancionljRepository;
import com.everis.data.services.CancionljService;

@RestController
public class ApiControllerCancionlj {

	@Autowired
	CancionljService cancionljService;
	@Autowired
	CancionljRepository cancionljRepository;

	@RequestMapping("/api/canciones")
	public List<Cancionlj> listaCanciones() {

		List<Cancionlj> canciones_lista = cancionljService.allCanciones();

		return canciones_lista;
	}

	@RequestMapping("/api/canciones/{id}")
	public Optional<Cancionlj> buscarCancion(@PathVariable("id") Long id) {

		Optional<Cancionlj> cancion = cancionljRepository.findById(id);
		return cancion;
	}

	@RequestMapping("/api/canciones/eliminar/{id}")
	public String eliminarAlumno(@PathVariable("id") Long id) {

		cancionljRepository.deleteById(id);
		return "Cancion eliminada";
	}

}
