package faccat;

import java.util.Scanner;

public class AlcoolOuGasolina {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite A para abastecer com álcool ou G para gasolina");
		String combustivel = leia.nextLine();

		if (combustivel.equalsIgnoreCase("A")) {
			System.out.println("Digite quantos litros de álcool você irá abastecer");
			float litro = leia.nextFloat();
			if (litro <= 20) {
				float preco = (float) ((2.90 - 3 / 100) * litro);
				System.out.println("O valor a pagar é de: R$" + preco);
			} else {
				float preco = (float) ((2.90 - 5 / 100) * litro);
				System.out.println("O valor a pagar é de: R$" + preco);
			}
		} else if (combustivel.equalsIgnoreCase("G")) {
			System.out.println("Digite quantos litros de gasolina você irá abastecer");
			float litro = leia.nextFloat();
			if (litro <= 20) {
				float preco = (float) ((3.30 - 3 / 100) * litro);
				System.out.println("O valor a pagar é de: R$" + preco);
			} else {
				float preco = (float) ((3.30 - 5 / 100) * litro);
				System.out.println("O valor a pagar é de: R$" + preco);
			}
		} else {
			System.out.println("esse tipo de combustível não está disponível");
		}
		leia.close();
	}
}
