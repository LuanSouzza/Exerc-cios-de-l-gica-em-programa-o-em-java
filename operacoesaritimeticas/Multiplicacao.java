package operacoesaritimeticas;

import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Opera��o de multiplica��o.");
		
		//Entrada de dados
		System.out.println("Digite o primeiro valor");
		int numero01 = leia.nextInt();
		System.out.println("Digite o segundo valor");
		int numero02 = leia.nextInt();
		
		//Processamento de dados
		int resultado = numero01 * numero02;
		
		//Sa�da de dados
		System.out.println("O resultado a multiplica��o �: " + resultado);
		leia.close();
	}
}
