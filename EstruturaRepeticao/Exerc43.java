/*
 * 43.Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
 * sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 */
package EstruturaRepeticao;

import java.util.Scanner;

public class Exerc43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner(System.in);
		
	float medAna,medMaria;
	int anos=0;
	medAna=(float) 1.10;
	medMaria=(float) 1.50;
	while(medAna<=medMaria) {
		medAna=(float) (medAna+0.03);
		medMaria=(float) (medMaria+0.02);
		anos=anos+1;
	}
	System.out.println("Depois de "+anos+" anos, ana séra maior que Maria");
	System.out.println("Ana com  "+medAna+" metros, e  Maria com "+medMaria+" metros");
	}

}
