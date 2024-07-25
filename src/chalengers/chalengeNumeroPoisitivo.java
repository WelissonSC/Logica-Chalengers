package chalengers;

import java.util.Locale;
import java.util.Scanner;

public class chalengeNumeroPoisitivo {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		int resultado = 0; 
		for (int i = 0 ; i < 6 ; i++) {
			Double num = sc.nextDouble();
			if (num > 0) {
				resultado++;
			}
		}
		
		System.out.println(resultado + " valores positivos");
	}

}
