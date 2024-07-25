package chalengeLogicaRepeticao;

import java.util.Scanner;

public class chalengeNumerosImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt(), i = 1;

		while (i <= 6) {
			int num = x;
			if (x % 2 == 1) {
				System.out.println(x);
				i++;
			}
			x++;
		}
	}
}