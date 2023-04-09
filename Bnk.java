package data;

public class Bnk {
	
	public int account;
	public String name;
	private double balance;

	public Bnk(int account, String name) {
		this.account = account;
		this.name = name;
}
	
	public Bnk(int account, String name, double initialBalance) {
		this.account = account;
		this.name = name;
		deposit(initialBalance);
		
	}


	public int getAccount() {
		return account;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account number "
				+ account
				+ ", Holder name: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
	
