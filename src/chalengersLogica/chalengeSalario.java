package chalengersLogica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class chalengeSalario {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		
		Integer numeroFuncionario, horasTrabalhadas;
		Double salarioPorHora, salarioTotal;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salarioPorHora = sc.nextDouble();
		
		salarioTotal = horasTrabalhadas * salarioPorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario + "\n" + "SALARY = U$ " + df.format(salarioTotal));
		
		

	}

}
