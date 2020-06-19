import java.util.Scanner;

public class Account {
	protected String accountNo;
	protected String customerName;
	protected double balance;
	Scanner sc = new Scanner(System.in);
	
	public Account() {
		super();
	}
	public Account(String accountNo, String customerName, double balance) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
