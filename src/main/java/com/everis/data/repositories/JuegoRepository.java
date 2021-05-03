package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.data.models.Juego;

@Repository
public interface JuegoRepository extends CrudRepository<Juego, Long>
{
	List<Juego> findAll();
}
