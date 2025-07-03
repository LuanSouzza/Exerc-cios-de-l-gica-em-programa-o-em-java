package faccat;

import java.util.Scanner;

public class AreaTrapezio {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor da base Maior do trápezio em cm.");
		float baseMaior = leia.nextFloat();

		System.out.println("Digite o valor da base  Menor do trápezio em cm.");
		float baseMenor = leia.nextFloat();

		System.out.println("Digite o valor da altura do trápezio em cm.");
		float altura = leia.nextFloat();

		double area = ((baseMaior + baseMenor) * altura) / 2;

		System.out.printf("A area do trápezio é de: " + area + " cm²");
		leia.close();

	}

}
