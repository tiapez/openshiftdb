package com.ale.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ale.openshift.model.Contatti;
import com.ale.openshift.model.Contatto;
import com.ale.openshift.service.ContattiService;

@RestController
public class ServiceRestController {
	
	@Autowired
	private ContattiService cs;
	
	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Ale","Rossi","ale"));
		lista.add(new Contatto("Anna","Verdi","anna"));
		lista.add(new Contatto("Carlo","Neri","carlo"));
		lista.add(new Contatto("Paolo","Bianchi","paolo"));
		
		return lista;
		
	}
	
	@RequestMapping("testdb")
	public List<Contatti> serviceTestDatabase(){
		List<Contatti> lista = cs.findAllContatti();

		
		return lista;
		
	}


}
