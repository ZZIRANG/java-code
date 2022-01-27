package pro01;

class BankAccount {
	String name;
	double balance;
	static int count;
	
	BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
		count++;
	}

}
