package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeConsumo {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		Integer distancia;
		Double consumo, gasto;
		
		distancia = sc.nextInt();
		gasto = sc.nextDouble();
		consumo = (distancia / gasto);
		
		System.out.println(df.format(consumo) + " km/l");
		
	}

}
