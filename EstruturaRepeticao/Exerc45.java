/*
 * 45.Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */
package EstruturaRepeticao;

import java.util.Scanner;

public class Exerc45 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		 double div=0, s1=0,s2=0;
		 float sub=0;
		 for (int i=1;i<16;i++) {
			 div=i%2;
			if(div==0) {
				s1=s1+1/i;
				
			}
			else {
				s2=s2+1/i;
			}
		 }
		sub=(float) (s2-s1);
	System.out.println("O resultado da conta é "+sub);
	}
	

}

