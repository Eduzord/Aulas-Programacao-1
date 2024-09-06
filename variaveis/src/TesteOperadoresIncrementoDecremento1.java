
public class TesteOperadoresIncrementoDecremento1 {
	public static void main(String[] args) {
		System.out.println("Pré-fixado");
		int x = 5;
		System.out.println("x = "+ x);
		// incrementando o valor de x pré-fixado
		System.out.println("++x = "+ ++x);
		// imprimindo o valor de x após instrução
		System.out.println("x = "+ x);
		// decrementando o valor de x pré-fixado
		System.out.println("--x = "+ --x);
		// imprimindo o valor de x após instrução
		System.out.println("x = "+ x);
		System.out.println("Pós-fixado");
		// incrementado o valor de x pós fixado
		System.out.println("x++ = " + x++);
		// imprimindo o valor de x após instrução
		System.out.println("x = " + x);
		// decrementando o valor de x pós fixado
		System.out.println("x-- = " + x--);
		// imprimindo o valor de x após instrução
		System.out.println("x = " + x);
		
	}
}
