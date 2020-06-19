import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonAccount pa = new PersonAccount("001", "NHH", 200000, 100);
		pa.deposite(10000);
		System.out.println("Thong tin tai khoan sau khi gui tien la: ");
		System.out.println(pa.toString());
		pa.withDraw(50000);
		System.out.println("Thong tin tai khoan sau khi rut tien la: ");
		System.out.println(pa.toString());
		
		SavingAccount sa = new SavingAccount("002", "BTKH", 5000000, 12);
		sa.checkInterest();
		System.out.println("Thong tin tai khoan tiet kiem: ");
		System.out.println(sa.toString());
	}

}
