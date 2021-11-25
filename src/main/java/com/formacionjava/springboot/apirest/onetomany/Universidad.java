package com.formacionjava.springboot.apirest.onetomany;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.formacionjava.springboot.apirest.manytoone.Alumno;

@Entity
@Table(name = "universidad")
public class Universidad implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;

	
	@OneToMany(mappedBy = "universidad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set <Alumno> peliculas;
	
	private static final long serialVersionUID = 1L;
}
