/*
 * 28.	Receba o pre�o atual e a m�dia mensal de um produto. Calcule e mostre o novo pre�o sabendo que:
Venda Mensal	Pre�o Atual	Pre�o Novo
< 500	< 30	+ 10%
>= 500 e < 1000	>= 30 e < 80	+15%
>= 1000	>= 80	- 5%
Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.

 */
package EstruturadeDecisao;

import java.util.Scanner;

public class exerc28 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);	
		
		double Pat,VM,PN;
		System.out.println("Digite o valor do Pre�o Atual");
		Pat=leia.nextDouble();
		
		System.out.println("Digite o valor da M�dia Mensal ");
		VM=leia.nextDouble();
		if (VM<500 && Pat<30) {
			PN=Pat*1.10;
			System.out.println("Preco atual � "+ PN);
		}
		else if(VM>=500 && VM <1000 && Pat>=30 && Pat<80) {
			PN=Pat*1.15;
			System.out.println("Preco atual � "+ PN);
		}
		else if (VM>=1000 && Pat>=80) {
			PN=Pat*1.05;
			System.out.println("Preco atual � "+ PN);
		}
		
	}

}
