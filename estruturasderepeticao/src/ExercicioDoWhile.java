import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Insira um número de 1 a 10: ");

		int numero = myObj.nextInt();
		int contador = 0;
		int resultado;


			if (numero > 10 || numero < 1) {
				System.out.println("Número fora do intervalo permitido.");

			} else {

				do {
					resultado = contador * numero;
					System.out.println(numero + " X " + contador + " = " + resultado);
					contador++;

				} while (contador <= 10);
			}
		}
	}

