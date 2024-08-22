package pack1;
import java.util.*;
public class Att9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a quantia de maçãs compradas: ");
		int qtdMaca = sc.nextInt();
		double valTotal = 0;
		if (qtdMaca < 12) {
			valTotal = 1.3 * qtdMaca;
		} else if (qtdMaca >= 12) {
			valTotal = qtdMaca;
		}
		System.out.println("O valor total da venda é de R$" + valTotal);
	}

}
