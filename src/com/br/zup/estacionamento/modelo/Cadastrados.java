package com.br.zup.estacionamento.modelo;

public class Cadastrados {
	
	private String nomeDoVeiculo;
	
	//Construtor 
	public Cadastrados(String nomeDoVeiculo) {
		super();
		this.nomeDoVeiculo = nomeDoVeiculo;
	}
	
	//getters and setters 
	public String getNomeDoVeiculo() {
		return nomeDoVeiculo;
	}

	public void setNomeDoVeiculo(String nomeDoVeiculo) {
		this.nomeDoVeiculo = nomeDoVeiculo;
	}

	
}
