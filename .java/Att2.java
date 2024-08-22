package pack1;
import java.util.Scanner;
public class Att2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o total de eleitores: ");
		int totalEleit = sc.nextInt();
		System.out.println("Insira a quantia de votos nulos: ");
		int nulo = sc.nextInt();
		System.out.println("Insira a quantia de votos brancos: ");
		int branco = sc.nextInt();
		System.out.println("Insira a quantia de votos validos: ");
		int valido = sc.nextInt();
		
		double porcNulo = (nulo / totalEleit) * 100;
		double porcBranco = (branco / totalEleit) * 100;	
		double porcValido = (valido / totalEleit) * 100;
		
		System.out.println("Porcentagem de votos nulos: " + porcNulo + "%");
		System.out.println("Porcentagem de votos brancos: " + porcBranco + "%");
		System.out.println("Porcentagem de votos validos: " + porcValido + "%");
	}

}
