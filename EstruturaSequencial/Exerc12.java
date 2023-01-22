package EstruturaSequencial;

import java.util.Scanner;

/*
 * Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 17 anos.
 */
public class Exerc12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner leia=new Scanner(System.in);
  int anonasc,anoatual,futura,anoagr;
  
  System.out.println("Digite o ano que você Nasceu: ");
  anonasc=leia.nextInt();
   System.out.println("Digite o ano atual: ");
   anoatual=leia.nextInt();
    anoagr=anoatual-anonasc;
    futura=(anoagr+17);
    System.out.println("Sua idade atual é :" +anoagr);
    System.out.println("Sua idade futura é  "+ futura);

	}

}
