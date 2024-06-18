package com.unla.grupo03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.grupo03.model.AlertaFaltantes;
import com.unla.grupo03.repository.AlertaFaltantesRepository;

@Service
public class AlertaFaltantesServiceImpl implements AlertaFaltantesService {

	@Autowired
	private AlertaFaltantesRepository datos;
	
	@Override
	public List<AlertaFaltantes> listar() {
				
		System.out.println(datos.findAll());
		
		return (List<AlertaFaltantes>) datos.findAll();
	}

}
