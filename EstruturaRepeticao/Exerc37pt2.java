package EstruturaRepeticao;
/*
 * 37.Receba um n�mero inteiro. 
 * Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo.
 */
import java.util.Scanner;

public class Exerc37pt2 {

	public static void main(String[] args) {
		 int n,a,b, aux;

	        Scanner leia=new Scanner (System.in);
	            System.out.println("Digite um valor:");
	                n=leia.nextInt();
	                a=0;
	                b=1;

	            for (int i=1;i<n;i++){
	                aux=a+b;
	                a=b;
	                b=aux;
	    System.out.println("A s�rie �  at� : "+b);
	        }
	            }
	    }