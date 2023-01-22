/*
 * 42.	Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */

package EstruturaRepeticao;
import java.util.Scanner;
public class exerc42 {

	public static void main(String[] args) {
	Scanner leia=new Scanner(System.in);
	 double h=0;
	 double b = 1;
     int n=1;
     System.out.println("Digite o valor de N");
     n=leia.nextInt();
     
     for(int i=1; i<=50; i++) { 
    	 n=(n+1);
    	 b=(b+2);
    	h=(h+(n/b));
    	System.out.println(h);
   }
	}
  

}


	
