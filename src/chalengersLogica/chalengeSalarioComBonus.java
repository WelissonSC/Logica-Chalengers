package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeSalarioComBonus {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner sc = new Scanner(System.in);
		String nome;
		Double salarioFixo, totalVendas, bonus;
		
		nome = sc.next();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		
		bonus = totalVendas * 0.15;
		
		System.out.println("TOTAL = R$ " + df.format(salarioFixo + bonus));
	}

}
