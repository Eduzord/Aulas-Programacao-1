package br.senac.rj.empresa.teste;

import java.util.Scanner;

import br.senac.rj.empresa.modelo.Funcionario;

public class TesteFuncionario1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String continuar = "S";
		do {
		Funcionario func1 = new Funcionario();
		
		System.out.println("Informe um número de registro pro funcionário: ");
		func1.registro = Integer.parseInt(input.nextLine());
		
		System.out.println("Informe o nome do funcionário: ");
		func1.nome = input.nextLine();
		
		System.out.println("Informe o cargo do funcionário: ");
		func1.cargo = Integer.parseInt(input.nextLine());
		
		System.out.println("Informe o salário do funcionário: ");
		func1.salario = Double.parseDouble(input.nextLine());
		
		System.out.println("Salário = " + func1.salario);
		func1.aplicarBonificacao();
		System.out.println("O novo salário de " + func1.nome + " é " + func1.salario);
		do {
			System.out.println("Deseja continuar? S/N");
			continuar = input.nextLine();
			continuar = continuar.toUpperCase();
			if (!continuar.equals("S") && !continuar.equals("N")) {
				System.out.println("Opção Inválida!");
			}
		} while (!continuar.equals("S") && !continuar.equals("N"));
		
		} while(!continuar.equals("N"));
	}
}
