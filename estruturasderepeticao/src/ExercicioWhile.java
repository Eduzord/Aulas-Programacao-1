import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Informe um numero de 1 a 10");

		int numero = myObj.nextInt();
		int contador = 0;
		int resultado;

		if (numero > 10 || numero < 1) {
			System.out.println("Numero fora do intervalo permitido.");
		} else {
			while (contador <= 10) {
				resultado = numero * contador;
				System.out.println(numero+" X "+contador+" = "+resultado);
				contador++;
			}
		}
	}

}
