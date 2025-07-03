package faccat;

import java.util.Scanner;

public class HoraXadrez {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Jogo de xadrez");

		System.out.println("Digite a hora inicial");
		int horaInicial = leia.nextInt();
		System.out.println("Digite a hora final");
		int horaFinal = leia.nextInt();
		int duracao = horaFinal - horaInicial;

		if (duracao < 0) {
			duracao = duracao + 24;
		}
		System.out.println("o jogo durou " + duracao + " horas");

		leia.close();
	}
}