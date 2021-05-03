package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.MartinezModel;
import com.everis.data.repositories.MartinezRepository;

@Service
public class MartinezServices {
	@Autowired
	MartinezRepository martinezRepository;

	public MartinezModel guardarMartinez(MartinezModel martinez) {
		
		return martinezRepository.save(martinez);
	}

	public List<MartinezModel> allMartinez() {
		return martinezRepository.findAll();
	}

	public Optional<MartinezModel> findById(Long id) {
		Optional<MartinezModel> oa = martinezRepository.findById(id);
		return oa;
	}

	public void deleteById(Long id) {
		martinezRepository.deleteById(id);
	}

	public void actualizarMartinez(@Valid MartinezModel martinez) {
		// TODO Auto-generated method stub
		martinezRepository.save(martinez);
	}

}
