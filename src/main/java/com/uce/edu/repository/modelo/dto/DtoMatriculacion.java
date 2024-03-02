package com.uce.edu.repository.modelo.dto;

public class DtoMatriculacion {
	private String Codigo1;
	
	private String Codigo2;
	
	private String Codigo3;
	
	private String Codigo4;
	
	private String cedula;

	public DtoMatriculacion(String cedula, String codigo1, String codigo2, String codigo3, String codigo4) {
		super();
		this.cedula = cedula;
		Codigo1 = codigo1;
		Codigo2 = codigo2;
		Codigo3 = codigo3;
		Codigo4 = codigo4;
	}
	public DtoMatriculacion() {
	}
	public String getCodigo1() {
		return Codigo1;
	}
	public void setCodigo1(String codigo1) {
		Codigo1 = codigo1;
	}
	public String getCodigo2() {
		return Codigo2;
	}
	public void setCodigo2(String codigo2) {
		Codigo2 = codigo2;
	}
	public String getCodigo3() {
		return Codigo3;
	}
	public void setCodigo3(String codigo3) {
		Codigo3 = codigo3;
	}
	public String getCodigo4() {
		return Codigo4;
	}
	public void setCodigo4(String codigo4) {
		Codigo4 = codigo4;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
