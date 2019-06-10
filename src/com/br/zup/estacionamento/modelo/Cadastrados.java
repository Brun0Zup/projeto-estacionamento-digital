package com.br.zup.estacionamento.modelo;

public class Cadastrados {

	private String nomeDoVeiculo;
//	private String placa;

	// Construtor
	public Cadastrados(String nomeDoVeiculo) {
		super();
		this.nomeDoVeiculo = nomeDoVeiculo;
//		this.placa = placa;
	}

	// getters and setters
	public String getNomeDoVeiculo() {
		return nomeDoVeiculo;
	}

	public void setNomeDoVeiculo(String nomeDoVeiculo) {
		this.nomeDoVeiculo = nomeDoVeiculo;
	}
//	public String getPlaca() {
//		return placa;
//	}
//	public void setPlaca(String placa) {
//		this.placa = placa;
//	}

	public String toString() {
		String modelo = "";
		modelo += "O veiculo é um -> " + this.nomeDoVeiculo + "\n";
//		modelo += "A placa é -> " + this.getPlaca() + "\n";
		return modelo;
	}
}
