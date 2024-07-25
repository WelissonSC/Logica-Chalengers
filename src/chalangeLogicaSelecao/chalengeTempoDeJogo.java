package chalangeLogicaSelecao;

import java.util.Scanner;

public class chalengeTempoDeJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer horaInicial = sc.nextInt(), minutoInicial = sc.nextInt(), horaFinal = sc.nextInt(),
				minutoFinal = sc.nextInt(), totalHora, totalMinuto, resultado = 0, hora24 = 24 * 60;

		totalHora = (horaInicial * 60) + minutoInicial;
		totalMinuto = (horaFinal * 60) + minutoFinal;

		if (totalMinuto > totalHora) {
			resultado = totalMinuto - totalHora;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (resultado / 60), (resultado % 60));
		} else if (totalHora > totalMinuto) {
			resultado = (hora24 - totalHora) + totalMinuto;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (resultado / 60), (resultado % 60));
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 24, 0);
		}

	}

}
