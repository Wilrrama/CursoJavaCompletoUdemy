import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tempo;
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
							
		if (inicio>fim || inicio==fim) {
			 tempo = 24 - inicio + fim;
		} else {
			 tempo = fim - inicio;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)",tempo);
		
		sc.close();

	}

}
