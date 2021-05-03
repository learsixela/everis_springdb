package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.data.models.LagosPelicula;

@Repository
public interface LagosPeliculaRepository extends CrudRepository<LagosPelicula, Long>{
	List<LagosPelicula> findAll();
}
