package EstruturaSequencial;

/* Coletar o valor do lado de um quadrado, calcular sua área e apresentar o
resultado
 */
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		int lado,resultado;
		Scanner leia=new Scanner(System.in);
		System.out.println("---------------------Volume do quadrado----------------------------------");
		System.out.println("Digite o valor do lado do Quadrado");
		lado= leia.nextInt();
		resultado=lado*lado;
		System.out.println(" O valume do quadrado é "+ resultado);

	}

}
