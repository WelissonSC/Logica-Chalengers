package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeCalculoSimples {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner sc = new Scanner(System.in);
		
		Integer codigoPeca1, codigoPeca2, numeroPeca1, numeroPeca2;
		Double valorUnitario1, valorUnitario2, total;

		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		total = (numeroPeca1 * valorUnitario1) + (numeroPeca2 * valorUnitario2);
		
		System.out.println("VALOR A PAGAR: R$ " + df.format(total));
		
	}

}
