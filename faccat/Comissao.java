package faccat;

import java.util.Scanner;

public class Comissao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu sal�rio fixo");
		float salarioFixo = leia.nextFloat();
		
		System.out.println("Digite a quantidade de carros que voc� vendeu");
		float carrosVendidos = leia.nextFloat();
		
		System.out.println("Digite o valor da sua comissao por carros vendidos");
		float comissao = leia.nextFloat();
		
		System.out.println("Digite o valor total de suas vendas");
		float totalEmVendas = leia.nextFloat();
		
		float salarioFinal = salarioFixo + (comissao * carrosVendidos) + (5 / 100 * totalEmVendas);

		System.out.println("Seu sal�rio � de: R$" + salarioFinal);

		leia.close();
	}
}
