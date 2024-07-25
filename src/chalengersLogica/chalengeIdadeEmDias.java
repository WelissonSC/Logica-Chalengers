package chalengersLogica;

import java.util.Scanner;

public class chalengeIdadeEmDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer ano, dia, mes, numero = sc.nextInt();
		
		ano = numero / 365;
		System.out.println(ano + " ano(s)");
		numero %= 365; 
		mes = numero / 30;
		System.out.println((mes)  + " mes(s)");
		numero %= 30; 
		dia = numero / 1;
		System.out.println((dia)  + " dia(s)");

	}

}
