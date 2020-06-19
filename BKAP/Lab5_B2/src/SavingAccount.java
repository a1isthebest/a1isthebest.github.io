import java.util.Scanner;

public class SavingAccount extends Account{
	protected float rate;
	protected int period;
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SavingAccount(String accountNo, String customerName, double balance, int period) {
		super(accountNo, customerName, balance);
		this.period = period;
	}

	Scanner sc = new Scanner(System.in);
	

	public void setRate(float rate) {
		this.rate = rate;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public float getRate() {
		switch (period) {
		case 1:
			rate = 0.05f;
			break;
		case 3: 
			rate = 0.055f;
			break;
		case 6:
			rate = 0.06f;
			break;
		case 12:
			rate = 0.07f;
			break;
		case 24:
			rate = 0.075f;
			break;
		case 36:
			rate = 0.08f;
			break;
		default:
			rate = 0.018f;
			break;
		}
		return rate;
	}
	public void checkInterest() {
		System.out.printf("Lai duoc huong sau %d thang la: %f\n", this.period, this.getRate());
	}
	public String toString() {
		return ("Account No: " + getAccountNo() + " - Name: " + getCustomerName() + " - Balance: " + super.getBalance()
				+ "\n Period: " +period+ " - Rate: " + rate);
	}
}
