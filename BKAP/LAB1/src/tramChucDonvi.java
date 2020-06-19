import java.util.Scanner;

public class tramChucDonvi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen co 3 chu so: ");
		int a = Integer.parseInt(sc.nextLine());
		int hangTram = a/100;
		int n = a % 100;
		int hangChuc = n/10;
		int hangDonVi = n%10;
		System.out.printf("Hang tram la: %d\tHang chuc la: %d\tHang don vi la: %d", hangTram, hangChuc, hangDonVi);
	}
}
