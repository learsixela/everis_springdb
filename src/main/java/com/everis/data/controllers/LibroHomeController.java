package com.everis.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.data.models.Libro;
import com.everis.data.services.LibroService;

@Controller
public class LibroHomeController {
	@Autowired
	LibroService libroService;
	
	@RequestMapping("/libros")
	public String index(Model model) {
		List<Libro> libros_lista = libroService.traerLibros();
		model.addAttribute("libros_lista", libros_lista);
		return "quiroz/index.jsp";
	}
}
