package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Usuario;
import com.everis.data.repositories.UsuariosRepository;

@Service
public class UsuarioService {
		@Autowired
		UsuariosRepository userRepository;
		public Usuario guardarUser(Usuario usuario){
			return userRepository.save(usuario);
		}
		public List<Usuario> allUsers(){
			return userRepository.findAll();
		}
		public Optional<Usuario> findById(Long id) {
			Optional<Usuario> user = userRepository.findById(id);
			return user;
		}
		public void deleteById(Long id) {
			userRepository.deleteById(id);
		}
		public void actualizarUsuario(@Valid Usuario usuario) {
			userRepository.save(usuario);
		}

		
}
