package com.uce.edu.repository2;

import com.uce.edu.repository.modelo.Materia;

public interface IMateriaRepository {

	public void insertar(Materia materia);

	public Materia seleccionarporCodigo(String codigo);
	
}
