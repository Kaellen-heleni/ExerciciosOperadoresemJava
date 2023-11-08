package javaInicial;
import java.util.Scanner;

public class Exercicio2operadores {
	public static void main(String[] args) {
     float n1,n2,n3,n4,mediaFinal;
     
     Scanner leia = new Scanner(System.in);
     System.out.println("Digite o valor da sua 1º nota: ");
     n1 = leia.nextFloat();
     System.out.println("Digite o valor de sua 2º nota: ");
     n2 = leia.nextFloat();
     System.out.println("Digite o valor de sua 3º nota: ");
     n3 = leia.nextFloat();
     System.out.println("Digite o valor de sua 4ª nota: ");
     n4 = leia.nextFloat();
     
     mediaFinal = (n1+n2+n3+n4)/4;
     System.out.println("A sua média final é: "+mediaFinal);
     
    		 
		
	}

}
