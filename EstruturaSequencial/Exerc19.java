package EstruturaSequencial;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia= new Scanner(System.in);
		
		int valor1, valor2, diferencia;
		
		System.out.println(" Digite o  primeiro valor: ");
		valor1=leia.nextInt();
		
		System.out.println(" Digite o  segundo valor: ");
		valor2=leia.nextInt();
		
		if(valor1<valor2) {
			diferencia=(valor2-valor1);
			System.out.println(" A diferencia é "+ diferencia);
		}
		else {
			diferencia=(valor1-valor2);
			System.out.println(" A diferencia é "+ diferencia);
		}
		
	}

}
