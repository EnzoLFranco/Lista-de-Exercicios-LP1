package pack1;
import java.util.*;
public class Att4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o custo de fabricação do carro: ");
		double custoFab = sc.nextDouble();
		double taxaDist = 0.28 * custoFab;
		double imposto = 0.45 * custoFab;
		double valorTotal = custoFab + (taxaDist + imposto);		
		System.out.println("O valor final do carro é R$" + valorTotal);
	}

}
