package EstruturaRepeticao;

import java.util.Scanner;

/*
 * 41.	Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */
public class exerc41 {

	public static void main(String[] args) {
	int d1,d2;
	Scanner leia=new Scanner (System.in);
	for (d1=1;d1<=6;d1++) {
		for(d2=1;d2<=6;d2++) {
			if((d1+d2)==7){
				System.out.println("A soma é "+d1+" + "+d2+" =7");
			}
		}
	}

	}

}
