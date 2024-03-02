package com.uce.edu.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="materia")
public class Materia {

	@Id
	@GeneratedValue(generator = "seq_materia",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_materia",sequenceName = "seq_materia", allocationSize = 1)
	@Column(name="mate_id")
	private Integer id;
	
	@Column(name="mate_nombre")
	private String nombre;
	
	@Column(name="mate_codigo")
	private String codigo;
	
	@Column(name="mate_numero_creditos")
	private Integer numeroCreditos;
	
	@Column(name="mate_cedula_profesor")
	private String cedulaProfesor;
	
	//MAPEO DE LA RELACION
	@OneToMany(mappedBy = "materia",fetch = FetchType.LAZY)
	private List<Matricula>matriculas;

	
	//GETTERNS AND SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}

	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}

	public String getCedulaProfesor() {
		return cedulaProfesor;
	}

	public void setCedulaProfesor(String cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	
}
