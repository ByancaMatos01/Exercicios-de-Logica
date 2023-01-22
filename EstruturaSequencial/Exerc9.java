package EstruturaSequencial;

import java.util.Scanner;
/*
 * 1. Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 */
public class Exerc9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1, valor2;
		double total;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("digite o valor 1: ");
		valor1=leia.nextInt();
		
		System.out.println("digite o valor 2: ");
		valor2=leia.nextInt();
		
		total=((valor1+valor2)*(valor1+valor2));
		System.out.println("A soma dos Quadrados é "+ total);
		
	}

}
