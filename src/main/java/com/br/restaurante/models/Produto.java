package com.br.restaurante.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDoProduto;	
	@NonNull
	private String nomeDoProduto;
	@NonNull
	private double precoDoProduto;

	public Produto() {
		
	}
	
	public Produto(int idDoProduto, @NonNull String nomeDoProduto, @NonNull double precoDoProduto) {
		super();
		this.idDoProduto = idDoProduto;
		this.nomeDoProduto = nomeDoProduto;
		this.precoDoProduto = precoDoProduto;
	}

	public int getIdDoProduto() {
		return idDoProduto;
	}

	public void setIdDoProduto(int idDoProduto) {
		this.idDoProduto = idDoProduto;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public double getPrecoDoProduto() {
		return precoDoProduto;
	}

	public void setPrecoDoProduto(double precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}
	
}
