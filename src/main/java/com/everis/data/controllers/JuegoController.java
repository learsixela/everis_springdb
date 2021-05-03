package com.everis.data.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.data.models.Alumno;
import com.everis.data.models.Juego;
import com.everis.data.services.JuegoService;

@Controller
@RequestMapping("/juegos")
public class JuegoController {
	
	@Autowired
	JuegoService juegoService;
	@RequestMapping("")
	public String indexJuego(Model model) {
		
    	List<Juego> juego_lista = juegoService.allJuegos();
    	model.addAttribute("juegos", juego_lista);
    	
		return "/parada/indexjuego.jsp";
	}
	
	@RequestMapping("/guardar")
	public String juegos(
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="clasificacion") String clasificacion,
			@RequestParam(value="genero") String genero
			) {
		
		Juego juego = new Juego();
		System.out.println(nombre);
		juego.setNombre(nombre);
		juego.setClasificacion(clasificacion);
		juego.setGenero(genero);
		
		juego = juegoService.guardarJuego(juego);
		
		return "redirect:/juegos";
	}
	
	//Eliminar	
	@RequestMapping("/juegos/eliminar/{id}")
	public String eliminarJuego(
			@PathVariable("id") Long id) {
		juegoService.deleteById(id);
		return "redirect:/juegos";
	}
	//Editar
	@RequestMapping("parada/juegos/editarjuego/{id}")
	public String editarJuego(
			@PathVariable("id") Long id, 
			Model model) {
		Optional <Juego> juego = juegoService.findById(id);
		model.addAttribute("juego",juego);
		return "redirect:/juegos";
	}
	//Actualizar
	@RequestMapping("/juegos/actualizar/{id}")
	public String actualizar(
			@ModelAttribute("juego") Juego juego) {
		juegoService.actualizarJuego(juego);
		return "redirect:/juegos";
	}

}
