package chalangeLogicaSelecao;

import java.util.Locale;
import java.util.Scanner;

public class chalengeCoordendas {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		Double x = sc.nextDouble(), y = sc.nextDouble();
		
		if (x == 0.0 && y == 0) {
			System.out.println("Origem");
		} else if(x > 0 && y > 0 ) {
			System.out.println("Q1");
		} else if(x > 0 && y < 0) {
			System.out.println("Q4");
		} else if(x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0){
			System.out.println("Q3");
		} else if(x == 0 && y > 0) {
			System.out.println("Eixo Y");
		} else if(x == 0 && y < 0) {
			System.out.println("Eixo Y");
		} else if(x > 0 && y == 0) {
			System.out.println("Eixo X");
		} else if(x < 0 && y == 0) {
			System.out.println("Eixo X");
		} else {
			System.out.println("Falhou");
		}
	}

}
