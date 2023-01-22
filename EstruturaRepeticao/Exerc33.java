package EstruturaRepeticao;

import java.util.Scanner;

/*
 * 33. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 */
public class Exerc33 {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		 double h = 0;
	      int n;
	      System.out.println("Digite o valor de N");
	      n=leia.nextInt();
	      
	      for(int i=1; i<=n; i++) {

	        h = h + (double)1/i;

	        System.out.println(h);
	    }
	}
		
	
	}


