package faccat;

import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor da base do ret�ngulo em cm.");
		int base = leia.nextInt();

		System.out.println("Digite o valor da altura do ret�ngulo em cm.");
		int altura = leia.nextInt();

		int area = base * altura;

		System.out.println("A area do ret�ngulo � de: " + area + " cm�");
		leia.close();
	}
}
