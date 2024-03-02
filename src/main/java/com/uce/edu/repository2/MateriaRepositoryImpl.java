package com.uce.edu.repository2;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	public Materia seleccionarporCodigo(String codigo) {
		TypedQuery<Materia>query= this.entityManager.createQuery("Select m from Materia m WHERE m.codigo=:datoCodigo",Materia.class);
		query.setParameter("datoCodigo",codigo);
		try {
			return  query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}

}
