package com.br.zup.estacionamento.modelo;

import java.util.Date;

public class Caixa {
	
	public double calcularTempoParadoNoEstacionamento(Date entrada, Date saida) {
		double minutos = 0;
		//logica para subtrair datas e devolver quantos minutos ficamos no estacionamento
		long milseg = saida.getTime() - entrada.getTime();
		double seg   = milseg/1000.0;
		minutos = seg/60.0;
		return minutos;
	}
	
	public double calcularQuantoVouPagarNoEstacionamento(double minutos) {
		double valorAPagar = 0;
		//logica para saber quanto temos que pagar
		return valorAPagar;
	}
	
	public double transformarMinutosEmHora(double minutos) {
		double horas = minutos/60;
		return horas;
	}
	
	
	
}
