package pack1;
import java.util.Scanner;
public class Att1 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira a idade em anos, meses e dias: ");
	int anos = sc.nextInt() * 365;
	int meses = sc.nextInt() * 30;
	int dias = sc.nextInt();
	int idade = anos + meses + dias;
	System.out.println("A idade em dias é igual a " + idade);
}
}