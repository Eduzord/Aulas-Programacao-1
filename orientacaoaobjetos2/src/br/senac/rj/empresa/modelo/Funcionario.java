package br.senac.rj.empresa.modelo;

public class Funcionario {
	public int registro;
	public String nome;
	public int cargo;
	public double salario;
	
	public double aplicarBonificacao(int cargo) {
		double valorBonificacao;
		switch (cargo) {
		case 1:
			valorBonificacao = salario * 0.2; 
			salario = salario + valorBonificacao;
						
			break;
		case 2:
			valorBonificacao = salario * 0.4; 
			salario = salario + valorBonificacao;
						
			break;
		case 3:
			valorBonificacao = salario * 0.6; 
			salario = salario + valorBonificacao;
			
			break;

		default:
			valorBonificacao = 0;
			
			break;
		}
		return valorBonificacao;
	}
	
}

