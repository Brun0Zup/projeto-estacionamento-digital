package com.br.zup.estacionamento.modelo;

public class Vagas {
	
	private String TipoVaga;
	private boolean EstaDisponivel;
	private int VagaIdosos;
	private int VagaMotos;
	private int VagaDef;
	public Vagas(String tipoVaga, boolean estaDisponivel, int vagaIdosos, int vagaMotos, int vagaDef) {
		super();
		TipoVaga = tipoVaga;
		EstaDisponivel = estaDisponivel;
		VagaIdosos = vagaIdosos;
		VagaMotos = vagaMotos;
		VagaDef = vagaDef;
	}
	public String getTipoVaga() {
		return TipoVaga;
	}
	public void setTipoVaga(String tipoVaga) {
		TipoVaga = tipoVaga;
	}
	public boolean isEstaDisponivel() {
		return EstaDisponivel;
	}
	public void setEstaDisponivel(boolean estaDisponivel) {
		EstaDisponivel = estaDisponivel;
	}
	public int getVagaIdosos() {
		return VagaIdosos;
	}
	public void setVagaIdosos(int vagaIdosos) {
		VagaIdosos = vagaIdosos;
	}
	public int getVagaMotos() {
		return VagaMotos;
	}
	public void setVagaMotos(int vagaMotos) {
		VagaMotos = vagaMotos;
	}
	public int getVagaDef() {
		return VagaDef;
	}
	public void setVagaDef(int vagaDef) {
		VagaDef = vagaDef;
	}
	
	@Override
	public String toString() {
		String modelo = "";
		modelo += "Qual é o tipo desta vaga -> " + this.getTipoVaga();
		modelo += "Essa vaga está livre -> " + this.isEstaDisponivel();
		return modelo;
	}
}
	

 