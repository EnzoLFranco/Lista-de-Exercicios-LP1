package pack1;
import java.util.*;
public class Att10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota do aluno: ");
		double a1 = sc.nextDouble();
		System.out.println("Insira a segunda nota do aluno: ");
		double a2 = sc.nextDouble();
		
		double media = (a1 + a2) / 2;
		System.out.println("A média do aluno é " + media);
	}
}