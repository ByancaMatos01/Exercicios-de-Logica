package EstruturaSequencial;

import java.util.Scanner;

/*
 * Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
a hipotenusa. 
 */
public class Exerc15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cate1,cate2, valor;
		double hip;
		Scanner leia=new Scanner (System.in);
		 System.out.println(" Digite o valor do primeiro cateto: ");
		 cate1=leia.nextInt();
		 System.out.println(" Digite o valor do segundo  cateto: ");
		 cate2=leia.nextInt();
	
	valor= (cate1*cate1)+(cate2*cate2);
	hip=(double) Math.sqrt(valor);
	System.out.println(" O valor da hipotenusa é " +hip);
	
	}

}
