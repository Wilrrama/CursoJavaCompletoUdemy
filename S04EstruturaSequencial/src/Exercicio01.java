import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
// Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros

	Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int resultado = x+y;
		
		System.out.println("SOMA = "+resultado);	
		
		
	sc.close();
		
	}

}
