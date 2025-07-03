package faccat;

import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("informe no nome do produto.");
		String nome = leia.nextLine();

		System.out.println("informe a quantidade que você deseja comprar.");
		float quantidade = leia.nextFloat();

		System.out.println("digite o valor da unidade do produto solicitado.");
		float valorUnitario = leia.nextFloat();

		float valorTotal = quantidade * valorUnitario;

		if (quantidade <= 5) {
			valorTotal = valorTotal - ((2 / 100) * valorTotal);
		} else if (quantidade > 5 && quantidade <= 10) {
			valorTotal = valorTotal - ((3 / 100) * valorTotal);
		} else {
			valorTotal = valorTotal - ((5 / 100) * valorTotal);
		}

		System.out.println("O Total a pagar em " + nome + " é de: R$" + valorTotal);
		leia.close();
	}
}
