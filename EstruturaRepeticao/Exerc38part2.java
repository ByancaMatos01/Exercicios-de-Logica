package EstruturaRepeticao;
/*
 * 38 Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 */
import java.util.Scanner;

public class Exerc38part2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
	int n,maior,menor;
	maior=0;
	menor=0;
	
	for(int i=0;i<4;i++) {
	System.out.println("Digite o valor de n: ");
		n=leia.nextInt();
		if(i==0) {
			maior=n;
			menor=n;
			
			
		}else
			if(n>maior) {
			maior=n;
			
			}
			else {
				if(n<menor) {
					menor=n;
					
				}
				System.out.println("maior número é "+ maior+ "E o menor valor é "+ menor);
			}
		}
			
	}
	

	}

