package ModularizacaoFuncao;

import java.util.Scanner;

/*
 * 34.	Receba um n�mero. Calcule e mostre os resultados da tabuada desse n�mero.
 */
public class Exerc34 {

	public static void main(String[] args) {
	int num,tab = 0;
	Scanner leia=new Scanner(System.in);
	System.out.println("Digite o valo de num");
	num=leia.nextInt();
	for (int i=1; i<=10; i++) {
		tab=tab(i,num);
		System.out.println(+ num +" X "+i+ " � "+ tab);
	}

	}
static int tab(int i, int num) {
	return (num*i);
	
}
}
