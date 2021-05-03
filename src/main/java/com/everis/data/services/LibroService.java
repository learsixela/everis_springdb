package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Libro;
import com.everis.data.repositories.LibroRepository;

@Service
public class LibroService {
	@Autowired //inyeccion de dependencia
	LibroRepository librorepository;
	
	public Libro guardarLibro(Libro libro) {
		return librorepository.save(libro);
	}

	public List<Libro> traerLibros() {
		return librorepository.findAll();
	}

	public Optional<Libro> traerLibroPorId(Long id) {
		return librorepository.findById(id);
	}

	public void deleteById(Long id) {
		librorepository.deleteById(id);
	}

	public void actualizarLibro(@Valid Libro libro) {
		librorepository.save(libro);
	}
}
