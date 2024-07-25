package chalengersLogica;

import java.util.Scanner;

public class chalengeCedulas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer valor = sc.nextInt();
		
		Integer quantidadeDeNotas = valor / 100;
		System.out.println(valor + "\n" + quantidadeDeNotas + " nota(s) de R$ " + "100,00");
		valor %= 100; 
		
		quantidadeDeNotas = valor / 50;
		System.out.println(quantidadeDeNotas + " nota(s) de R$ " + "50,00");		
		valor %= 50;
		
		quantidadeDeNotas = valor / 20;
		System.out.println(quantidadeDeNotas + " nota(s) de R$ " + "20,00");		
		valor %= 20;
		
		quantidadeDeNotas = valor / 10;
		System.out.println(quantidadeDeNotas + " nota(s) de R$ " + "10,00");		
		valor %= 10;
		
		quantidadeDeNotas = valor / 5;
		System.out.println(quantidadeDeNotas + " nota(s) de R$ " + "5,00");		
		valor %= 5;
		
		quantidadeDeNotas = valor / 2;
		System.out.println(quantidadeDeNotas + " nota(s) de R$ " + "2,00");		
		valor %= 2;
		
		quantidadeDeNotas = valor / 1;
		System.out.println(quantidadeDeNotas + " nota(s) de R$ " + "1,00");		
		valor %= 1;
		
		
	}

}
