package EstruturaRepeticao;

import java.util.Scanner;

/*
 * Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N

 */
public class Exerc39 {

	public static void main(String[] args) {
	int graos,casa;
	float qtd;
	Scanner leia=new Scanner (System.in);
	qtd=1;
	System.out.println("Digite a quantidade de graos:");
	graos=leia.nextInt();
	
		for(casa=1;casa<=64;casa++) {	
			System.out.println("os graus são "+qtd+ " casas é: "+ casa);
			qtd=qtd*2;

	}
	
	}

}
