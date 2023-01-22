package EstruturaSequencial;
/*
 * 2. Receba o salário de um funcionário e mostre o novo salário com reajuste
de 15%.
 */
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int sal;
		double reajuste, res;
		
		System.out.println(" Digite o valor so sálario: ");
		sal=leia.nextInt();
		reajuste=sal*0.15;
		res=sal+reajuste;
		System.out.println("O sálario final é: "+ res);
		
		

	}

}
