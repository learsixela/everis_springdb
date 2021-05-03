package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.data.models.CPacheco;

@Repository
public interface CPachecoRepository extends CrudRepository<CPacheco, Long> {

	List<CPacheco> findAll();

}
