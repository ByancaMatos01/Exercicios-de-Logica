/*
 * 28.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal	Preço Atual	Preço Novo
< 500	< 30	+ 10%
>= 500 e < 1000	>= 30 e < 80	+15%
>= 1000	>= 80	- 5%
Obs.: para outras condições, preço novo será igual ao preço atual.

 */
package EstruturadeDecisao;

import java.util.Scanner;

public class exerc28 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);	
		
		double Pat,VM,PN;
		System.out.println("Digite o valor do Preço Atual");
		Pat=leia.nextDouble();
		
		System.out.println("Digite o valor da Média Mensal ");
		VM=leia.nextDouble();
		if (VM<500 && Pat<30) {
			PN=Pat*1.10;
			System.out.println("Preco atual é "+ PN);
		}
		else if(VM>=500 && VM <1000 && Pat>=30 && Pat<80) {
			PN=Pat*1.15;
			System.out.println("Preco atual é "+ PN);
		}
		else if (VM>=1000 && Pat>=80) {
			PN=Pat*1.05;
			System.out.println("Preco atual é "+ PN);
		}
		
	}

}
