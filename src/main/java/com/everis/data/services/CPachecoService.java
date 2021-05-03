package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.CPacheco;
import com.everis.data.repositories.CPachecoRepository;

@Service
public class CPachecoService {
	@Autowired
	CPachecoRepository cpachecoRepository;
	
	public CPacheco guardar(CPacheco cpacheco) {
		
		return cpachecoRepository.save(cpacheco);
	}
	
	public List<CPacheco> allCPacheco(){
		return cpachecoRepository.findAll();
	}
	
	public void deleteById(Long id) {
		cpachecoRepository.deleteById(id);
	}
	
	public Optional<CPacheco> findById(Long id){
		Optional<CPacheco> oa = cpachecoRepository.findById(id);
		return oa;
	}
	
	public void actualizar(@Valid CPacheco cpacheco) {
		cpachecoRepository.save(cpacheco);
	}
}
