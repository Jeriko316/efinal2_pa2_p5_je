package com.uce.edu.repository2;

import java.util.List;

import com.uce.edu.repository.modelo.Matricula;
import com.uce.edu.repository.modelo.dto.DtoMatricula;
import com.uce.edu.repository.modelo.dto.DtoMatriculacion;

public interface IMatriculaRepository {

	public void insertar(Matricula matriculas);

	public List<DtoMatricula> seleccionarDTO();

}
