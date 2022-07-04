package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <Employee> emp = new ArrayList<>();
		
		System.out.print("Enter the number of employees:");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)? ");
			char resp = sc.next().charAt(0);			
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours:");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour:");
			Double valuePerHour = sc.nextDouble();
			if( resp== 'y') {
				System.out.print("Additional charge:");
				double additionalCharge = sc.nextDouble();
				emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				emp.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS");
		for (Employee list : emp) {
			System.out.println(list.getName()+" - $ "+ String.format("%.2f", list.payment()));
		}
		
		
		sc.close();
		

	}

}
