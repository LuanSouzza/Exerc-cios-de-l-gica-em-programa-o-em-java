package faccat;

import java.util.Scanner;

public class AreaTrapezio {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor da base Maior do tr�pezio em cm.");
		float baseMaior = leia.nextFloat();

		System.out.println("Digite o valor da base  Menor do tr�pezio em cm.");
		float baseMenor = leia.nextFloat();

		System.out.println("Digite o valor da altura do tr�pezio em cm.");
		float altura = leia.nextFloat();

		double area = ((baseMaior + baseMenor) * altura) / 2;

		System.out.printf("A area do tr�pezio � de: " + area + " cm�");
		leia.close();

	}

}
