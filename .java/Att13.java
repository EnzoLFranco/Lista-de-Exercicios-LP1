package Pack;
import java.util.*;
public class Att13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro valor: ");
		double val = sc.nextDouble();
		System.out.println("Insira o segundo valor: ");
		double val2 = sc.nextDouble();
		if(val > val2) {
			System.out.println(val2 + " , " + val);
		} else if(val < val2){
			System.out.println(val + " , " + val2);
		} else {
			System.out.println("Os valores são iguais.");
		}

	}

}
