package Pack;
import java.util.*;
public class Att14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a hora de inicio do jogo: ");
		int hrInicio = sc.nextInt();
		System.out.println("Insira a hora de fim do jogo: ");
		int hrFim = sc.nextInt();
		int totalTempo;
		if (hrFim >= hrInicio) {
            totalTempo = hrFim - hrInicio;
        } else {
        	totalTempo = (24 - hrInicio) + hrFim;
        }
		System.out.println("A duração do jogo foi de " + totalTempo + " hora.");
	}
}