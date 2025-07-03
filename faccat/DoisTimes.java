package faccat;

import java.util.Scanner;

public class DoisTimes {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome de um time");
		String time1 = leia.nextLine();

		System.out.println("Digite o número de gols feitos pelo " + time1);
		int gols1 = leia.nextInt();
		leia.nextLine();
		System.out.println("Digite o nome de outro time");
		String time2 = leia.nextLine();

		System.out.println("Digite o número de gols feitos pelo " + time2);
		int gols2 = leia.nextInt();

		if (gols1 > gols2) {
			System.out.println("O " + time1 + " venceu o " + time2 + " por " + gols1 + " a " + gols2);
		} else if (gols1 < gols2) {
			System.out.println("O " + time2 + " venceu o " + time1 + " por " + gols2 + " a " + gols1);
		} else {
			System.out.println("A partida terminou em empate");
		}
		leia.close();
	}
}
