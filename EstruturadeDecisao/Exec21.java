package EstruturadeDecisao;

import java.util.Scanner;

/*
 *21  Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
 */
public class Exec21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner (System.in);
		
		double nota1,nota2,nota3,nota4,media;
		
		System.out.println("Digite a primeira nota: ");
		nota1=leia.nextDouble();
		
		 System.out.println("Digite a segunda nota: ");
		 nota2=leia.nextDouble();
		 
		 System.out.println("Digite a terceira nota: ");
		 nota3=leia.nextDouble();
		 
		 System.out.println("Digite a quarta nota: ");
		 nota4=leia.nextDouble();
		 
		 media=(nota1+nota2+nota3+nota4)/4;
		 
		 if(media>=6.0) {
			 System.out.println("Aprovado");
		 }
		 else if((media >= 3.0) && (media < 6.0)) {
			 System.out.println("EXAME");
		 }
		 else {
			 if(media<3.0) {
				 System.out.println("Retido");  
			 }
			 
		 }
				 
		
	}

}
