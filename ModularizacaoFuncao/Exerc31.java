/*
 * 31.	Calcule e mostre o quadrado dos n�meros entre 10 e 150.
 */
package ModularizacaoFuncao;

import java.util.Scanner;

public class Exerc31 {
	public static void main (String[] args ) {
		
	Scanner leia= new Scanner (System.in);
	int quad;
	for (int num=10; num<=150;num++) {
		quad=quad(num);
		System.out.println("Os quadrados dos n�meros s�o: "+quad);
	}
	
	}
	
	static int quad(int num) {
		int quad=(num*num);
		return quad;
		
	}
}
