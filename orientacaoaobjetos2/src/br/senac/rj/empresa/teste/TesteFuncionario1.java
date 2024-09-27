package br.senac.rj.empresa.teste;

import br.senac.rj.empresa.modelo.Funcionario;

public class TesteFuncionario1 {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.registro = 123;
		funcionario1.nome = "Eduardo";
		funcionario1.cargo = 1;
		funcionario1.salario = 5000;
		
		System.out.println("Registro: "+ funcionario1.registro +"\n"
		+"Nome: "+funcionario1.nome+"\n"
		+"Cargo: "+funcionario1.cargo+"\n"
		+"Salario antes da bonificação: "+funcionario1.salario);
		
		System.out.println("Valor da bonificação: "+funcionario1.aplicarBonificacao(funcionario1.cargo));
		System.out.println("Salário após bonificação: "+funcionario1.salario);
		

	}

}
