import java.util.Scanner;

public class binhPhuong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen a: ");
		int a = Integer.parseInt(sc.nextLine());
		int binhPhuong = a*a;
		System.out.printf("Binh phuong cua so %d la: %d", a, binhPhuong);
	}
}
