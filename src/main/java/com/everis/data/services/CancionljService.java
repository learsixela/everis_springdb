package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Cancionlj;
import com.everis.data.repositories.CancionljRepository;

@Service
public class CancionljService {

	@Autowired
	CancionljRepository cancionljRepository;

	// SERVICIO PARA GUARDAR
	public Cancionlj guardarCancion(Cancionlj cancion) {
		return cancionljRepository.save(cancion);
	}

	// SERVICIO PARA BORRAR
	public void deleteById(Long id) {
		cancionljRepository.deleteById(id);

	}

	// SERVICIO PARA ENCONTRAR PO ID

	public Optional<Cancionlj> findById(Long id) {
		Optional<Cancionlj> cancion = cancionljRepository.findById(id);
		return cancion;
	}

	// SERVICIO PARA ACTUALIZAR
	public void actualizarAlumno(@Valid Cancionlj cancion) {
		cancionljRepository.save(cancion);

	}

	// SERVICIO PARA TRAER TODAS LAS CANCIONES
	public List<Cancionlj> allCanciones() {
		return cancionljRepository.findAll();
	}

}
