package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.data.models.Miranda;

@Repository
public interface MirandaRepository extends CrudRepository<Miranda, Long> {
	
	List<Miranda> findAll();

}