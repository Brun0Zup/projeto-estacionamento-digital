package com.br.zup.estacionamento.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

//teste
public class Sistema {

	public static void main(String[] args) {
	
		//Criar carro
		Carro carZup = new Carro();
		Moto motoZuper = new Moto();
		Cadastrados cadastros = new Cadastrados(null);
		List<Cadastrados> cadastradosEstacionamento = new ArrayList<Cadastrados>();
		int controle = 1;
		while (controle == 1) {
			Scanner scan = entrada();
			Scanner scan1 = entrada();
			
			System.out.println("(0) Para sair\n"
					+ "(1) Deseja adicionar um carro\n"
					+ "(2) Deseja adicionar uma moto\n"
					+ "(3)  Para imprimir a lista\n");
			int opcao = scan.nextInt();
			
			if(opcao == 1) {
//			
				System.out.println("Insira o veiculo novamente:");
				cadastros.setNomeDoVeiculo(scan.next());
				
//				Scanner sc = new Scanner(System.in);
				
				System.out.println("Que dia voce entrou? ");
				byte diaCar = scan1.nextByte();
				System.out.println("Que hora voce entrou? ");
				byte horaCar = scan1.nextByte();
				System.out.println("Que min voce entrou? ");
				byte minCar = scan1.nextByte();
				
				//Entrar com o carro
				Calendar calendario = Calendar.getInstance();
				calendario.set(Calendar.DAY_OF_MONTH, diaCar);
				calendario.set(Calendar.HOUR_OF_DAY, horaCar);
				calendario.set(Calendar.MINUTE, minCar);
				
				//Registra a hora de entrada
				carZup.setEntrada(calendario.getTime());
				//mostrar o horario de entrado do carro
				System.out.println("O carro entrou as " + carZup.getEntrada());
				
				//Sair com o carro 
				System.out.println("Que dia voce saiu? ");
				diaCar = scan1.nextByte();
				System.out.println("Que hora voce saiu? ");
				horaCar = scan1.nextByte();
				System.out.println("Que min voce saiu? ");
				minCar = scan1.nextByte();
				
				Calendar calendario2 = Calendar.getInstance();
				//Registra a hora de saida
				calendario2.set(Calendar.DAY_OF_MONTH, 1);
				calendario2.set(Calendar.HOUR_OF_DAY, 10);
				calendario2.set(Calendar.MINUTE, 36);
				carZup.setSaida(calendario2.getTime());
				//mostrar o horario de saida 
				System.out.println("O carro saiu as " + carZup.getSaida());
				
//				Cadastrados cadastrados = new Cadastrados(veiculo);
//				System.out.println(cadastrados);
				cadastros.getNomeDoVeiculo();
				cadastradosEstacionamento.add(cadastros);
				
				
			
			}else if (opcao == 2) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Que dia voce entrou? ");
				byte dia = sc.nextByte();
				System.out.println("Que hora voce entrou? ");
				byte hora = sc.nextByte();
				System.out.println("Que min voce entrou? ");
				byte min = sc.nextByte();
				
				Calendar calendarioMoto = Calendar.getInstance();
				calendarioMoto.set(Calendar.DAY_OF_MONTH, dia);
				calendarioMoto.set(Calendar.HOUR_OF_DAY, hora);
				calendarioMoto.set(Calendar.MINUTE, min);
				
				motoZuper.setEntrada(calendarioMoto.getTime());
				System.out.println("A moto entrou as " + motoZuper.getEntrada());
				
				//Pegando dados da saida
				System.out.println("Que dia voce saiu? ");
				dia = sc.nextByte();
				System.out.println("Que hora voce saiu? ");
				hora = sc.nextByte();
				System.out.println("Que min voce saiu? ");
				min = sc.nextByte();
				
				calendarioMoto.set(Calendar.DAY_OF_MONTH, dia);
				calendarioMoto.set(Calendar.HOUR_OF_DAY, hora);
				calendarioMoto.set(Calendar.MINUTE, min);
				
				motoZuper.setSaida(calendarioMoto.getTime());
				System.out.println("A moto saiu as " + motoZuper.getSaida());
			}else if (opcao == 3) {
				for (Cadastrados cadastrados : cadastradosEstacionamento) {
					System.out.println(cadastrados);
				}
			}else if(opcao == 4) {
				
			}
		}
		
		
// Tempo calculado do carro no shopping
		Caixa caixaShopping = new Caixa();
		long tempoNoShopping = (long)caixaShopping.calcularTempoParadoNoEstacionamento(carZup.getEntrada(), carZup.getSaida());
		System.out.println("O carro ficou " + tempoNoShopping + " minutos");
		//Mostrar quanto custou a saida
		double valorPago = caixaShopping.calcularQuantoVouPagarNoEstacionamento(tempoNoShopping);
		System.out.println("Foi pago o valor de " + valorPago);
		
		
	// tempo calculado da moto no shopping	
		
		tempoNoShopping = (long)caixaShopping.calcularTempoParadoNoEstacionamento(motoZuper.getEntrada(), motoZuper.getSaida());
		System.out.println("A Moto ficou " + tempoNoShopping + " minutos");
		System.out.println(tempoNoShopping);
		
		//Mostrar quanto custou a saida
		valorPago = caixaShopping.calcularQuantoVouPagarNoEstacionamento(tempoNoShopping);
		System.out.println("Foi pago o valor de " + valorPago);
	
	}	
	
	 public static Scanner entrada() {
	 Scanner scan = new Scanner(System.in);
	 return scan;
	}
	 
}
