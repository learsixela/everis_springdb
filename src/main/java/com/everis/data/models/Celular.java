package com.everis.data.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="celulares")
public class Celular {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;
	private String marca;
	
	public Celular() {}
	
	public Celular(String numero, String marca) {
		super();
		this.numero = numero;
		this.marca = marca;
	}
	
	public String getNumero() {
		return numero;
	}
	public String getMarca() {
		return marca;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}

