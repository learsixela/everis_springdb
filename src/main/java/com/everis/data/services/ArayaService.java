package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Perro;
import com.everis.data.repositories.ArayaRepository;

@Service
public class ArayaService {
	// inyeccion dependencia repository
	@Autowired
	ArayaRepository perroRepository;

	public Perro guardarPerro(Perro perro) {

		return perroRepository.save(perro);
	}

	public List<Perro> allPerros() {
		return perroRepository.findAll();
	}

	public Optional<Perro> findById(Long id) {
		Optional<Perro> opt = perroRepository.findById(id);
		return opt;
	}

	public void deleteById(Long id) {
		perroRepository.deleteById(id);
	}

	public void actualizarPerro(@Valid Perro perro) {
		// TODO Auto-generated method stub
		perroRepository.save(perro);
	}

}
