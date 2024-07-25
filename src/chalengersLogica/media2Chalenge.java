package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class media2Chalenge {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		Double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		a = a * 2;
		b = b * 3;
		c = c * 5;
		
		System.out.println("MEDIA = " + df.format((a + b + c) / 10.0));

	}

}
