import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double salario = sc.nextDouble();
		double taxa=0.0;
		
		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario <= 3000.00) {
			taxa = (salario - 2000.00) * 0.08;
			System.out.printf("RS %.2f%n", taxa);
		} else if (salario <= 4500.00) {
			taxa = (salario - 3000.00) * 0.18 + 1000.0 * 0.08;
			System.out.printf("RS %.2f%n", taxa);
		} else {
			taxa = (salario - 4500.00) *0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("RS %.2f%n", taxa);
		}		
		sc.close();
	}

}
