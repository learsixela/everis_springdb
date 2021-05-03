package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.everis.data.models.Cancionlj;

public interface CancionljRepository extends CrudRepository<Cancionlj, Long> {

	List<Cancionlj> findAll();
}
