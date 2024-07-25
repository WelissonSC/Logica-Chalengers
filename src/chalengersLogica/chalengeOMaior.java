package chalengersLogica;

import java.util.Scanner;

public class chalengeOMaior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a, b, c, maior, maior2, resultado;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maior = Math.max(a, b);
		maior2 = Math.max(b, c);
		resultado = Math.max(maior, maior2);
		
		System.out.println(resultado + " eh o maior");

	}

}
