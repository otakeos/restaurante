package com.br.restaurante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.restaurante.models.Produto;
import com.br.restaurante.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/produtos")
	public Iterable<Produto> getProdutos() {
		return produtoService.getProdutos();
	}

	@GetMapping("/produto/{id}")
	public Produto getProduto(@PathVariable int id) {
		return produtoService.getProduto(id);
	}
	
	@PostMapping("/cadastro")
	public Produto setProduto(@RequestBody Produto produto) {
		produtoService.setProduto(produto);
		return produto;
	}

	@DeleteMapping("/exclusao/{id}") 
	public void delProduto(@PathVariable int id) {
		produtoService.delProduto(id);
	}
	
}
