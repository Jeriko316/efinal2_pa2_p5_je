package com.uce.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.service.IEstudianteService;



@Controller
@RequestMapping("estudiantes")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	
	@GetMapping("/vistaEstudiante")
	public String vistaEstudiante(Estudiante estudiante) {
	return "vistaEstudiante";
	}
	
	@PostMapping("/guardar")
	public String guardar(Estudiante estudiante) {
		this.estudianteService.ingresar(estudiante);
		return "redirect:/estudiantes/vistaEstudiante";
	}
	
}
