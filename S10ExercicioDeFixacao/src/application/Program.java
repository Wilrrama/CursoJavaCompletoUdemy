package application;

import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
							
		Students[] stu = new Students[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for ( int i =1 ; i<=n ; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			stu[room] = new Students(name,email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10;i++ ) {
			if (stu[i] != null) {
				System.out.println(i + ": "+ stu[i]);
			}
		}		
		sc.close();
	}
}
