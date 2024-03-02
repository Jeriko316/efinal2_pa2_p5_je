package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="matricula")
public class Matricula {

	
	@SequenceGenerator(name = "seq_matricula",sequenceName = "seq_matricula", allocationSize = 1)
	@GeneratedValue(generator = "seq_matricula",strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name="matri_id")
	private Integer id;
	
	@Column(name="fecha_matricula")
	private LocalDateTime fechaMatricula;
	
	@Column(name="nombre_hilo")
	private String nombreHilo;
	
	//relacion sub tabla de muchos a muchos se crea una tabla extra
	@ManyToOne
	@JoinColumn(name = "matri_materia")
	private Materia materia;
	
	@ManyToOne
	@JoinColumn(name = "matri_estudiante")
	private Estudiante estudiante;

	//getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	
	
}
