package EstruturaSequencial;

import java.util.Scanner;

/*
 * Receba 2 valores reais. Calcule e mostre o maior deles
 */
public class Exerc10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println(" Digite o  primeiro valor: ");
		valor1=leia.nextInt();
		
		System.out.println(" Digite o  segundo valor: ");
		valor2=leia.nextInt();
		
		if(valor1<valor2) {
			System.out.println(" o maior valor é o segundo número digitado:  "+ valor2);
		}
		else {
			System.out.println(" O maior valor é o primeiro número digitado : "+ valor1);
		}
		
	}

}
