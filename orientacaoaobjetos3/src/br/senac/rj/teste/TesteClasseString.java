package br.senac.rj.teste;

public class TesteClasseString {

	public static void main(String[] args) {
		String nome = " Ricardo ";
		int idade = 20;
		System.out.println("nome = " + nome);
		char posicao3 = nome.charAt(3);
		boolean vazio = nome.isEmpty();
		Boolean emBranco = nome.isBlank();
		int tamanho = nome.length();
		String parte = nome.substring(0,4);
		String minuscula = nome.toLowerCase();
		String maiuscula = nome.toUpperCase();
		String semEspacos = nome.trim();
		String converteString = String.valueOf(idade);
		System.out.println("posicao3 = " + posicao3);
		System.out.println("vazio = " + vazio);
		System.out.println("em branco = " + emBranco);
		System.out.println("tamanho = " + tamanho);
		System.out.println("parte = " + parte);
		System.out.println("minuscula = " + minuscula);
		System.out.println("maiscula = " + maiuscula);
		System.out.println("semEspaços = " + semEspacos);
		System.out.println("tamanho de converteString = " + converteString.length());
		System.out.println("nome = \"RICARDO\" = " + nome.trim().toUpperCase().equals("RICARDO"));
	}

}
