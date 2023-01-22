package EstruturaSequencial;
/*
 * Receba 2 números reais. Calcule e mostre a diferença desses valores
 */
import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1, valor2;
		double total;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("digite o valor 1: ");
		valor1=leia.nextInt();
		
		System.out.println("digite o valor 2: ");
		valor2=leia.nextInt();
		 
		total=(valor1-valor2);
		System.out.println(" A diferencia entre os valores é "+ total);
		
	}

}
