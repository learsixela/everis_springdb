package com.everis.data.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "perros")
public class Perro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 4, max = 30)
	private String nombre;
	@Min(1)
	@Max(20)
	private Long edad;
	@Size(min = 4, max = 30)
	private String raza;

	// constructor
	public Perro() {
	}

	public Perro(@Size(min = 4, max = 30) String nombre, @Min(50) Long edad, @Size(min = 4, max = 30) String raza) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}

	// getters, setters

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

	public Long getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}
