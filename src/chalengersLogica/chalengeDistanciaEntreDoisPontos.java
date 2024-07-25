package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeDistanciaEntreDoisPontos {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");

		Double x1, y1, x2, y2, distancia;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
			
		distancia = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		
		
		System.out.println(df.format(Math.sqrt(distancia)));

	}

}
