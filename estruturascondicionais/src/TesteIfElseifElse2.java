import java.util.Scanner;

public class TesteIfElseifElse2 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Digite o salário: ");

		float salario = myObj.nextFloat();
		// O input de casas decimais respeita o sistema operacional, ou seja
		// Deve-se entrar as casas decimais com , e não .

		// float salario = 3000.66f;
		float valorIR = 0f;
		float salarioLiquido = 0;
		if (salario <= 2826.66f) {
			System.out.println("O total de IR a ser pago é R$ 0,00");
			System.out.println("O salário líquido é R$" + salario);
		} else if ((salario > 2826.66f) && (salario <= 3751.05f)) {
			valorIR = (salario * 0.15f);
			salarioLiquido = salario - valorIR - 354.80f;
			System.out.println("O total de IR a ser pago é R$ " + valorIR + " e a alíquota é de 15%");
			System.out.println("O salário líquido é R$" + salarioLiquido);
		} else if ((salario > 3751.06f) && (salario <= 4664.68f)) {
			valorIR = (salario * 0.225f);
			salarioLiquido = salario - valorIR - 636.13f;
			System.out.println("O total de IR a ser pago é R$ " + valorIR + " e a alíquota é de 22.5%");
			System.out.println("O salário líquido é R$" + salarioLiquido);
		} else {
			valorIR = (salario * 0.275f);
			salarioLiquido = salario - valorIR - 869.36f;
			System.out.println("O total de IR a ser pago é R$ " + valorIR + " e a alíquota é de 27.5%");
			System.out.println("O salário líquido é R$" + salarioLiquido);
		}
		System.out.println((salarioLiquido > 20000) ? "Salário de diretor":"Salário de funcionário normal.");

	}

}
