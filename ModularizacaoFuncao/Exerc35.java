package ModularizacaoFuncao;

import java.util.Scanner;

/*
 * Receba 2 n�meros inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somat�ria dos n�meros �mpares entre esses valores.
 */
public class Exerc35 {

	public static void main(String[] args) {
		int num1,num2, maior, result;
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
			result=result(num1,num2, maior);
			
			System.out.println("o somat�rios dos n�meros impares s�o "+ result);

	}
	
	 public static int  result (int num1, int num2, int maior) {
		int J,i,somaj = 0,somai = 0, somaimpares;
		
		for(J=1;J<=num1;J++) {
			if(J % 2!= 0) {	
				System.out.println("Os numeros imapres do primeiro n�mero digitado � : " + J);
				somaj=somaj+J;		
		}	
			
		}
		for(i=1;i<=num2;i++) {
			if(i % 2!= 0) {	
				System.out.println("os numeros impares do segundo numero digitado � : "+ i);
				somai=somai+i;
	}

		}
		somaimpares=(somaj+somai);
		System.out.println("O numero maior �  "+ maior );
		return somaimpares;
		
		

}
}