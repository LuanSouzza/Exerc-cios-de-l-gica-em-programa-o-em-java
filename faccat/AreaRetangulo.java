package faccat;

import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor da base do retângulo em cm.");
		int base = leia.nextInt();

		System.out.println("Digite o valor da altura do retângulo em cm.");
		int altura = leia.nextInt();

		int area = base * altura;

		System.out.println("A area do retângulo é de: " + area + " cm²");
		leia.close();
	}
}
