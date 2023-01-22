/*
 * 44.Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 */

package EstruturaRepeticao;

import java.util.Scanner;

public class Exerc44 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		int b1,p2,r=0;
		System.out.println("Digite o valor da base" );
		b1=leia.nextInt();
		
		System.out.println("Digite o valor da potencia" );
		p2=leia.nextInt();
		
		r=(int) Math.pow(b1, p2);
		System.out.println("Resultado da conta é: "+ r);
		
	}

}
