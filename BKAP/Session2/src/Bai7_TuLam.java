import java.util.Scanner;

public class Bai7_TuLam {

	public static void main(String[] args) {
		int n;
		int giaiThua = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap vao so nguyen duong tu 2-10!");
			n = Integer.parseInt(sc.nextLine());
		} while(n <2 || n >10);
		for(int i = 1; i<= n; i++) {
			giaiThua*=i;
		}
		System.out.printf("Giai thua cua %d la: %d", n,giaiThua);
		sc.close();
	}

}
