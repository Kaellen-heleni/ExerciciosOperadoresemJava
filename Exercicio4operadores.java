package javaInicial;
import java.util.Scanner;

public class Exercicio4operadores {
	public static void main(String[] args) {
		float n1,n2,n3,n4,diferenca;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o 1º valor: ");
		n1 = leia.nextFloat();
		System.out.println("Informe o 2º valor: ");
		n2 = leia.nextFloat();
		System.out.println("Informe o 3º valor: ");
		n3 = leia.nextFloat();
		System.out.println("Informe o 4º valor: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2) - (n3*4);
		System.out.println("A diferença do produto entre o 1º e o 2º valor pelo produto entre 3º e o 4º valor é: "+diferenca);
		
	}

}
