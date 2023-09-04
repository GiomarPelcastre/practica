package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.PuestosModel;

public interface PuestosRepository extends CrudRepository<PuestosModel, Long>{
	
	public abstract ArrayList<PuestosModel> findByNombre(String nombre);

}
