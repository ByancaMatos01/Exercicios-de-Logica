package EstruturaRepeticao;

import java.util.Scanner;

/*
 * 34.Receba um número. Calcule e mostre os resultados da tabuada desse número.
 */
public class Exer34 {

	public static void main(String[] args) {
		int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = scanner.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println("o resultado da tabuada do  "+ entrada + " X "+ multiplicador +" = "+ resultado);   
            multiplicador++;
        }
    }
	
}