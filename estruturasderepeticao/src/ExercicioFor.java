import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Informe um número: ");
		
		int numero = myObj.nextInt();
		if (numero > 10 || numero < 1) {
			System.out.println("Número fora do intervalo permitido.");
		} else {
			for(int contador=0;contador <= 10;contador++) {
				System.out.println(numero+" X "+contador +" = " + (numero*contador));
				
			}
		}

	}

}
