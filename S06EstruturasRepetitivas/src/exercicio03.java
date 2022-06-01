import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int alcool = 0;
		int gas = 0;
		int die = 0;

		while (x != 4) {
			if (x == 1) {
				alcool += +1;

			} else if (x == 2) {
				gas += +1;

			} else if (x == 3) {
				die += +1;

			}
			x = sc.nextInt();

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);

		sc.close();

	}
}
