package javaInicial;
import java.util.Scanner;

public class Exercício1Operadores {
	public static void main(String[] args) {
		float salario,abono,novoSalario;
	
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o valor do abono salarial a ser recebido: ");
		abono = leia.nextFloat();
		novoSalario = salario + abono;
		System.out.println("O seu novo salário após o recebimento do abono é: "+novoSalario);
		
		
			}

}
