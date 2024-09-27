package br.senac.rj.banco.modelo;

public class Conta {
	public int agencia;
	public int numero;
	public double saldo;
	
	public Conta(int n_agencia, int n_numero, double n_saldo ) {
		agencia = n_agencia;
		numero = n_numero;
		saldo = n_saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar(double valor) {
		double novoSaldo = saldo - valor;
		if (novoSaldo < 0)
			return false;
		saldo = novoSaldo;
		return true;
	}
	
}
