package Pack;
import java.util.*;
public class Att17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da Prova 1 (P1): ");
        double P1 = sc.nextDouble();

        System.out.print("Digite a nota da 1ª Lista de Exercícios (E1): ");
        double E1 = sc.nextDouble();

        System.out.print("Digite a nota da 2ª Lista de Exercícios (E2): ");
        double E2 = sc.nextDouble();

        System.out.print("Digite a nota do Projeto (API): ");
        double API = sc.nextDouble();

        double mediaPreliminar = (P1 * 0.6) + ((E1 + E2) / 2) * 0.4;
        double mediaIntermediaria = (mediaPreliminar * 0.5) + 
                                    (Math.max((mediaPreliminar - 5.9), 0) / (mediaPreliminar - 5.9)) * (API * 0.5);

        double mediaFinal;
        if (mediaIntermediaria >= 6.0) {
            mediaFinal = mediaIntermediaria;
        } else {
            System.out.print("Digite a nota do Exame: ");
            double X = sc.nextDouble();
            System.out.print("Digite a nota da SUB: ");
            double SUB = sc.nextDouble();
            mediaFinal = mediaIntermediaria + X + (SUB * 0.2);
        }

        System.out.printf("A média final de LP1 é: %.2f\n", mediaFinal);
    }

	}


