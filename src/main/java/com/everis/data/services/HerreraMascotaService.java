package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.HerreraMascota;
import com.everis.data.repositories.HerreraMascotaRepository;

@Service
public class HerreraMascotaService {
	
	@Autowired
	HerreraMascotaRepository mascotaRepository;

	public HerreraMascota guardarMascota(HerreraMascota mascota) {
		// TODO Auto-generated method stub
		return mascotaRepository.save(mascota);
	}

	public List<HerreraMascota> allMascotas() {
		// TODO Auto-generated method stub
		return mascotaRepository.findAll();
	}

	public void deleteById(Long id) {
		mascotaRepository.deleteById(id);
		
	}

	public Optional<HerreraMascota> findById(Long id) {
		// TODO Auto-generated method stub
		return mascotaRepository.findById(id);
	}

	public void actualizarMascota(@Valid HerreraMascota mascota) {
	
			mascotaRepository.save(mascota);
		
	}

}
