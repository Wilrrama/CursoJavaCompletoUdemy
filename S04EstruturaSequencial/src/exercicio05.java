import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
/*	Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
	o valor unit�rio de cada pe�a 1, o 	c�digo de uma pe�a 2, o n�mero de pe�as 2 e o 
	valor unit�rio de cada pe�a 2. */
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
	int cod1 = sc.nextInt();
	int qtd1 = sc.nextInt();		
	double price1 = sc.nextDouble();
	int cod2 = sc.nextInt();
	int qtd2 = sc.nextInt();
	double price2 = sc.nextDouble();
	
	double pay = qtd1*price1 + qtd2*price2;
	
	System.out.printf("VALOR A PAGAR: R$ %.2f%n",pay);
	
	sc.close();
   
	}

}
