package EstruturaRepeticao;
/*
 * 38.	Receba 100 números inteiros reais. 
 * Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 */

import java.util.Scanner;

public class Exerc38 {

	public static void main(String[] args) {
		int num1,num2,J,i,maior, menor, somaj = 0,somai = 0;
			Scanner leia= new Scanner(System.in);
			System.out.println("Digite um valor: ");
			num1=leia.nextInt();
			
			System.out.println("Digite um valor: ");
			num2=leia.nextInt();
			
			if (num1>num2) {
				maior=num1;
				menor=num2;
			}
				else {
					maior=num2;
					menor=num1;
				}
			for(J=1;J<=num1;J++) {
				if(J % 2== 0) {	
					System.out.println("Os numeros pares do primeiro número digitado é : " + J);
					somaj=somaj+J;		
			}
				System.out.println("------------------------------------------------------------");
			}
			for(i=1;i<=num2;i++) {
				if(i % 2== 0) {	
					System.out.println("os numeros pares do  segundo numero digitado é : "+ i);
					somai=somai+i;
		}
				System.out.println("------------------------------------------------------------");

			}
			System.out.println("O numero maior é  "+ maior );
			System.out.println("O numero menor é  "+ menor );
			
		}

}

