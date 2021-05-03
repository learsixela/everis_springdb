package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.data.models.HerreraMascota;


@Repository
public interface HerreraMascotaRepository extends CrudRepository<HerreraMascota, Long> {

	List<HerreraMascota> findAll();
}
