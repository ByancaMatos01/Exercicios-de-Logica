package EstruturaRepeticao;
/*
 * 36.Receba um n�mero N. Calcule e mostre a s�rie 1 + 1/1! + 1/2! + ... + 1/N!
 */

import java.util.Scanner;

public class Exerc36 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);	
		float num, fat,result,serie;
		fat=1;
		System.out.println("Digite o valor de um n�mero");
		num=leia.nextInt();
	for(int i = 1; i<=num; i++) { // soma os n�meros at� 4//
		result=fat*=i;// fate que j� vale 1 faz vezes i//
		serie=1/result;
		System.out.println(" A serie � "+ serie );
		
	}
	
	
	
		}

	

	}


