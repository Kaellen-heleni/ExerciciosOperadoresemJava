package javaInicial;
import java.util.Scanner;

public class Exercicio3operadores {

	public static void main(String[] args) {
	float salarioBruto,adcNoturno,hes,descontos,salarioLqd;
	Scanner leia = new Scanner(System.in);
	System.out.println("Informe o seu salário bruto: ");
	salarioBruto = leia.nextFloat();
	System.out.println("Informe o valor que você recebe de adicional noturno: ");
	adcNoturno = leia.nextFloat();
	System.out.println("Informe o valor que você recebe por cada hora extra: ");
	hes = leia.nextFloat();
	System.out.println("Informe o valor que será descontado de seu salário: ");
	descontos = leia.nextFloat();
	
	salarioLqd = salarioBruto + adcNoturno + (hes*5) - descontos;
	System.out.println("O seu salário líquido desse mês é: R$ "+salarioLqd);
	

	}

}
