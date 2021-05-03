package com.everis.data.models;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
@Entity
@Table(name="martinez")
public class MartinezModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min=4,max= 50)
	private String nombre;
	
	
	public MartinezModel() {
		super();
	}
	
	public MartinezModel(Long id, @Size(min = 4, max = 50) String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
