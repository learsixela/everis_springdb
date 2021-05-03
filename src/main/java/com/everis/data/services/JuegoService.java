package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Juego;
import com.everis.data.repositories.JuegoRepository;

@Service
public class JuegoService {
	@Autowired
	JuegoRepository juegoRepository;

	public Juego guardarJuego(Juego juego) {
		return juegoRepository.save(juego);
	}
	
	public List<Juego> allJuegos(){
		return juegoRepository.findAll();
	}

	public Optional<Juego> findById(Long id) {
		Optional<Juego> jo = juegoRepository.findById(id);
		return jo;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		juegoRepository.deleteById(id);
	}

	public void actualizarJuego(Juego juego) {
		// TODO Auto-generated method stub
		juegoRepository.save(juego);
		
	}
}
