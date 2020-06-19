import java.util.Scanner;

public class PersonAccount extends Account {
	protected double fee;
	Scanner sc = new Scanner(System.in);

	public PersonAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonAccount(String accountNo, String customerName, double balance, double fee) {
		super(accountNo, customerName, balance);
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void deposite(float depositeMoney) {
		super.balance += depositeMoney;
	}

	public void withDraw(float drawMoney) {
		balance -= (drawMoney + fee);
	}

	public String toString() {
		return ("Account No: " + getAccountNo() + " - Name: " + getCustomerName() + " - Balance: " + getBalance()
				+ "\n Fee: " + fee);
	}
}
