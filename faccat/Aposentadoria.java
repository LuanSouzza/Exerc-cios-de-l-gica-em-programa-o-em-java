package faccat;

import java.util.Scanner;

public class Aposentadoria {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira seu c�digo de funcion�rio, sendo 1111 para funcion�rios masculinos e 2222 para femininos.");
		int idFuncionario = leia.nextInt();

		if (idFuncionario == 1111) {

			System.out.println("Digite os 4 car�cteres do seu ano de nascimento.");
			int anoNascimento = leia.nextInt();
			System.out.println("Digite os 4 car�cteres do seu ano de ingresso na empresa.");
			int anoRegistro = leia.nextInt();

			int idade = 2025 - anoNascimento;
			int tempoTrabalhado = 2025 - anoRegistro;

			if (idade >= 65 && tempoTrabalhado >= 30) {

				System.out.println("Voc� tem: " + idade + " anos, seu tempo trabalhado foi de:" + tempoTrabalhado
						+ " anos e sua aposentadoria est� dispon�vel.");

			} else {
				System.out.println("Voc� tem: " + idade + " anos, seu tempo trabalhado foi de:" + tempoTrabalhado
						+ " anos e sua aposentadoria est� indispon�vel.");
			}
		} else if (idFuncionario == 2222) {

			System.out.println("Digite os 4 car�cteres do seu ano de nascimento.");
			int anoNascimento = leia.nextInt();
			System.out.println("Digite os 4 car�cteres do seu ano de ingresso na empresa.");
			int anoRegistro = leia.nextInt();

			int idade = 2025 - anoNascimento;
			int tempoTrabalhado = 2025 - anoRegistro;

			if (idade >= 60 && tempoTrabalhado >= 25) {
				System.out.println("Voc� tem: " + idade + " anos, seu tempo trabalhado foi de:" + tempoTrabalhado
						+ " anos e sua aposentadoria est� dispon�vel.");
			} else {
				System.out.println("Voc� tem: " + idade + " anos, seu tempo trabalhado foi de:" + tempoTrabalhado
						+ " anos e sua aposentadoria est� indispon�vel.");
			}
		} else {
			System.out.println("Registro inexistente");
		}
		leia.close();
	}
}
