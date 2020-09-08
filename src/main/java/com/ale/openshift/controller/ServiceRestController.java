package com.ale.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ale.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Ale","Rossi","ale"));
		lista.add(new Contatto("Anna","Verdi","anna"));
		lista.add(new Contatto("Carlo","Neri","carlo"));
		lista.add(new Contatto("Paolo","Bianchi","paolo"));
		
		return lista;
		
	}


}
