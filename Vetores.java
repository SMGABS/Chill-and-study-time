package vetores;

import java.util.Locale;
import java.util.Scanner;


	public class Vetores {
	
	
	
		public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner entry = new Scanner(System.in);
		System.out.println("Insert number of peoples:  ");
		int n = entry.nextInt();
		System.out.println();
		
		double[] vect = new double[n];//created vetor for n"number of peoples" n = number of heights//
		
		
		for(int i=0; i<n; i++) {
			int f = 1;
			int nn = f + i;
			System.out.printf("Insert Height "+ nn +":  ");//a nn and f variable just created for better format for print.
			System.out.println();
			vect[i] = entry.nextDouble();

		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
		sum += vect[i]; //
	}
			double average = sum / n;
			
			System.out.printf("Average Height: %.2f%n", average);
			
					
	entry.close();
	
}
	}
