package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.repository2.IMateriaRepository;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class MateriaServiceImpl implements IMateriaService{


	@Autowired
	private IMateriaRepository materiaRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void ingresar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(materia);
	}

}
