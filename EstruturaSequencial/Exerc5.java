package EstruturaSequencial;
/*
 *5. Receba os coeficientes A, B e C de uma equa��o do 2� grau 
(AX�+BX+C=0). Calcule e mostre as ra�zes reais (considerar que a 
equa��o possue2 ra�zes)
 */
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
	int A,B,C;
	double delta, x1,x2;
	
	Scanner leia=new Scanner (System.in);
	 
	System.out.println(" Digite o valor de A ");
	 A=leia.nextInt();
	 
	  System.out.println("Digite o valor de B");
	  B=leia.nextInt();
	  
	  System.out.println("Digite o valor de C");
	  C=leia.nextInt();
	  
	  delta=(B*B-4*A*C);
	  x1=(-B+ Math.sqrt(delta))/(2*A);
	  x2=(-B- Math.sqrt(delta))/(2*A);
	  System.out.println(" O valor de X1 � "+ x1);
	  System.out.println("O valor de X2 � "+ x2);
	  
	}

}
