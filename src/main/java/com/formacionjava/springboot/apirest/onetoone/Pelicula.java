package com.formacionjava.springboot.apirest.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pelicula {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String nombre_pelicula;
	
	@OneToOne(mappedBy = "pelicula")
	private Director director;
	
	//Getter y Setter
	public String getNombre_pelicula() {
		return nombre_pelicula;
	}

	public void setNombre_pelicula(String nombre_pelicula) {
		this.nombre_pelicula = nombre_pelicula;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	
}
