package faccat;

import java.util.Scanner;

public class Antecessor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro");
		int numero = leia.nextInt();
		int antecessor = numero - 1;

		System.out.println("O antecessor de " + numero + " � " + antecessor);

		leia.close();
	}
}
