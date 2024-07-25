package chalengersLogica;

import java.util.Scanner;

public class chalengeConversaoTempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer hora, minuto, segundo, tempo = sc.nextInt();
		
		hora = tempo / 3600;
		tempo %= 3600;
		minuto = tempo / 60;
		tempo %= 60;
		segundo = tempo / 1;
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}

}
