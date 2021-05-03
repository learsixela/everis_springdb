package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.data.models.Perro;

@Repository
public interface ArayaRepository extends CrudRepository<Perro, Long>{

	List<Perro> findAll();
	
}
