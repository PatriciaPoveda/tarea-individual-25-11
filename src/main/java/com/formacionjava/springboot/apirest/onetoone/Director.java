package com.formacionjava.springboot.apirest.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Director {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String nombre;
	@Column
	private String apellido;
	
	@OneToOne
	@JoinColumn(name = "pelicula_id")
	
	private Pelicula pelicula;
	
	//Getter y Setter
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

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	
}
