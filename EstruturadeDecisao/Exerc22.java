package EstruturadeDecisao;

import java.util.Scanner;

public class Exerc22 {
/*
 *22 Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem 
crescente
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner(System.in);
		int num1,num2;
		System.out.println("Digite o valor do Primeiro N�mero: ");
		num1=leia.nextInt();
		
		System.out.println("Digite o valor do Segundo N�mero: ");
		num2=leia.nextInt();
		
		if(num1>num2) {
			System.out.println("A ordem � "+ num2 +","+ num1);
		}
			else {
				System.out.println("A ordem � "+ num1 + "," + num2);
			}
		}
	}


