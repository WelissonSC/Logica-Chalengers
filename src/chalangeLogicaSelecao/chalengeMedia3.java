package chalangeLogicaSelecao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeMedia3 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		Double media, n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble(), n4 = sc.nextDouble();
		n1 = n1 * 2;
		n2 = n2 * 3;
		n3 = n3 * 4;
		n4 = n4 * 1;
		media = (n1 + n2 + n3 + n4) / 10.0;
		System.out.println("Media: " + df.format(media));

		if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			Double exame = sc.nextDouble();
			System.out.println("Nota do exame: " + exame);
			media = (media + exame) / 2;
			if (media >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + media);
			} else {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + media);
			}
		} else if (media >= 7.0 && media <= 10.0) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}
	}
}
