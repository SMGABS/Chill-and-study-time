package Matrizsys;

import java.util.Scanner;

public class Matrized {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		System.out.println("Matriz size m ");
		int m = entry.nextInt();
		System.out.println("Matriz size n ");
		int n = entry.nextInt();
		int[][] mat = new int[n][m];
		System.out.println("Example matriz type: ");
		System.out.printf("0,0,0..."+"\n"+ "0,0,0..."+ "\n"+ "0,0,0..."+ "\n"+ "."+ "\n"+"."+"\n"+".");
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = entry.nextInt();
			}
	}
		
	
		
		System.out.println("set middle number");
		int x = entry.nextInt();
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position "+ i + " , " + j +".");
					if (j > 0) {
						System.out.println("Left: "+ mat[i][j-1]);
					if (i > 0) {
						System.out.println("Right: "+ mat[i-1][j]);
					if (j < mat[i].length-1) {
						System.out.println("Up: "+ mat[i][j+1]);
					if (i < mat.length-1) {
						System.out.println("Down:"+ mat[i+1][j]);
					}
					}
					}
				}
		}
		entry.close();
}}}}