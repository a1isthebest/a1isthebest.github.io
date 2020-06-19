import java.util.Scanner;

public class Bai13 {

	public static void main(String[] args) {
		double luongTongCong = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so gio lam: ");
		int gioLam = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap vao luong: ");
		int luong = Integer.parseInt(sc.nextLine());
		if(gioLam <= 40) {
			luongTongCong = gioLam*luong;
		} else {
			luongTongCong = (40*luong) + (gioLam - 40) * luong * 1.5;
		}
		System.out.printf("Luong tong cong cua %d gio lam la: %.0f", gioLam, luongTongCong);
	}
}
