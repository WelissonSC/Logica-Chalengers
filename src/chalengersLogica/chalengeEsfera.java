package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeEsfera {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		DecimalFormat df = new DecimalFormat("0.000");
		Scanner sc = new Scanner(System.in);
		Double pi = 3.14159, raio, resultado;
		
		raio = sc.nextDouble();
		resultado = (4.0 / 3) * pi * (Math.pow(raio, 3));
		
		System.out.println("VOLUME = " + df.format(resultado));

	}

}
