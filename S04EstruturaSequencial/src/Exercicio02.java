import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
// Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea 
// deste c�rculo com quatrocasas decimais
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f",area);		
		
		sc.close();
	}

}
