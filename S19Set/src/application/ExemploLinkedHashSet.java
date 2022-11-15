package application;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		
		System.out.println("LinkedHashSet");
		
		Set<String> set = new LinkedHashSet<>();
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
				
		//set.remove("Tv");
		//set.removeIf(x -> x.length() >=3);
		set.removeIf(x -> x.charAt(0)=='T');
		
		
		System.out.println(set.contains("Notebook"));
		
		
		for (String p : set) {
			System.out.println(p);
		}
				
	}
}
