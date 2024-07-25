package chalengeLogicaRepeticao;

import java.util.Scanner;

public class chalengeParesCinco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer contador = 0;
		for (int i = 0; i < 5; i++) {
			Integer valores = sc.nextInt();
			if (valores % 2 == 0) {
				contador++;
			}
		}

		System.out.println(contador + " valores pares");
	}

}
