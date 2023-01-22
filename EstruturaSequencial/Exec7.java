package EstruturaSequencial;
/*
 *7. Receba os valores do comprimento, largura e altura de um paralelepípedo.
Calcule e mostre seu volume.
 */
import java.util.Scanner;

public class Exec7 {

	public static void main(String[] args) {
		int vol,H,larg,comp;
		Scanner leia=new Scanner(System.in);
		
System.out.println("Digite a Altura do paralelepipedo");
H=leia.nextInt();

System.out.println("Digite a Largura do paralelepipedo");
larg=leia.nextInt();

System.out.println("Digite a Largura do paralelepipedo");
comp=leia.nextInt();

vol=H*larg*comp;
System.out.println("O volume do paralelepipedo é: "+ vol+" Cm³");
	}

}
