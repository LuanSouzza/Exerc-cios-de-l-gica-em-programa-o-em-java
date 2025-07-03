package faccat;

import java.util.Scanner;

public class Aposentadoria {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira seu código de funcionário, sendo 1111 para funcionários masculinos e 2222 para femininos.");
		int idFuncionario = leia.nextInt();

		if (idFuncionario == 1111) {

			System.out.println("Digite os 4 carácteres do seu ano de nascimento.");
			int anoNascimento = leia.nextInt();
			System.out.println("Digite os 4 carácteres do seu ano de ingresso na empresa.");
			int anoRegistro = leia.nextInt();

			int idade = 2025 - anoNascimento;
			int tempoTrabalhado = 2025 - anoRegistro;

			if (idade >= 65 && tempoTrabalhado >= 30) {

				System.out.println("Você tem: " + idade + " anos, seu tempo trabalhado foi de:" + tempoTrabalhado
						+ " anos e sua aposentadoria está disponível.");

			} else {
				System.out.println("Você tem: " + idade + " anos, seu tempo trabalhado foi de:" + tempoTrabalhado
						+ " anos e sua aposentadoria está indisponível.");
			}
		} else if (idFuncionario == 2222) {

			System.out.println("Digite os 4 carácteres do seu ano de nascimento.");
			int anoNascimento = leia.nextInt();
			System.out.println("Digite os 4 carácteres do seu ano de ingresso na empresa.");
			int anoRegistro = leia.nextInt();

			int idade = 2025 - anoNascimento;
			int tempoTrabalhado = 2025 - anoRegistro;

			if (idade >= 60 && tempoTrabalhado >= 25) {
				System.out.println("Você tem: " + idade + " anos, seu tempo trabalhado foi de:" + tempoTrabalhado
						+ " anos e sua aposentadoria está disponível.");
			} else {
				System.out.println("Você tem: " + idade + " anos, seu tempo trabalhado foi de:" + tempoTrabalhado
						+ " anos e sua aposentadoria está indisponível.");
			}
		} else {
			System.out.println("Registro inexistente");
		}
		leia.close();
	}
}
