package EstruturaSequencial;
/*
 * . Receba 2�ngulos de um tri�ngulo. Calcule e mostre o valor do 3� �ngulo.
 * 
 */
import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ang1,ang2,ang3;
		Scanner leia= new Scanner(System.in);
 	System.out.println("Digite o  primeiro angulo do triangulo: ");
 	ang1=leia.nextInt();
 	System.out.println("Digite o segundo angulo do triangulo: ");
 	ang2=leia.nextInt();
 	ang3=(ang1+ang2)-180;
 	System.out.println("O valor do terceiro angulo � "+ ang3);
 	
 	
	}

}
