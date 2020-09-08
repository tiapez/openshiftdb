package com.ale.openshift.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ale.openshift.model.Contatti;
import com.ale.openshift.repository.ContattiRepository;

@Service("contattiService")
public class ContattiServiceImpl implements ContattiService{
	@Autowired
	private ContattiRepository c;
	
	@Override
	public List<Contatti> findAllContatti() {
		// TODO Auto-generated method stub
		return c.findAll();
	}

}
