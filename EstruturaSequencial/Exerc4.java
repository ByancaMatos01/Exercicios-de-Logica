package EstruturaSequencial;
/*
 * Receba a temperatura em graus Celsius. Calcule e mostre a sua
temperatura convertida em fahrenheit F = (9*C+160) /5.
 */
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		int C, F;
		Scanner leia=new Scanner(System.in);
		 System.out.println("Digite o valor Cesius");
		 C=leia.nextInt();
		 F=(9*C+160)/5;
		 System.out.println("O valor de Cesius para  Farehint é "+ F);
				 

	}

}
