package EstruturaRepeticao;
/*
 * 31.	Calcule e mostre o quadrado dos números entre 10 e 150.
 */
import java.util.Scanner;

public class Exerc31 {

		public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
			int num, quad;
			num=10;
			while(num>=10 && num<=150) {
			quad=num*num;
			System.out.println("O quadrado de "+ num + " e quadrado é "+ quad );
			num=num+1;
			
		}
				

	}

}
