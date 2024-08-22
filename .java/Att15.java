package Pack;
import java.util.*;
public class Att15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o salário do funcionário por hora: ");
		double salarioHora = sc.nextDouble();
		System.out.println("Quantas horas o funcionário trabalhou no mês: ");
		int horasMes = sc.nextInt();

        int horasSemana = horasMes / 4;
        double salarioBase = horasSemana * salarioHora * 4;
        double salarioTotal;

        if (horasSemana > 40) {
            int horasExtras = horasMes - 120;
            double valorHoraExtra = salarioHora * 1.5;
            salarioTotal = salarioBase + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = salarioBase;
        }
        System.out.printf("O salário total do funcionário é: R$", salarioTotal);
	}

}
