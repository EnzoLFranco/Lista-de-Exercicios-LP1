package pack1;
import java.util.*;
public class Att6 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a temperatura em graus C°: ");
		double tempCel = sc.nextDouble();
		double tempFah = (tempCel * 1.8) + 32;
		System.out.println("A temperatura inserido em F° é " + tempFah);
	}
}
