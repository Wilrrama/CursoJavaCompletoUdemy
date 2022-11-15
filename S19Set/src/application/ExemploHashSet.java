package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		System.out.println("HashSet - não mantem a ordem, mais rápido");
		
		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
				
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
				
	}
}
