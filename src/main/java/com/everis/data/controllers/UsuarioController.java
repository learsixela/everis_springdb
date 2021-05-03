package com.everis.data.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;

import com.everis.data.models.Usuario;
import com.everis.data.services.UsuarioService;

@Controller
@RequestMapping("/user")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("")
	public String Usuario() {
		return "usuarios.jsp";
	}
	
	@RequestMapping("/usuario")
	public String usuarios(@RequestParam(value ="nombre") String nombre,
			@RequestParam(value ="apellido") String apellido,
			@RequestParam(value ="rut") String rut,
			@RequestParam(value ="cargo") String cargo){
		
		Usuario user = new Usuario();
		user.setNombre(nombre);
		user.setApellido(apellido);
		user.setRut(rut);
		user.setCargo(cargo);
		
		user = usuarioService.guardarUser(user);
		
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/tabla_usuarios")
	public String listaUsuarios(Model modelo){
		  ArrayList<Usuario> userList = new ArrayList<Usuario>();
		  userList = (ArrayList<Usuario>)usuarioService.allUsers();
		  int largo = userList.size();
		  modelo.addAttribute("userList",userList);
		  modelo.addAttribute("largo", largo);
		  return "daniel/userlist.jsp";
	}	
	
	@RequestMapping("/usuarios/editar/{id}")
	public String editarUsuarios(@PathVariable("id") Long id, Model model){
		Optional<Usuario> usuario = usuarioService.findById(id);
		model.addAttribute("usuario",usuario);
		System.out.println("Funcion Edit");
		return "daniel/userEditForm.jsp";
	}
	
	@RequestMapping("/usuarios/eliminar/{id}")
	public String eliminarUsuarios(@PathVariable("id") Long id) {
		usuarioService.deleteById(id);
		return "redirect:/tabla_usuarios";
	}
	@RequestMapping("/usuario/actualizar/")
	public String actualizarUsuario(@Valid @ModelAttribute("usuario") Usuario user) {
		//Optional<Usuario> usuario = usuarioService.findById(user.getId());
		usuarioService.actualizarUsuario(user);
		return "redirect:/";
	}
	
}
