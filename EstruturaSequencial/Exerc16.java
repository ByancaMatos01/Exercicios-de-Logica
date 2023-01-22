package EstruturaSequencial;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
		 * Calcule o salário que serão as horas trabalhadas x o valor por hora. 
		 * Calcule o salário líquido (= Salário Bruto – desconto).
		 *  A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
		 */
		
		int HT,PD,ND;
		double SB,SL,VP,Tot;
		
		Scanner leia=new Scanner (System.in);
		
		System.out.println(" Digite a quantidade de horas trabalhadas: ");
		HT= leia.nextInt();
		
		System.out.println(" Digite o valor por hora: ");
		VP= leia.nextDouble();
		
		System.out.println(" Digite o valor o percentual de desconto % : ");
		PD= leia.nextInt();
		
		System.out.println(" Digite o Numero de descendentes  : ");
		ND= leia.nextInt();
		
		SB=(HT*VP);
		SL=(SB-PD/100);
		Tot=(SL+ND+100);
		System.out.println("O valor do saário a receber é R$"+ Tot);
		
	}

}
