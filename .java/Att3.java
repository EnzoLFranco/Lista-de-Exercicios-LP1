package pack1;
import java.util.Scanner;
public class Att3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o salario atual: ");
		double salario = sc.nextDouble();
		System.out.println("Insira a % reajuste: ");
		double reajuste = sc.nextDouble();
		
		double salarioFinal = salario - ((reajuste / 100) * salario);
		System.out.println("O salário final do funcionário é de R$" + salarioFinal);
		
	}
}
