package operacoesaritimeticas;

import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Opera��o de divis�o");
		System.out.println("Digite o primeiro valor");
		float numero01 = leia.nextFloat();
		System.out.println("Digite o segundo valor");
		float numero02 = leia.nextFloat();

		// Processamento de dados
		float resultado = numero01 / numero02;

		// Sa�da de dados
		System.out.println("O resultado da opera��o � :" + resultado);
		leia.close();
	}

}
