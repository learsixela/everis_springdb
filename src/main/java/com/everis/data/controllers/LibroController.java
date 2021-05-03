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

import com.everis.data.models.Libro;
import com.everis.data.services.LibroService;


@Controller
public class LibroController {
	@Autowired //reemplaza el codigo de arriba
	LibroService librosService;
	
	@RequestMapping("/libros/agregar")
	public String libros(@RequestParam(value="nombreForm")String nombreBack,
			@RequestParam(value="autorForm")String autorBack,
			Model model) {
		
		Libro libro = new Libro(); //instancia de la clase
		libro.setNombre(nombreBack);
		libro.setAutor(autorBack);
		
		libro = librosService.guardarLibro(libro); //aca se crea el metodo guardar libro	
		return "redirect:/libros";
		//return "redirect:/librossaludo"; esto sirve para redireccionar
	}
	
	@RequestMapping("libros/eliminar/{id}")
	public String eliminarLibro(@PathVariable("id") Long id) {
		librosService.deleteById(id);
		return "redirect:/libros";
	}
	
	@RequestMapping("libros/editar/{id}") //aca se trae la data solamente
	public String editarLibro(@PathVariable("id") Long id, Model model) {
		Optional <Libro> libro = librosService.traerLibroPorId(id);
		model.addAttribute("libro", libro);
		return "quiroz/editar.jsp";
	}
	
	@RequestMapping("libro/actualizar/") //aca se cambia
	public String actualizarLibro(@Valid @ModelAttribute("libro") Libro libro) {
		librosService.actualizarLibro(libro);
		return "redirect:/libros";
	}
}
