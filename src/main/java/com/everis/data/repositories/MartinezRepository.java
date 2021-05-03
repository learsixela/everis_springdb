package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.data.models.MartinezModel;

@Repository
public interface MartinezRepository extends CrudRepository<MartinezModel, Long> {
	
	List<MartinezModel> findAll();
	
}
