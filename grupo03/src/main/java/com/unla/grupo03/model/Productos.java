package com.unla.grupo03.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter 
@Table(name = "Productos")
@NoArgsConstructor
public class Productos {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@Column(name="nombre", nullable=false, length=45)
		private String nombre;
		
		@Column(name="descripcion", nullable=false, length=45)
		private String descripcion;
		
		@Column(name="precio",  nullable=false)
		private double  precio;
		
		@Column(name="cantidad",  nullable=false)
		private double  cantidad;

		public Productos(String nombre, String descripcion, double precio, double cantidad) {
			super();
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.precio = precio;
			this.cantidad = cantidad;
		}

		@Override
		public String toString() {
			return "Productos [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
					+ cantidad + "]";
		}

	
		
		
		
		
}
