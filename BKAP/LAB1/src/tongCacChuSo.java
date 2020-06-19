import java.util.Scanner;

public class tongCacChuSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen co 4 chu so: ");
		int a = Integer.parseInt(sc.nextLine());
		int hangNghin = a/1000;
		int m = a%1000;
		int hangTram = m/100;
		int n = a % 100;
		int hangChuc = n/10;
		int hangDonVi = n%10;
		System.out.printf("Tong 4 chu so la: %d", hangNghin+hangTram+hangChuc+hangDonVi);
	}
}
