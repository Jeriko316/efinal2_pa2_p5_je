package com.uce.edu.repository2;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Matricula;
import com.uce.edu.repository.modelo.dto.DtoMatricula;
import com.uce.edu.repository.modelo.dto.DtoMatriculacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Matricula matriculas) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matriculas);

	}

	@Override
	public List<DtoMatricula> seleccionarDTO() {
		// TODO Auto-generated method stub
		TypedQuery<DtoMatricula>query= this.entityManager.createQuery("Select new com.uce.edu.repository.modelo.dto(m.estudiante.cedula,m.materia.codigo,m.fechaMatricula,m.nombreHilo) from Matricula m",DtoMatricula.class);
		return query.getResultList();
	}
	

}
