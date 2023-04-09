//This exercise ask to create an code for a bank, a example say:
//Enter account number, name of account holder, an initial deposit?y/n
//if yes call to deposit of initial value, if no just follow with account
//in example of exercise deposit comes before withdraw.


package application;

import java.util.Locale;

import java.util.Scanner;

import data.Bnk;

public class Application {



	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	//want an account number
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		System.out.println();
		Bnk bank;
//*make number write a account number
		
	//want an name for account holder**\	
		System.out.print("Name of account holder: ");
		System.out.println();
		sc.nextLine();
		String name = sc.next();
		
	//makes a string write a people name

	//ask, wish do a deposit and start switch/case for yes or no
		System.out.print("Do you wish do an initial deposit?[y/n]");
		System.out.println();
		
		String yn = sc.next();
		switch (yn) {
		case "y":
			System.out.println("How much do you want deposit?  ");
			double initialBalance = sc.nextDouble();
			bank = new Bnk(account, name, initialBalance);
			System.out.println();
			System.out.println("Account data:  ");
			System.out.println(bank);
			System.out.println("Enter deposit value: ");
			double depositValue = sc.nextDouble();
			bank.deposit(depositValue);
			System.out.println(bank);
			System.out.println("Enter withdraw value: ");
			double withdrawValue = sc.nextDouble();
			bank.withdraw(withdrawValue);
			System.out.println(bank);
			break;
			
			
		case "n":
			bank = new Bnk(account, name);
			System.out.println();
			System.out.println("Account data:  ");
			System.out.println(bank);
			System.out.println("Enter deposit value: ");
			double depositValue2 = sc.nextDouble();
			bank.deposit(depositValue2);
			System.out.println(bank);
			System.out.println("Enter withdraw value: ");
			double withdrawValue2 = sc.nextDouble();
			bank.withdraw(withdrawValue2);
			System.out.println(bank);
			break;
			
		default: {
			System.out.println("error! try write again.");
			break;
		}
		}
		sc.close();
	}
	}
