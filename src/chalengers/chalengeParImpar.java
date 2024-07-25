package chalengers;

import java.util.Scanner;

public class chalengeParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantNumeros = sc.nextInt(), i = 1;
		while (i <= quantNumeros) {
			int valor = sc.nextInt();
			if (valor % 2 == 0 && valor > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (valor % 2 == 0 && valor < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (valor % 2 == 1 && valor > 0) {
				System.out.println("ODD POSITIVE");
			} else if (valor == 0) {
				System.out.println("NULL");
			} else {
				System.out.println("ODD NEGATIVE");
			}
			i++;
		}
	}
}
