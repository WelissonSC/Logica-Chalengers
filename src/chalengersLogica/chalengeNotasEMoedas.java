package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeNotasEMoedas {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		
		Double nota, valor = sc.nextDouble();

		nota = valor / 100;
		System.out.println("NOTAS:" + "\n" + df.format(Math.floor(nota)) + " nota(s) de R$ 100.00");
		valor %= 100;
		
		nota  = valor / 50;
		System.out.println(df.format(Math.floor(nota)) + " nota(s) de R$ 50.00");
		valor %= 50;
		
		nota  = valor / 20;
		System.out.println(df.format(Math.floor(nota)) + " nota(s) de R$ 20.00");
		valor %= 20;
		
		nota  = valor / 10;
		System.out.println(df.format(Math.floor(nota)) + " nota(s) de R$ 10.00");
		valor %= 10;
		
		nota  = valor / 5;
		System.out.println(df.format(Math.floor(nota)) + " nota(s) de R$ 5.00");
		valor %= 5;
		
		nota  = valor / 2;
		System.out.println(df.format(Math.floor(nota)) + " nota(s) de R$ 2.00");
		valor %= 2;
		
		nota  = valor / 1;
		valor %= 1;
		System.out.println("MOEDAS:" + "\n" + df.format(Math.floor(nota)) + " moeda(s) de R$ 1.00");
		
		nota  = valor / 0.50;
		valor %= 0.50;
		System.out.println(df.format(Math.floor(nota)) + " moeda(s) de R$ 0.50");
		
		nota  = valor / 0.25;
		valor %= 0.25;
		System.out.println(df.format(Math.floor(nota)) + " moeda(s) de R$ 0.25");
		
		nota  = valor / 0.10;
		valor %= 0.10;
		System.out.println(df.format(Math.floor(nota)) + " moeda(s) de R$ 0.10");
		
		nota  = valor / 0.05;
		valor %= 0.05;
		System.out.println(df.format(Math.floor(nota)) + " moeda(s) de R$ 0.05");	
		
		nota  = valor / 0.01;
		valor %= 0.01;
		System.out.println(df.format(nota) + " moeda(s) de R$ 0.01");
		
	}

}
