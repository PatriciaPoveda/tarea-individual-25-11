package com.formacionjava.springboot.apirest.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.formacionjava.springboot.apirest.onetomany.Universidad;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre_alumno;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "universidad_id", nullable = false)
	
	private Universidad universidad;
	
	private static final long serialVersionUID = 1L;
}
