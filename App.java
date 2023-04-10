package vetores;

import java.util.Locale;
import java.util.Scanner;

import Product.Product;


public class App {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner entry = new Scanner(System.in);
		System.out.println("Insert number of products:  ");
		
		int n = entry.nextInt();	
		Product[] vect = new Product[n];
			
		for(int i=0; i<vect.length; i++) {
			int nn = i + 1;//this variable call +1 for list process
			System.out.printf("Product "+ nn +":  ");
			System.out.println();
			String name = entry.next();
			System.out.printf("Insert "+ name +" price $");
			System.out.println();
			double price = entry.nextDouble();
			vect[i] = new Product(name, price);

		}
entry.close();		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
		sum += vect[i].getPrice();
	}
			double average = sum / vect.length;
			
			System.out.printf("Average Price: $%.2f%n", average);
			
					
	entry.close();
	
}}
	
