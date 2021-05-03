package com.everis.data.controllers;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.data.models.LagosPelicula;
import com.everis.data.services.LagosPeliculaService;

@Controller
public class LagosPeliculasController {
	@Autowired
	LagosPeliculaService movieService;
	
	@RequestMapping("/dpeliculas")
	public String index(Model model) {
		List<LagosPelicula> movies = movieService.allMovies();

		model.addAttribute("movies", movies);
		return "dlagos/index.jsp";
	}
	
	@RequestMapping("/dpeliculas/agregar")
	public String peliculas(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="categoria") String categoria,
			@RequestParam(value="precio") Integer precio) {
		
		LagosPelicula pelicula = new LagosPelicula();
		pelicula.setNombre(nombre);
		pelicula.setCategoria(categoria);
		pelicula.setPrecio(precio);
		
		pelicula = movieService.addMovie(pelicula);
		
		return "redirect:/dpeliculas";
	}
	
	@RequestMapping("dpeliculas/eliminar/{id}")
	public String deleteMovie(@PathVariable("id") Long id) {
	
		movieService.deleteMovie(id);
		return "redirect:/dpeliculas";
	}
	
	
	@RequestMapping("dpeliculas/actualizar/")
	public String updateMovie(@RequestParam(value="idEdit") Long id,
			@RequestParam(value="nombreEdit") String nombre,
			@RequestParam(value="categoriaEdit") String categoria,
			@RequestParam(value="precioEdit") Integer precio) {
		movieService.updateMovie(id, nombre, categoria, precio);
		return "redirect:/dpeliculas";
	}
			
}
