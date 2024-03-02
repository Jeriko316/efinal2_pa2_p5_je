package com.uce.edu.repository.modelo.dto;

public class DtoMatricula {
	private String codigo;
	
	private String cedula;
	
	private String nombre;
	
	private String fecha;

	public DtoMatricula(String cedula, String codigo, String fecha, String nombre) {
		super();
		this.cedula = cedula;
		this.codigo = codigo;
		this.fecha = fecha;
		this.nombre = nombre;
	}
	
	public DtoMatricula() {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

	
}
