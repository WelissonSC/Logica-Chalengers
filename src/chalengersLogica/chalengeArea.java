package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeArea {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		DecimalFormat df = new DecimalFormat("0.000");
		Scanner sc = new Scanner(System.in);
		
		Double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = (a * c) / 2;
		circulo	= (2 * 3.14159 * Math.pow(c, 2) / 2);	
		trapezio = (a + b) * c / 2;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;
		
		System.out.println(
				"TRIANGULO: " + df.format(triangulo) +"\n" +
				"CIRCULO: " + df.format(circulo) +"\n" +
				"TRAPEZIO: " + df.format(trapezio) +"\n" +
				"QUADRADO: " + df.format(quadrado) +"\n" +
				"RETANGULO: " + df.format(retangulo));
	}

}
