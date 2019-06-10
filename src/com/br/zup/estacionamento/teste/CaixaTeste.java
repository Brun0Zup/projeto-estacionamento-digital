package com.br.zup.estacionamento.teste;

import java.util.Calendar;
import java.util.Scanner;

import com.br.zup.estacionamento.modelo.Caixa;
import com.br.zup.estacionamento.modelo.Carro;

public class CaixaTeste {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Caixa caixa = new Caixa();
		Carro carroZup  = new Carro();
		
		Calendar calendario = Calendar.getInstance();
		
		System.out.println("Que dia do mês você entrou? ");
		calendario.set(Calendar.DAY_OF_MONTH, entrada.nextInt());
		
		System.out.println("Que mês você entrou?");
		calendario.set(Calendar.MONTH, entrada.nextInt());
		
		System.out.println("Que ano você entrou?");
		calendario.set(Calendar.YEAR, entrada.nextInt());
		
		System.out.println("Qual a hora que você entrou? ");
		calendario.set(Calendar.HOUR_OF_DAY, entrada.nextInt());
		
		System.out.println("Que minuto você entrou? ");
		calendario.set(Calendar.MINUTE, entrada.nextInt());
		
		System.out.println("Qual o segundo você entrou? ");
		calendario.set(Calendar.SECOND, entrada.nextInt());
		
		calendario.set(Calendar.MILLISECOND, 0);
		
		carroZup.setEntrada(calendario.getTime());
		System.out.println("O Carro da Zup entrou: " + carroZup.getEntrada());
		
		Calendar calendarioSaida = Calendar.getInstance();
		calendarioSaida.set(Calendar.DAY_OF_MONTH, 9);
		calendarioSaida.set(Calendar.MONTH, 5);
		calendarioSaida.set(Calendar.YEAR, 2019);
		calendarioSaida.set(Calendar.HOUR_OF_DAY, 13);
		calendarioSaida.set(Calendar.MINUTE, 32);
		calendarioSaida.set(Calendar.SECOND, 10);
		calendarioSaida.set(Calendar.MILLISECOND, 0);
		carroZup.setSaida(calendarioSaida.getTime());
		
		System.out.println("O Carro da Zup saiu: " + carroZup.getSaida());
		
		double quantosMinutosParado = caixa.calcularTempoParadoNoEstacionamento(
				carroZup.getEntrada(), carroZup.getSaida());
		
		double quantasHorasParado = caixa.transformarMinutosEmHora(quantosMinutosParado);
		System.out.println("O carro ficou parado " + quantosMinutosParado + " minutos");
		System.out.println("O carro ficou parado " + quantasHorasParado + " Horas");
		
		
		
	}
}
