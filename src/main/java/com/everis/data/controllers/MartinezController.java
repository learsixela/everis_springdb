package com.everis.data.controllers;

import java.util.Optional;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.everis.data.models.MartinezModel;
import com.everis.data.repositories.MartinezRepository;
import com.everis.data.services.MartinezServices;



@Controller
public class MartinezController {
	@Autowired
	MartinezServices martinezService;
	@RequestMapping("/martinez")
	
	public String martinez(@RequestParam(value="nombre") String nombre) {	
		MartinezModel martinez= new MartinezModel();
		martinez.setNombre(nombre);
		martinez = martinezService.guardarMartinez(martinez);	
		return "redirect:/api/martinez";
	}
	
	@RequestMapping("/martinez/eliminar/{id}")
	public String eliminarMartinez(@PathVariable("id") Long id) {
		martinezService.deleteById(id);
		return "redirect:/api/martinez";
	}

	@RequestMapping("/martinez/editar/{id}")
	public String editarMartinez(@PathVariable("id") Long id,
			Model model) {
		Optional<MartinezModel> martinez = martinezService.findById(id);
		model.addAttribute("martinez", martinez);
		return "/martinez/editMartinez.jsp";
	}
	
	@RequestMapping("/martinez/actualizar/")
	public String actualizarMartinez(@Valid @ModelAttribute("martinez") MartinezModel martinez
			) {
		Optional<MartinezModel> ma = martinezService.findById(martinez.getId());
		martinezService.actualizarMartinez(martinez);
		return "redirect:/";
	}

}
