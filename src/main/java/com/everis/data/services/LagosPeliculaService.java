package com.everis.data.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.LagosPelicula;
import com.everis.data.repositories.LagosPeliculaRepository;

@Service
public class LagosPeliculaService {
	@Autowired
	LagosPeliculaRepository movieRepository;
	// CREATE - CREAR
	public LagosPelicula addMovie(LagosPelicula pelicula) {
		return movieRepository.save(pelicula);
	}
	
	// READ - LEER
	public List<LagosPelicula> allMovies(){
		return movieRepository.findAll();
	}
	
	// UPDATE - ACTUALIZAR
	public @Valid LagosPelicula updateMovie(Long id, String nombre, String categoria, Integer precio){
		LagosPelicula movieToUpdate = movieRepository.findById(id).get();
		movieToUpdate.setNombre(nombre);
		movieToUpdate.setCategoria(categoria);
		movieToUpdate.setPrecio(precio);
		return movieRepository.save(movieToUpdate);
	}
	
	// DELETE - ELIMINAR
	public void deleteMovie(Long id){
		movieRepository.deleteById(id);
	}
	
}
