package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository2.IEstudianteRepository;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void ingresar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);

	}

}
