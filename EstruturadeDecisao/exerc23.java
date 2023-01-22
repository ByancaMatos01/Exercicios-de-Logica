package EstruturadeDecisao;

import java.util.Scanner;

/*
 *23 Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não 
necessariamente em ordem. Mostre os 4 números em ordem crescente.
 */
public class exerc23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner(System.in);
		
		int num1,num2,num3,num4;
		System.out.println("------Os 3 primeiros Nº são obrigatório estar em ordem crescente---------------- ");
		System.out.println("digite o primeiro numero:");
		num1=leia.nextInt();
		
		System.out.println("digite o segundo  numero:");
		num2=leia.nextInt();
		
		System.out.println("digite o terceiro numero:");
		num3=leia.nextInt();
		
		System.out.println("digite o quarto numero:");
		num4=leia.nextInt();
		
		if(num1>num4 ) {
		System.out.println(" A Ordem é "+num4+ ","+num1+","+num2+","+num3);
	}
		else if(num1<num4) {
			System.out.println(" A Ordem é "+num1+ ","+num2+","+num3+","+num4);
		}
		
	}

}
