import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double total = 0.0;
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		if (cod == 1) {
			total = qtd * 4.0;
		} else if (cod==2) {
			total = qtd * 4.5;
		} else if (cod==3) {
			total = qtd * 5.0;
		} else if (cod==4) {
			total = qtd * 2.0;
		} else if (cod==5) {
			total = qtd * 1.5;
		} else {
			System.out.println("Codigo inexistente!");
		}
				
		System.out.printf("Total: R$ %.2f%n",total);
				
		sc.close();

	}

}
