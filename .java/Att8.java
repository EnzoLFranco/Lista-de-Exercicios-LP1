package pack1;
import java.util.*;
public class Att8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um valor: ");
		double val = sc.nextDouble();
		if (val > 0 || val == 0) {
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é negativo!");
		}
	}

}
