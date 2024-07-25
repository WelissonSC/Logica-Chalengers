package chalengers;

import java.util.Scanner;

public class chalengeSomaImpares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt(), y = sc.nextInt(), resultado = 0, i = 0;
		
		while (x >= i) {
			if (x <= y) {
				resultado = i % 2;
				System.out.println(resultado);
			}
			i++;
		}

	}

}
