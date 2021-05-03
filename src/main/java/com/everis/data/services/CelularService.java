package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Celular;
import com.everis.data.repositories.CelularRepository;

@Service
public class CelularService {
	@Autowired
	CelularRepository celularRepository;

	public List<Celular> findAll() {
		return celularRepository.findAll();
	}

	public Celular findById(Long id) {
		Optional<Celular> celu=  celularRepository.findById(id);
		if(celu.isPresent()) {
			return celu.get();
		}else {
			return null;
		}
	}

	public void save(Celular celular) {
		celularRepository.save(celular);
	}

	public void delete(Celular celular) {
		celularRepository.delete(celular);
		
	}
}
