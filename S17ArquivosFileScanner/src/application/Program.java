package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File arquivo = new File ("i:\\Temp\\\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());				
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if ( sc != null) {
				sc.close();
			}			
		}			
	}
}
