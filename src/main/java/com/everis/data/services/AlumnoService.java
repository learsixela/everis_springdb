package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Alumno;
import com.everis.data.repositories.AlumnoRepository;

@Service
public class AlumnoService {
	//inyeccion dependencia repository
	@Autowired
	AlumnoRepository alumnoRepository;

	public Alumno guardarAlumno(Alumno alumno) {
		
		return alumnoRepository.save(alumno);
	}

	public List<Alumno> allAlumnos() {
		return alumnoRepository.findAll();
	}

	public Optional<Alumno> findById(Long id) {
		Optional<Alumno> oa = alumnoRepository.findById(id);
		return oa;
	}

	public void deleteById(Long id) {
		alumnoRepository.deleteById(id);
	}

	public void actualizarAlumno(@Valid Alumno alumno) {
		// TODO Auto-generated method stub
		alumnoRepository.save(alumno);
	}

}
