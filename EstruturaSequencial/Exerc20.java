package EstruturaSequencial;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		  if(delta>0) {
			  x1=(-B+ Math.sqrt(delta))/(2*A);
			  x2=(-B- Math.sqrt(delta))/(2*A);
			  System.out.println("O valor de X1 é "+ x1);
			  System.out.println("O valor de X2 é "+ x2);
		  }
		  else {
			 System.out.println("Não há raizes reais"); 
		  }
	}

}
