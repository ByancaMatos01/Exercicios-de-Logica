/*
 * 40.	Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 */

package EstruturaRepeticao;

import java.util.Scanner;

public class Exerc40 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner leia= new Scanner (System.in);
		System.out.println("Digite o valor do número 1: ");
		n1=leia.nextInt();
		
		System.out.println("Digite o valor do número 2: ");
		n2=leia.nextInt();
		
		if (n1< n2) {
			for (int i=n1; i<=n2; i++) {
				if(i!=2 && i!=3 && i!=5) {
					if(i%2!=0 && i%3!=0 && i%5!=0) {
					System.out.println("Os numeros primos entre eles são: "+ i);
				}
			}
		}
		}
			if (n2<n1) {
				for (int i=n2; i<=n1; i++) {
					if(i!=2 && i!=3 && i!=5) {
						if(i%2!=0 && i%3!=0 && i%5!=0) {
						System.out.println("Os numeros primos entre eles são: "+ i);
					}
				}
			}
	}

}
}