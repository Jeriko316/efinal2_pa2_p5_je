package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.dto.DtoMatricula;
import com.uce.edu.repository.modelo.dto.DtoMatriculacion;

public interface IMatriculaService {

	public void matricular(DtoMatriculacion dtoMatriculacion);

	public List<DtoMatricula> buscarDTO();

}
