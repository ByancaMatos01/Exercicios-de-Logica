 package EstruturadeDecisao;

import java.util.Scanner;

/*24. Receba um valor inteiro. Verifique e mostre se � divis�vel por 2 e 3.
 */
public class Exerc24 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
	int num,resultado;
	 System.out.println("Digite o valor do n�mero:  ");
	 num=leia.nextInt();
        if((num%2==0) && num%3==0) {
		 System.out.println("Este n�mero e dividido por 3 e por 2");
	 }
	 else {
		 System.out.println("Este n�mero n�o � dividio nem por 2 e nem por 3 ");
	 }
	}

}
