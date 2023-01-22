package EstruturadeDecisao;

import java.util.Scanner;

/*
 * 29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor 
 * corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 */
public class Exerc29 {

	public static void main(String[] args) {
	Scanner leia=new Scanner (System.in);
		int cod;
		double pop,RF,Valor,in;
		
		System.out.println("Digite o numero do codigo: ");
		cod=leia.nextInt();
		
		System.out.println("Digite o valor de redimento");
		Valor=leia.nextInt();
		
		if(cod==1) {
		in=(Valor*0.03);
		pop=(Valor+in);
		System.out.println("O novo investimento é  "+pop);
		}
		else if (cod==2) {
		in=(Valor*0.05);
		RF=(Valor+in);
		System.out.println("O novo investimento é  "+RF);
		}
		else {
			System.out.println("Demais tipos não serão considerados");
		}

	}

}
