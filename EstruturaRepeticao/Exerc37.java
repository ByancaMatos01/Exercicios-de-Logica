package EstruturaRepeticao;

import java.util.Scanner;

/*
 * 37.Receba um número inteiro. 
 * Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 */
public class Exerc37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner(System.in);
double a=1;
double b=0;
int c;
System.out.println("Digite o valor de c");
c=leia.nextInt();
for(int i=0;i <=c;i++) {
	double aux=a; //1 
	a=a+b;
	b=aux;
	System.out.println("a Sequencia de Fibonnaci é "+a);
}
	}
	

}
