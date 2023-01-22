package EstruturadeDecisao;

import java.util.Scanner;

/*
 * 26.	Receba 2 números inteiros. 
 * Verifique e mostre se o maior número é múltiplo do menor.

 */
public class Exerc26 {

	public static void main(String[] args) {
	Scanner leia=new Scanner(System.in);
	int n1,n2, maior,menor;
	
	System.out.println("Digite o valor de n1");
	n1=leia.nextInt();
	System.out.println("Digite o valor de n2");
	n2=leia.nextInt();
	
	if(n1>n2) {
		maior=n1;
		menor=n2;
	}
	else {
		maior=n2;
		menor=n1;
	}
	 if (maior % menor==0) {
		 System.out.println(" Os Números são multiplos ");
	 }
	}
}