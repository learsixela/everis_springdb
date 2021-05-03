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

import com.everis.data.models.CPacheco;
import com.everis.data.services.CPachecoService;

@Controller
public class CPachecoController {
	
	@Autowired
	CPachecoService cpachecoService;
	
	@RequestMapping("/cpacheco")
	public String datos(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="apellido") String apellido) {
		
		CPacheco cpacheco = new CPacheco();
		cpacheco.setNombre(nombre);
		cpacheco.setApellido(apellido);
		
		cpacheco = cpachecoService.guardar(cpacheco);
		
		return "redirect:/";
	}
	
	@RequestMapping("/cpacheco/eliminar/{id}")
	public String eliminar(@PathVariable("id") Long id) {
		cpachecoService.deleteById(id);
		return "redirect:/";
	}
	
	@RequestMapping("/cpacheco/editar/{id}")
	public String editar(@PathVariable("id") Long id,
			Model model) {
		Optional<CPacheco> cpacheco = cpachecoService.findById(id);
		model.addAttribute("cpacheco", cpacheco);
		return "CPacheco/editar.jsp";
	}
	
	@RequestMapping("/cpacheco/actualizar/")
	public String actualizar(@Valid @ModelAttribute("cpacheco") CPacheco cpacheco) {
		cpachecoService.actualizar(cpacheco);
		return "redirect:/";
	}

}
