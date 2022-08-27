package com.br.restaurante.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.restaurante.repositories.ComandaRepository;
import com.br.restaurante.repositories.ProdutoRepository;

@Service
public class ComandaService {

	@Autowired
	public ComandaRepository comandaRepository;
	
	@Autowired
	public ProdutoRepository produtoRepository;
	

	


}
