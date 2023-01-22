package EstruturaSequencial;

import java.util.Scanner;

/*
 * Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
durará esse alimento sabendo que a pessoa consome 50g ao dia
 */
public class Exerc13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdalimentos,dias;
		Scanner leia=new Scanner(System.in);
		System.out.println("digite a quantidade de alimento ");
		qtdalimentos=leia.nextInt();
		dias=qtdalimentos*1000/50;
		System.out.println("A quantidade de aliemnto que  usuario consume por dia é: "+dias+"g");

	}

}
