package faccat;

import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do lado do quadrado em cm.");
		int lado = leia.nextInt();

		int area = lado * lado;
		System.out.println("A area do quadrado é de: " + area + " cm²");
		leia.close();
	}

}
