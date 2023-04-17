package vetores;

import java.util.Locale;
import java.util.Scanner;



public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entry = new Scanner(System.in);	
		Rooms guest = null;
		Rooms guest2 = null;
		Rooms guest3 = null;
		Rooms guest4 = null;
		
		System.out.printf("Room Status: "+"\n Room 1: "+ guest +"\n Room 2: "+ guest2 +"\n Room 3: "+ guest3 +"\n Room 4: "+ guest4);
		System.out.println();
		
		while (guest == null || guest2 == null || guest3 == null || guest4 == null) {
			System.out.println("New guest: ");
			System.out.println("Name: ");
			String name = entry.next();
			System.out.println("Email: ");
			String email = entry.next();
			System.out.println("Value: ");
			double value = entry.nextDouble();
			System.out.printf("Choose room for "+ name);
			int roomnumber = entry.nextInt();
		
		
		if (guest != null && roomnumber == 1 || guest2 != null && roomnumber == 2 || guest3 != null && roomnumber == 3 || guest4 != null && roomnumber == 4 || roomnumber >= 5 || roomnumber <= 0) {
			System.out.println("!ERROR! Occupied room or Room not exist");

	}
		
		while (guest == null && roomnumber == 1) {
				guest = new Rooms(roomnumber, name, email, value);
				continue;
				
		}
			while (guest2 == null && roomnumber == 2) {
				guest2 = new Rooms(roomnumber, name, email, value);
			
			}
			while (guest3 == null && roomnumber == 3) {
				guest3 = new Rooms(roomnumber, name, email, value);
			}
	
			while (guest4 == null && roomnumber == 4) {
				guest4 = new Rooms(roomnumber, name, email, value);
			}	
			
			
		System.out.printf("Rooms: \n" + "\nRoom 1"+ guest +"\n Room 2"+ guest2 +"\n Room 3"+ guest3+"\n Room 4"+ guest4);
		}

	entry.close();
}
	}