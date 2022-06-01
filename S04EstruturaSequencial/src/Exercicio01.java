import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números

	Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int resultado = x+y;
		
		System.out.println("SOMA = "+resultado);	
		
		
	sc.close();
		
	}

}
