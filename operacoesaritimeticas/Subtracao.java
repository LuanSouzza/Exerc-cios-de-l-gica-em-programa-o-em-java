package operacoesaritimeticas;

import java.util.Scanner;

public class Subtracao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Operação de subtração.");
		
		System.out.println("Digite o primeiro valor.");
		int numero01 = leia.nextInt();
		System.out.println("Digite o segundo valor.");
		int numero02 = leia.nextInt();
		
	
		int resultado = numero01 - numero02;
		
		
		System.out.println("O resultado da subtração é : " + resultado);
		leia.close();
	}

}
