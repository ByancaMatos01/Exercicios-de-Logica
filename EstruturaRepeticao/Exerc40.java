/*
 * 40.	Receba 2 n�meros inteiros. Verifique e mostre todos os n�meros primos existentes entre eles.
 */

package EstruturaRepeticao;

import java.util.Scanner;

public class Exerc40 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner leia= new Scanner (System.in);
		System.out.println("Digite o valor do n�mero 1: ");
		n1=leia.nextInt();
		
		System.out.println("Digite o valor do n�mero 2: ");
		n2=leia.nextInt();
		
		if (n1< n2) {
			for (int i=n1; i<=n2; i++) {
				if(i!=2 && i!=3 && i!=5) {
					if(i%2!=0 && i%3!=0 && i%5!=0) {
					System.out.println("Os numeros primos entre eles s�o: "+ i);
				}
			}
		}
		}
			if (n2<n1) {
				for (int i=n2; i<=n1; i++) {
					if(i!=2 && i!=3 && i!=5) {
						if(i%2!=0 && i%3!=0 && i%5!=0) {
						System.out.println("Os numeros primos entre eles s�o: "+ i);
					}
				}
			}
	}

}
}