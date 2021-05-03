package com.everis.data.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.data.models.HerreraMascota;
import com.everis.data.services.HerreraMascotaService;


@Controller
public class HerreraHomeController {
	
	@Autowired
	HerreraMascotaService mascotaService;
	
	
	@RequestMapping("/HerreraLiberona")
	public String index(Model model) {
		List<HerreraMascota> mascota_lista = mascotaService.allMascotas();

		model.addAttribute("mascotas", mascota_lista);
		return "/HerreraLiberona/index.jsp";
	}

	
	

	
	
}
