package EstruturaRepeticao;

import java.util.Scanner;

/*
 * 35.Receba 2 n�meros inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somat�ria dos n�meros �mpares entre esses valores.
 */
public class Exer35 {

	public static void main(String[] args) {
		
	int num1,num2,J,i,maior,somaj = 0,somai = 0;
	int somaimpares;
		Scanner leia= new Scanner(System.in);
		System.out.println("Digite um valor: ");
		num1=leia.nextInt();
		
		System.out.println("Digite um valor: ");
		num2=leia.nextInt();
		
		if (num1>num2) {
			maior=num1;
		}
			else {
				maior=num2;
			}
		for(J=1;J<=num1;J++) {
			if(J % 2!= 0) {	
				System.out.println("Os numeros imapres do primeiro n�mero digitado � : " + J);
				somaj=somaj+J;		
		}	
			
		}
		for(i=1;i<=num2;i++) {
			if(i % 2!= 0) {	
				System.out.println("os numeros impares dosegundo numero digitado � : "+ i);
				somai=somai+i;
	}

		}
		somaimpares=(somaj+somai);
		System.out.println("O numero maior �  "+ maior );
		System.out.println("E a soma dos numeros impares �: "+ somaimpares );
		
	}
}