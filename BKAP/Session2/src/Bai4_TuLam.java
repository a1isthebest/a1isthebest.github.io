import java.util.Scanner;

public class Bai4_TuLam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Nhap vao canh thu 1: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao canh thu 2: ");
		b = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao canh thu 3: ");
		c = Integer.parseInt(sc.nextLine());
		if ((a + b > c) || (a + c > b) || (b + c) > a) {
			if (a == b && a == c && b == c) {                           
				System.out.println("Day la tam giac deu");
			} else if ((a == b) || (a == c) || (b == c)) {
				System.out.println("Day la tam giac can");
			} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
				System.out.println("Day la tam giac vuong");
			}
		} else {
			System.out.println("Day khong phai tam giac!");
		}
		sc.close();
	}
}
