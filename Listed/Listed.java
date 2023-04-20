package Listed;

import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Somelists.Listing;

public class Listed {


	public static void main(String[] args){	
		Locale.setDefault(Locale.US);
		Scanner entry = new Scanner(System.in);
		List<Listing> list = new ArrayList<>();
		
		System.out.println("How many employees you want register? ");
		int N = entry.nextInt();
		
		for (int i=0; i<N; i++) {
			System.out.print(i+1 +"# Employee" +" Insert a ID: ");
			Integer id = entry.nextInt();
			System.out.println();
			System.out.print("Insert "+ id + " name: ");
			String name = entry.next();
			System.out.println();
			System.out.print(name + " salary: $");
			Double salary = entry.nextDouble();
			Listing lst = new Listing(id, name, salary);
			list.add(lst);
			System.out.println(list);}
		
			
			
			System.out.println("Do you desire increase employee salary? Y/N");
			String yn = entry.next();
			
			switch (yn) {
			case "y":
				System.out.print("Insert employee id: ");
				int employeeid = entry.nextInt();
				
				Listing lst = list.stream().filter(x -> x.getId() == employeeid).findFirst().orElse(null);
				if (lst == null) {
					System.out.println("This id does not existis!");
				}
				else {
				System.out.println("How much percentage increase salary?");
				Double percentage = entry.nextDouble();
				lst.increaseSalary(percentage);
				System.out.println(list);
				}
			case "n":
				System.out.println(list);
				break;
			}


	entry.close();
	}}
	
