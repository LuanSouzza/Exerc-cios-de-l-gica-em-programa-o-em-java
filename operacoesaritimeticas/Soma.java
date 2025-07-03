package operacoesaritimeticas;

import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Operação soma.");
		//Entrada de dados:
		System.out.println("Digite o primeiro valor da soma.");
		int numero1 = leia.nextInt();
		System.out.println("Digite o segundo valor da soma.");
		int numero2 = leia.nextInt();
		
		//Processamento de dados:
		int resultado = numero1 + numero2;
		
		//Saída de dados:
		System.out.println("O resultado da soma é: " + resultado);
		leia.close();
	}
}

