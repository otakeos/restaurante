package com.br.restaurante.repositories;

import org.springframework.data.repository.CrudRepository;

import com.br.restaurante.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
