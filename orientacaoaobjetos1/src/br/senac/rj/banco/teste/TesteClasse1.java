package br.senac.rj.banco.teste;

import java.util.Scanner;

import br.senac.rj.banco.modelo.Conta;

public class TesteClasse1 {
	public static void main(String[] args) {
//		Conta conta1 = new Conta();
//		conta1.agencia = 1;
//		conta1.numero = 100;
//		conta1.saldo = 200;
//		System.out.println("Saldo inicial =" + conta1.saldo);
//		int valorDeposito = 10;
//		conta1.depositar(valorDeposito);
//		System.out.println("Valor do depósito = " + valorDeposito);
//		System.out.println("Saldo após o depósito = " + conta1.saldo);
		Scanner input_agencia = new Scanner(System.in);
		Scanner input_numero = new Scanner(System.in);
		Scanner input_saque = new Scanner(System.in);
		
		// Coleta de inputs do usuário
		System.out.println("Informe um nº de Agência");
		int n_agencia = input_agencia.nextInt();
		
		System.out.println("Informe um nº de Conta");		
		int n_numero = input_numero.nextInt();
		
		System.out.println("Informe um Saldo inicial");
		double n_saque = input_saque.nextDouble();
		
		//Instanciando a classe utilizando os inputs do usuário
		Conta conta1 = new Conta(n_agencia,n_numero,n_saque);	
		
		System.out.println("Saldo inicial =" + conta1.saldo);
		int valorDeposito = 10;
		conta1.depositar(valorDeposito);;
		System.out.println("Valor do depósito = " + valorDeposito);
		System.out.println("Saldo após o depósito = " + conta1.saldo);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor para sacar: ");
		
		double valorSaque = input.nextDouble();
//		int valorSaque = 10000;
		System.out.println("Valor do saque = " + valorSaque);
		if (conta1.sacar(valorSaque)) {
			System.out.println("Saldo após o saque = " + conta1.saldo);
		}else {
			System.out.println("Não foi possível efetuar o saque");
		}
	}

}
