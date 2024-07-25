package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeGastoCombustivel {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		Double tempo, velocidade, litros;
		
		tempo = sc.nextDouble();
		velocidade = sc.nextDouble();
		litros = (tempo * velocidade);
		litros = litros / 12;
		
		System.out.println(df.format(litros));
	}

}
