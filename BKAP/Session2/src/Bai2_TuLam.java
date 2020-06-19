import java.util.Scanner;

public class Bai2_TuLam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao thang: ");
		int thang = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao nam: ");
		int nam = Integer.parseInt(sc.nextLine());
		if(thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
			System.out.printf("Thang %d nam %d co 31 ngay.", thang, nam);
		} else if(thang == 2) {
			if(nam % 4 == 0) {
				System.out.printf("Thang %d nam %d co 29 ngay.", thang, nam);
			} else {
				System.out.printf("Thang %d nam %d co 28 ngay.", thang, nam);
			}
		} else {
			System.out.printf("Thang %d nam %d co 30 ngay.", thang, nam);
		}
		sc.close();
	}
}
