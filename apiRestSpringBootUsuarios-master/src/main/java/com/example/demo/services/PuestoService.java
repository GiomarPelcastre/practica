package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.PuestosModel;
import com.example.demo.repositories.PuestosRepository;

@Service
public class PuestoService {
	
	@Autowired
	PuestosRepository puestosRepository;
	
	
	public PuestosModel guardar(PuestosModel puesto) {		
		return puestosRepository.save(puesto);
	}

	
	public Optional<PuestosModel> getPuesto(long id){
		return puestosRepository.findById(id);
	}
	
	
	public ArrayList<PuestosModel> obtenerPuestos(){
		return (ArrayList<PuestosModel>) puestosRepository.findAll();
	}
	
	
	public ArrayList<PuestosModel> obtenerPuestos(String nombre){
		return  puestosRepository.findByNombre(nombre);
	}
	
	
	public boolean deletePuesto(Long id) {
		try {
			puestosRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	
}






