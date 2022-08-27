package com.br.restaurante.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Comanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDaComanda;
	@OneToOne
	@JoinColumn(name = "idDoProduto")
	private Produto Produto;
	private int qtdProduto;
	private double totalProduto;
	
	public Comanda() {
		
	}

	public Comanda(int idDaComanda, com.br.restaurante.models.Produto produto, int qtdProduto, double totalProduto) {
		super();
		this.idDaComanda = idDaComanda;
		Produto = produto;
		this.qtdProduto = qtdProduto;
		this.totalProduto = totalProduto;
	}

	public int getIdDaComanda() {
		return idDaComanda;
	}

	public void setIdDaComanda(int idDaComanda) {
		this.idDaComanda = idDaComanda;
	}

	public Produto getProduto() {
		return Produto;
	}

	public void setProduto(Produto produto) {
		Produto = produto;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public double getTotalProduto() {
		return totalProduto;
	}

	public void setTotalProduto(double totalProduto) {
		this.totalProduto = totalProduto;
	}
	
}
