package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.data.models.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long>{

	List<Alumno> findAll();
	
}
