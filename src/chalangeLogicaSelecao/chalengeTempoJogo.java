package chalangeLogicaSelecao;

import java.util.Scanner;

public class chalengeTempoJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer horaInicial = sc.nextInt(), HoraFinal = sc.nextInt(), duracao;
		
		duracao = horaInicial - HoraFinal;
		
		if (duracao < 0) {
			System.out.println("O JOGO DUROU " + (duracao) * -1 + " HORA(S)");
		} else if (horaInicial == HoraFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else {
			System.out.println("O JOGO DUROU " + (duracao - 24) * -1 + " HORA(S)");
		}
	}

}
