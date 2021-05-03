package com.everis.data.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")
public class Usuario {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Size(min=4,max= 50)
		private String nombre;
		@Size(min=4,max= 50)
		private String apellido;
		@Size(min=8,max=9)
		private String rut;
		@Size(min=4,max= 50)
		private String cargo;
		
		public Usuario() {}

		public Usuario(@Size(min = 4, max = 50) String nombre, @Size(min = 4, max = 50) String apellido,
				@Size(min = 8, max = 9) String rut, @Size(min = 4, max = 50) String cargo) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.rut = rut;
			this.cargo = cargo;
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

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getRut() {
			return rut;
		}

		public void setRut(String rut) {
			this.rut = rut;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		
		
}
