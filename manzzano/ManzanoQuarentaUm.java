package manzzano;

public class ManzanoQuarentaUm {
	public static void main(String[] args) {

		int numero = 15;
		int quadrado = 0;

		do {
			quadrado = numero * numero;
			System.out.println("O quadrado de " + numero + " é: " + quadrado);
			numero = numero + 1;
		} while (numero < 201);

	}
}
