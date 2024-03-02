package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.repository.modelo.Matricula;
import com.uce.edu.repository.modelo.dto.DtoMatricula;
import com.uce.edu.repository.modelo.dto.DtoMatriculacion;
import com.uce.edu.repository2.IEstudianteRepository;
import com.uce.edu.repository2.IMateriaRepository;
import com.uce.edu.repository2.IMatriculaRepository;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMateriaRepository materiaRepository;
	
	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void matricular(DtoMatriculacion dtoMatriculacion) {
		// TODO Auto-generated method stub
		Materia mater = new Materia();
		Estudiante estud = new Estudiante();
	    Materia mate1 = this.materiaRepository.seleccionarporCodigo(mater.getCodigo());
	    Estudiante estu = this.estudianteRepository.seleccionarPorCedula(estud.getCedula());
	    List<Matricula> listaMatricula = new ArrayList<>();
	    
	    Materia mate2 = new Materia();
	    mate2.setCodigo(dtoMatriculacion.getCodigo1());
	    Matricula matri2= new Matricula();
	    matri2.setMateria(mate2);
	    listaMatricula.add(matri2);
	    
	    Materia mate3 = new Materia();
	    mate3.setCodigo(dtoMatriculacion.getCodigo3());
	    Matricula matri3= new Matricula();
	    matri3.setMateria(mate3);
	    listaMatricula.add(matri3);
	    
	    Materia mate4 = new Materia();
	    mate4.setCodigo(dtoMatriculacion.getCodigo4());
	    Matricula matri4= new Matricula();
	    matri4.setMateria(mate4);
	    listaMatricula.add(matri4);
	    
	    listaMatricula.parallelStream().forEach((matri) -> {
	        matri.setEstudiante(estu);
	        matri.setMateria(mate1);
	        matri.setFechaMatricula(LocalDateTime.now());
	        matri.setNombreHilo("Hilo");
	        this.matriculaRepository.insertar(matri);
	    });
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<DtoMatricula> buscarDTO() {
		// TODO Auto-generated method stub
		return this.matriculaRepository.seleccionarDTO();
	}

}
