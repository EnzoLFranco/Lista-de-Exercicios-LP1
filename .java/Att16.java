package Pack;
import java.util.*;
public class Att16 {
	public static void main(String[] args) {
		int janeiro = 15000;
        int fevereiro = 23000;
        int março = 17000;

        int despesaTotal = janeiro + fevereiro + março;

        double mediaMensal = despesaTotal / 3.0;

        System.out.println("A despesa total no trimestre foi de R$" + despesaTotal);
        System.out.printf("A média mensal de gastos foi de R$", mediaMensal);

	}

}
