package faccat;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor da base do triângulo em cm.");
		float base = leia.nextFloat();
		
		System.out.println("Digite o valor da altura do triângulo em cm.");
		float altura = leia.nextFloat();

		double area = (base * altura) / 2;

		System.out.printf("A area do triângulo é de: " + area + " cm²");
		leia.close();

	}
}
