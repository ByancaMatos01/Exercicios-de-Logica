package EstruturaSequencial;

import java.util.Scanner;
/*
 * Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m
 */
public class Exerc8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deposito, mes;
		double redimento,total;
		
		Scanner leia=new Scanner (System.in);
		 System.out.println("Digite o valor do deposito:");
		 deposito=leia.nextInt();
		 System.out.println("Digite quantos meses de redimento:");
		 mes=leia.nextInt();
		 redimento=deposito*0.013*mes;
		 total=deposito*redimento;
		 System.out.println("o valor total do seu redimento é:  R$ "+ total );
		 
		 
		 }

}
