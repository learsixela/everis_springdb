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

import com.everis.data.models.HerreraMascota;
import com.everis.data.services.HerreraMascotaService;



@Controller
public class HerreraMascotaController {

	
	@Autowired
	HerreraMascotaService mascotaService;
	
	
	@RequestMapping("/mascota")
	public String mascota(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="tipo") String tipo,
			@RequestParam(value="raza") String raza,
			@RequestParam(value="edad") String edad) {

		
		HerreraMascota mascota= new HerreraMascota();
		mascota.setNombre(nombre);
		mascota.setTipo(tipo);
		mascota.setRaza(raza);
		mascota.setEdad(Integer.parseInt(edad));
		
		mascota = mascotaService.guardarMascota(mascota);
		
		return "redirect:/HerreraLiberona/";
	}
	
	
	@RequestMapping("/mascota/eliminar/{id}")
	public String eliminaMascota(@PathVariable("id") Long id) {
	
		mascotaService.deleteById(id);
		return "redirect:/HerreraLiberona/";
	}
	
	@RequestMapping("/mascota/editar/{id}")
	public String editarMascota(@PathVariable("id") Long id,
			Model model) {
		Optional<HerreraMascota> mascota = mascotaService.findById(id);
		model.addAttribute("mascota", mascota);
		return "/HerreraLiberona/editar.jsp";
	}
	
	@RequestMapping("/mascota/actualizar/")
	public String actualizarMascota(@Valid @ModelAttribute("mascota") HerreraMascota mascota
			) {
		Optional<HerreraMascota> mascota1 = mascotaService.findById(mascota.getId());
		mascotaService.actualizarMascota(mascota);
		return "redirect:/HerreraLiberona/";
	}
	
	
}
