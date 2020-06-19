import java.util.Scanner;

public class toanTu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Nhap vao so a: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao so b: ");
		b = Integer.parseInt(sc.nextLine());
		int cong = a+b;
		int tru = a - b;
		int nhan = a*b;
		int chia = a/b;
		System.out.printf("Tong la: %d\tHieu la: %d\nTich la: %d\tThuong la: %d", cong, tru, nhan, chia);
	}

}
