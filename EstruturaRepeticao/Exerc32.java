package EstruturaRepeticao;

import java.util.Scanner;

/*
 * 32.Receba um número inteiro. Calcule e mostre o seu fatorial.
 */
public class Exerc32 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);	
	int num, fat,result;
	fat=1;
	System.out.println("Digite o valor de um número");
	num=leia.nextInt();
for(int i = 1; i<=num; i++) { // soma os números até 4//
	result=fat*=i; // fate que já vale 1 faz vezes i//
	System.out.println("fatorial de " + i + "=" +result);	
}

	}

}
