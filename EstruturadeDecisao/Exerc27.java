/*
 * 27.	Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de dura��o (minutos). 
 * Calcule e mostre a velocidade m�dia em km/h.
 */

package EstruturadeDecisao;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner (System.in);	
		
		int voltas,metros,mn,V;
		 
		 System.out.println("Digite o numeros de voltas:");
		 voltas=leia.nextInt();
		 
		 System.out.println("Digite os metros percorridos: ");
		 metros=leia.nextInt();
		 
		 System.out.println("Digite os minutos:");
		 mn=leia.nextInt();
		 
		 V=(int) (((voltas*metros)/mn*60)*3.6);
		System.out.println("A volocidade em Kilometros � "+V+" KM");
		 
		}
		

		
		
	}

