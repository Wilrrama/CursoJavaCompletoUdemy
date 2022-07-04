package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Product> product = new ArrayList<>();
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name:");
			String name = sc.next();			
			System.out.print("price:");
			Double price = sc.nextDouble();
			if (resp=='i') {
				System.out.print("Customs fee:");
				Double customsFee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customsFee));
			} else if (resp=='u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				product.add(new UsedProduct(name, price, manufactureDate));
			} else {
				product.add(new Product(name,price));
			}
		}
			
			System.out.println();
						
			System.out.println("PRICE TAGS:");
			for (Product list : product) {
				System.out.println(list.priceTag());
			}
			
		
				
		sc.close();
		
	}

}
