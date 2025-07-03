package faccat;

import java.util.Scanner;

public class CodigoeSenha {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int codigo = 4321;
		int senha = 9999;

		System.out.println("Insira o código de usuário");
		int codigoInserido = leia.nextInt();

		if (codigoInserido != codigo) {
			System.out.println("Usuário inválido!");
		} else {
			System.out.println("Insira a senha");
			int senhaInserida = leia.nextInt();
			if (senhaInserida != senha) {
				System.out.println("Senha inválida!");
			} else {
				System.out.println("Acesso permitido!");
			}
		}
		leia.close();
	}
}
