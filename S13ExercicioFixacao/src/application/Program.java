package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name= sc.nextLine();		
		System.out.print("Email: ");
		String email=sc.nextLine();		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i=1; i<=n;i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Produtc name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Produtc price: ");
			Double priceProduct = sc.nextDouble();
			
			Product product = new Product(nameProduct, priceProduct);
			
			System.out.print("Quantity: ");
			Integer qtdProduct = sc.nextInt();	
			
			OrderItem orderItem = new OrderItem(qtdProduct, priceProduct, product);
			
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		sc.close();
		

	}

}
