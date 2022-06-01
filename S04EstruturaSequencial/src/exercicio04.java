import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
	//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
	//o valor que recebe por hora e calcula o salário desse funcionário
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int hours = sc.nextInt();
		double priceHours = sc.nextDouble();
		
		System.out.println("NUMBER = "+number);
		
		double sal = hours * priceHours;
		
		System.out.printf("SALARY = U$ %.2f%n",sal);
		
		
		
		
		sc.close();

	}

}
