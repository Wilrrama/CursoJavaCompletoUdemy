import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextFloat();
		double B = sc.nextFloat();
		double C = sc.nextFloat();
		
		double triangluRetangulo = A*C / 2;
		double circulo = 3.14159 * C * C;
		double trapezio = (A+B) /2.0 * C;
		double quadrado =B*B;
		double retangulo = A*B;

		System.out.printf("TRIANGULO: %.3f%n", triangluRetangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}
