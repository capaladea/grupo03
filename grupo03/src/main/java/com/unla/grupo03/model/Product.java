package com.unla.grupo03.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "producto")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre",nullable=false,length=45)
	private String nombre;

	@Column(name = "descripcion",nullable=false,length=45)
	private String descripcion;

	@Column(name = "activo")
	private boolean activo;

	@Column(name = "precio")
	private double precio;

	public Product(int id, String nombre, String descripcion, boolean activo, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
		this.precio = precio;
	}

}
