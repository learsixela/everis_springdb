package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.data.models.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long>{
	List<Libro> findAll(); //se sobreescribe el get
}
