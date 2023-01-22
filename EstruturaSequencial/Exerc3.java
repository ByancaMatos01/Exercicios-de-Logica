package EstruturaSequencial;
/*
 * Receba a base e a altura de um triângulo. Calcule e mostre a sua área
 */
import java.util.Scanner;
public class Exerc3 {

	public static void main(String[] args) {
		int b,H,A;
		Scanner leia=new Scanner(System.in);
		System.out.println("Digite a base do triangulo");
		b=leia.nextInt();
		System.out.println("Digite a altura do triangulo");
		H=leia.nextInt();
		A=(b*H);
		System.out.println("A area do triangulo é "+ A);

	}

}
