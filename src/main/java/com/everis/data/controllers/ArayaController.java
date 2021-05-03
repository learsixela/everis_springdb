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

import com.everis.data.models.Perro;
import com.everis.data.services.ArayaService;

@Controller
public class ArayaController {

	// servicio
	@Autowired
	ArayaService perroService;

	/**
	 * Retorna todos los usuarios
	 */
	@RequestMapping("/perros")
	public String index(Model model) {
		List<Perro> allPerros = perroService.allPerros();
		model.addAttribute("allPerros", allPerros);
		return "araya/list.jsp";
	}

	/**
	 * Retorna la pagina de registro
	 */
	@RequestMapping("/perros/new")
	public String newPerro(Model model) {
		Perro perro = new Perro();
		model.addAttribute("perro", perro);
		return "araya/new.jsp";
	}

	/**
	 * Retorna la pagina de registro
	 */
	@RequestMapping("/perros/create")
	public String create(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="raza") String raza,
			@RequestParam(value="edad") String edad) {
		// crear usuario y retorna id
		Perro perro = new Perro(nombre, Long.parseLong(edad), raza);
		perroService.actualizarPerro(perro);
		return "redirect:/perros/";
	}

	/**
	 * Retorna la pagina de registro
	 */
	@RequestMapping("/perros/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Optional<Perro> perroExists = perroService.findById(id);
		if (perroExists != null) {
			model.addAttribute("perro", perroExists);
			return "araya/edit.jsp";
		}
		return "araya/list.jsp";
	}

	/**
	 * Retorna la pagina de editar usuario, devuelve el usuario con los nuevos
	 * cambios si tiene exito
	 */
	@RequestMapping("/perros/update")
	public String update(@Valid @ModelAttribute("perro") Perro perro) {
		System.out.println(perro.toString());
		Long id = perro.getId();
		Optional<Perro> perroExists = perroService.findById(id);
		if (perroExists != null) {
			perroService.actualizarPerro(perro);
			return "redirect:/perros/";
		}

		return "redirect:/perros/edit/" + id;
	}

	/**
	 * Retorna la pagina de mostrar usuario
	 */
	@RequestMapping("/perros/show/{id}")
	public String show(@PathVariable Long id, Model model) {
		Optional<Perro> perroExists = perroService.findById(id);
		if (perroExists != null) {
			Perro perro = perroExists.get();
			model.addAttribute("nombre", perro.getNombre());
			model.addAttribute("raza", perro.getRaza());
			model.addAttribute("edad", perro.getEdad());
			return "araya/show.jsp";
		}
		return "redirect:/perros";
	}

	/**
	 * Elimina usuario y vuelve a la lista
	 */
	@RequestMapping("/perros/delete/{id}")
	public String del(@PathVariable Long id, Model model) {
		perroService.deleteById(id);
		return "redirect:/perros";
	}

}
