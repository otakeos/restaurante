package com.br.restaurante.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.restaurante.models.Produto;
import com.br.restaurante.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Iterable<Produto> getProdutos() {
		return produtoRepository.findAll();
	}
	
	public Produto getProduto(int id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		if (produto.isPresent()) {
			return produto.get();			
		}
		return null;
	}
	
	public Produto setProduto(Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	public void delProduto(int id) {
		produtoRepository.deleteById(id);
	}

}
