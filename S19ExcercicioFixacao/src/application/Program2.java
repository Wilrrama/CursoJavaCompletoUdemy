package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> A = new HashSet<>();
		Set<String> B = new HashSet<>();
		Set<String> C = new HashSet<>();
		
		System.out.print("Houw many students for course A? ");
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			String name = sc.next();
			A.add(name);
		}
		
		System.out.print("Houw many students for course B? ");
		n = sc.nextInt();
		for (int i=0;i<n;i++) {
			String name = sc.next();
			B.add(name);
		}
		
		System.out.print("Houw many students for course C? ");
		n = sc.nextInt();
		for (int i=0;i<n;i++) {
			String name = sc.next();
			C.add(name);
		}
		
		Set<String> total = new HashSet<>(A);
		total.addAll(B);
		total.addAll(C);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();

	}

}
