package com.everis.data.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.data.models.Miranda;
import com.everis.data.services.MirandaService;

@Controller	
public class MirandaController {
	
	@Autowired
	MirandaService ServMiranda;
	
	@RequestMapping("/miranda")
	public String index(Model model) {
		List<Miranda> miranda_lista = ServMiranda.allMirandas();

		model.addAttribute("miranda", miranda_lista);
		return "/Miranda/indexMiranda.jsp";
	}
	
	@RequestMapping("/mirandas")
	public String mirandas(
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="apellido") String apellido){
				
				Miranda miranda = new Miranda();
				miranda.setNombre(nombre);
				miranda.setApellido(apellido);
				
				miranda = ServMiranda.guardarMiranda(miranda);
				
				return "redirect:/miranda";
				
			}
	
			@RequestMapping("/miranda/eliminar/{id}")
			public String eliminarMiranda(@PathVariable("id") Long id) {

				ServMiranda.deleteById(id);
				return "redirect:/miranda";
			}

			@RequestMapping("/miranda/editar/{id}")
			public String editarMiranda(@PathVariable("id") Long id, Model model) {
				Optional<Miranda> miranda = ServMiranda.findById(id);
				model.addAttribute("miranda", miranda);
				return "editarMiranda.jsp";
			}

			@RequestMapping("/miranda/actualizar/")
			public String actualizarAlumno(@Valid @ModelAttribute("miranda") Miranda miranda
			) {
				Optional<Miranda> miranda1 = ServMiranda.findById(miranda.getId());
				ServMiranda.actualizarMiranda(miranda);
				return "Miranda/indexMiranda.jsp";
			}
	

}