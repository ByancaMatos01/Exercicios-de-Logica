package EstruturaSequencial;

import java.util.Scanner;

/*
 * Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência.
 */
public class Exerc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double pi,raio,area;
pi=3.14;
Scanner leia=new Scanner(System.in);
 System.out.println(" Digite o valor do raio: ");
 raio=leia.nextDouble();
 area=((raio*raio)*pi);
 System.out.println(" O valor da area é "+ area);
	}

}
