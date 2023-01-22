package EstruturaSequencial;

import java.util.Scanner;

public class Exerc17 {
/*
 * Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Litros,VM, TGV,D;
		Scanner leia=new Scanner (System.in);
		
		System.out.println("Informe a volocidade média ");
		VM=leia.nextDouble();
		System.out.println("O  tempo gasto no percurso");
		TGV=leia.nextDouble();
		 D=(VM*TGV);
		 Litros=(D/12);
		 System.out.println(" A distancia percorrida foi de: KM "+D+" e o Litros gastos na viagem foi de "+Litros+" KM/L");
		
		
	}	
}
