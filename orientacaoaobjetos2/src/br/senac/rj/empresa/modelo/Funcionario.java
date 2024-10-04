package br.senac.rj.empresa.modelo;

public class Funcionario {
	public int registro;
	public String nome;
	public int cargo;
	public double salario;
	
	public double aplicarBonificacao() {
		double valorBonificacao;
		switch (cargo) {
		case 1:
			valorBonificacao = salario * 0.2; 			
						
			break;
		case 2:
			valorBonificacao = salario * 0.4; 
						
			break;
		case 3:
			valorBonificacao = salario * 0.6; 
			
			break;

		default:
			valorBonificacao = 0;
			
			break;
		}
		salario = salario + valorBonificacao;
		return valorBonificacao;
	}
	
}

