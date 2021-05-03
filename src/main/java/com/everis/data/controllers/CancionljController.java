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

import com.everis.data.models.Cancionlj;
import com.everis.data.services.CancionljService;

@Controller
public class CancionljController {

	@Autowired
	CancionljService cancionljService;

	// PAGINA PRINCIPAL

	@RequestMapping("/")
	public String index(Model model) {
		List<Cancionlj> cancion_lista = cancionljService.allCanciones();

		model.addAttribute("canciones", cancion_lista);
		return "jimenez/index.jsp";
	}

	// RUTA PARA GUARDAR
	@RequestMapping("/canciones")
	public String canciones(@RequestParam(value = "nombreCancion") String nombreCancion,
			@RequestParam(value = "nombreArtista") String nombreArtista) {
		System.out.println(nombreCancion + " - " + nombreArtista);

		Cancionlj cancion = new Cancionlj();
		cancion.setNombreCancion(nombreCancion);
		cancion.setNombreArtista(nombreArtista);

		cancion = cancionljService.guardarCancion(cancion);

		return "redirect:/";
	}

	// RUTA PARA ELIMINAR
	@RequestMapping("/canciones/eliminar/{id}")
	public String eliminarCancion(@PathVariable("id") Long id) {

		cancionljService.deleteById(id);
		return "redirect:/";
	}

	// RUTA PARA EDITAR

	@RequestMapping("/canciones/editar/{id}")
	public String editarCancion(@PathVariable("id") Long id, Model model) {
		Optional<Cancionlj> cancion = cancionljService.findById(id);
		model.addAttribute("cancion", cancion);
		return "jimenez/editar.jsp";
	}

	// RUTA PARA ACTUALIZAR
	@RequestMapping("/cancion/actualizar/")
	public String actualizarCancion(@Valid @ModelAttribute("cancionlj") Cancionlj cancionlj

	) {
		Optional<Cancionlj> cancion1 = cancionljService.findById(cancionlj.getId());
		cancionljService.actualizarAlumno(cancionlj);
		return "redirect:/";
	}

}
