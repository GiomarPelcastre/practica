package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.PuestosModel;
import com.example.demo.services.PuestoService;

@RestController
@RequestMapping("/puestos")
public class PuestoController {
	
@Autowired	
PuestoService puestoService;


@GetMapping
public ArrayList<PuestosModel> obtenerPuestos(){
	return puestoService.obtenerPuestos();
}

@GetMapping("/query")
public ArrayList<PuestosModel> obtenerPuestoNombre(@RequestParam("nombre") String nombre){
	return puestoService.obtenerPuestos(nombre);
}

@GetMapping(path = "/{id}")
public Optional<PuestosModel> obtenerPuestoId(@PathVariable("id") Long id){
	return this.puestoService.getPuesto(id);
}


@PostMapping
public PuestosModel guardarPuesto(@RequestBody PuestosModel puesto) {
	return puestoService.guardar(puesto);
}


@DeleteMapping(path = "/{id}")
public boolean eliminarPuesto(@PathVariable("id") Long id) {
	
	
	
	return puestoService.deletePuesto(id);
	
	
}


}
