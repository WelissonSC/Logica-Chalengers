package chalangeLogicaSelecao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeBhaskara {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		
		Double a, b, c, x1, x2;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		

		x1 = Math.pow(b, 2)- (4 * a * c);
		x1 = -b + Math.sqrt(x1);
		x1 = x1 / (2 * a);

		x2 = Math.pow(b, 2)- (4 * a * c);
		x2 = -b - Math.sqrt(x2);
		x2 = x2 / (2 * a);
		
		if (Double.isNaN(x1) || Double.isNaN(x2)) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.println("R1 = " + df.format(x1));			
			System.out.println("R2 = " + df.format(x2));
		}
	}

}
