package faccat;

import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do produto.");
		String produto = leia.nextLine();

		System.out.println("Digite a quantidade máxima de " + produto + " que podem ser armazenados em seu estoque.");
		float quantidadeMaxima = leia.nextFloat();

		System.out.println("Digite a quantidade mínima de " + produto + " que podem ser armazenados em seu estoque.");
		float quantidadeMinima = leia.nextFloat();

		System.out.println("Digite a quantidade de " + produto + " que está atualmente armazenado em seu estoque.");
		float quantidadeAtual = leia.nextFloat();

		float mediaArmazenamento = (quantidadeMaxima + quantidadeMinima) / 2;

		if (quantidadeAtual >= mediaArmazenamento) {
			System.out.println("Efetue a compra");
		} else {
			System.out.println("Não efetue a compra");
		}
		leia.close();
	}
}
