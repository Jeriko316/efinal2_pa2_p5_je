package com.uce.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.dto.DtoMatricula;
import com.uce.edu.repository.modelo.dto.DtoMatriculacion;
import com.uce.edu.service.IMatriculaService;



@Controller
@RequestMapping(value = "/matriculas")
public class MatriculaController {
	
	@Autowired
	private IMatriculaService matriculaService;
	
	@GetMapping("/vistaMatricula")
	public String vistaMatricula(DtoMatriculacion dtoMatriculacion) {
	return "vistaMatricula";
	}
	
	@PostMapping("/matricular")
	public String matricular(DtoMatriculacion dtoMatriculacion) {	
		this.matriculaService.matricular(dtoMatriculacion);
		return "redirect:/matriculas/vistaMatricula";	
	}
	
	@GetMapping("/vistaListaMatricula")
	public  String listaMatricula(Model model) {
		List<DtoMatricula>DtoMatricula= this.matriculaService.buscarDTO();
		model.addAttribute("DtoMatricula",DtoMatricula);
		return "vistaListaMatricula";
		
	}
	
}
