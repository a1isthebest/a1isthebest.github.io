import java.util.Scanner;

public class Bai1_TuLam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so thu 1: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao so thu 2: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao so thu 3: ");
		int c = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao so thu 4: ");
		int d = Integer.parseInt(sc.nextLine());
		int max = a;
		if (b > max) {
			max = b;
		} if (c > max) {
			max = c;
		} if (d > max){
			max = d;
		}
		System.out.printf("So lon nhat la: %d", max);
		sc.close();
	}
}
