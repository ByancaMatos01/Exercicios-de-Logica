package EstruturaRepeticao;
/*
 * 37.Receba um número inteiro. 
 * Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
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
	    System.out.println("A série é  até : "+b);
	        }
	            }
	    }