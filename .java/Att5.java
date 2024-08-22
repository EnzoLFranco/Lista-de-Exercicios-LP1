package pack1;
import java.util.*;
public class Att5 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o salário fixo do funcionário: ");
		double salarioFix = sc.nextDouble();
		System.out.println("Insira quantos carros foram vendidos: ");
		int vendas = sc.nextInt();
		System.out.println("Insira o valor recebido por cada carro: ");
		double valorVenda = sc.nextDouble();
		System.out.println("Insira o valor total das vendas realizadas: ");
		double totalVendas = sc.nextDouble();
		double porcVendas =0.05 * totalVendas;
		double salarioFinal = salarioFix + ((valorVenda * vendas) + porcVendas);
		System.out.println("O salário final do funcionário é igual a R$" + salarioFinal);
	}
}
