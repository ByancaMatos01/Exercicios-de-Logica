/*
 *  32.Receba um n�mero inteiro. Calcule e mostre o seu fatorial.
 */
package ModularizacaoFuncao;

import java.util.Scanner;

public class Exerc32 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);	
		int num;
		System.out.println("Digite o valor de um n�mero");
		num=leia.nextInt();
		System.out.println("O Fatorial �: "+Ffat(num));
	}
	public static int Ffat(int n) {
		int cta,f;
		f=1;
		for (cta=1; cta<=n; cta++) {
			f=(f*cta);
		}
		return f;
	}

}
