package faccat;

import java.util.Scanner;

public class ConversorDeTemperatura {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor da temperatura em Fahrenheit");
		float grausF = leia.nextFloat();

		float grausC = (grausF - 32) / 9 * 5;

		System.out.println("o valor da temperatura informada em graus celsius é de: " + grausC + "°");

		leia.close();
	}
}
