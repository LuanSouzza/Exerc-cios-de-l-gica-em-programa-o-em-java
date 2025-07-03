package faccat;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do raio do círculo em cm.");
		float raio = leia.nextFloat();

		double area = 3.14f * (raio * raio);

		System.out.printf("A area do círculo é de: " + area + " cm²");
		leia.close();

	}
}
