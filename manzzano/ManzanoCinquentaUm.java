package manzzano;

public class ManzanoCinquentaUm {
	public static void main(String[] args) {
		int quadrado = 0;

		for (int contadora = 15; contadora < 201; contadora++) {
			quadrado = contadora * contadora;
			System.out.println("O quadrado do número " + contadora + " é " + quadrado);
		}
	}
}
