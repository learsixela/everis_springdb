package com.everis.data.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity 
@Table(name="dlagospeliculas")
public class LagosPelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremento id
	private Long id;
	@Size(min=4,max=50)
	private String nombre;
	@Size(min=4,max=50)
	private String categoria;
	@Max(999999)
	@Min(1)
	private Integer precio;
	
	 // Esto no permitirá que el campo createdAt sea modificado después de su creación.
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

	public LagosPelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LagosPelicula(Long id, @Size(min = 4, max = 50) String nombre, @Size(min = 4, max = 50) String categoria,
			@Max(999999) @Min(1) Integer precio, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
	// Otros getters y setters fueron removidos para resumir
	   @PrePersist
	   protected void onCreate(){
	       this.createdAt = new Date();
	   }
	   @PreUpdate
	   protected void onUpdate(){
	       this.updatedAt = new Date();
	   }
}
