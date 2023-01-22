/*
 * 27.	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
 * Calcule e mostre a velocidade média em km/h.
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
		System.out.println("A volocidade em Kilometros é "+V+" KM");
		 
		}
		

		
		
	}

