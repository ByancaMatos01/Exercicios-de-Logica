package EstruturaSequencial;
/*
 * Receba os valores em x e y. Efetua a troca de seus valores e mostre seus 
conteúdos
 */
import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		int X,Y,aux;
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Digite o valor de X");
		X=leia.nextInt();
		System.out.println("Digite o valor de Y");
		Y=leia.nextInt();
		aux=X;
		X=Y;
		Y=aux;
		System.out.println("O novo valor de X é  "+X);
		System.out.println("O novo valor de Y é  "+Y);
		
	}

}
