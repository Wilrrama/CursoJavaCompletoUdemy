package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Legal;
import entities.Person;
import entities.Physical;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> person = new ArrayList<>();		
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char aswer = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();
			if (aswer == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenses = sc.nextDouble();
				person.add(new Physical(name, annualIncome, healthExpenses));
			} else {
				System.out.print("Number of employees: ");
				Integer employeeNumber=sc.nextInt();
				person.add(new Legal(name, annualIncome, employeeNumber));
			}
			
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		Double totalTax=0.0;		
		for (Person p : person) {
			System.out.println(p.getName()+": $ "+String.format("%.2f", p.tax()) );
			totalTax += p.tax();			
		}		
				
		System.out.println();		
		System.out.print("TOTAL TAXES: $"+String.format("%.2f", totalTax));		
		
		sc.close();
	}
}
