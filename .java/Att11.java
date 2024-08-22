package pack1;
import java.util.*;
public class Att11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o ano atual: ");
		int anoAtual = sc.nextInt();
		System.out.println("Insira o ano de nascimento: ");
		int anoNasc = sc.nextInt();
		int idade = anoAtual - anoNasc;
		if (idade >= 18){
			System.out.println("O usuário pode votar!");
		} else{
			System.out.println("O usuário não pode votar!");
		}
		
	}
}