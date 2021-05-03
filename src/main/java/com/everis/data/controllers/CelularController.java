package com.everis.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.data.models.Celular;
import com.everis.data.services.CelularService;


@Controller
@RequestMapping("/celular")
public class CelularController {
	
	@Autowired
	CelularService celularService;
	
	@RequestMapping("")
	public String index(Model model) {
		return "/palma/index.jsp";
	}
	
	@RequestMapping("/guardar")
	public String mostrar(@RequestParam(value="numero") String numero,
			@RequestParam(value="marca") String marca,
			Model model) {
		
		Celular celular= new Celular();
		celular.setNumero(numero);
		celular.setMarca(marca);
		
		celularService.save(celular);
		List<Celular> celulares_lista = celularService.findAll();
		model.addAttribute("celulares", celulares_lista);
		
		return "/palma/mostrar.jsp";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarCelular(@PathVariable("id") Long id) {
		if(celularService.findById(id)!= null) {
			celularService.delete(celularService.findById(id));
			return "/palma/mostrar.jsp";
		}
		
		return "redirect:/celular";
	}
}
