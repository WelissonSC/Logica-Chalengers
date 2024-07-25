package chalengeLogicaRepeticao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ChalengePositivoMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		Integer contador = 0;
		Double soma = 0.0;
		for (int i = 1 ; i <= 6 ; i++) {
			Double x = sc.nextDouble();
			if (x > 0) {
				contador++;
				soma = x + soma;
			}
		}
		System.out.println(contador + " valores positivos");
		System.out.println(df.format(soma / contador));
	}

}
