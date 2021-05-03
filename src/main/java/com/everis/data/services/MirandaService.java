package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Miranda;
import com.everis.data.repositories.MirandaRepository;

@Service
public class MirandaService {
	
	@Autowired
	MirandaRepository repoMiranda;
	
	public Miranda guardarMiranda(Miranda miranda) {
		return repoMiranda.save(miranda);
	}

	public List<Miranda> allMirandas() {
		return repoMiranda.findAll();
	}

	public Optional<Miranda> findById(Long id) {
		Optional<Miranda> oa = repoMiranda.findById(id);
		return oa;
	}

	public void deleteById(Long id) {
		repoMiranda.deleteById(id);
	}

	public void actualizarMiranda(@Valid Miranda miranda) {
		// TODO Auto-generated method stub
		repoMiranda.save(miranda);
	}

	
}

