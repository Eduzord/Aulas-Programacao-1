import java.util.Scanner;
public class fibo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Até qual posição da sequência você quer gerar?");
		
		int quantidade = input.nextInt();		
		int fibonacci = 1;
		int anterior = 0;
		String sequencia = "";
		for (int x = 1; x <= quantidade;x++) {
//			System.out.println(fibonacci);
			sequencia = sequencia + fibonacci + " ";
			int temp = anterior;
			anterior = fibonacci;
			fibonacci = temp + fibonacci;
		}
		System.out.println(sequencia);
	}

}
