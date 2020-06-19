import java.util.Scanner;

public class trungBinhDiem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float toan,ly,hoa;
		System.out.println("Nhap vao diem toan: ");
		toan = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao diem ly: ");
		ly = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao diem hoa: ");
		hoa = Float.parseFloat(sc.nextLine());
		float avg = (toan+ly+hoa) / 3;
		System.out.printf("Diem trung binh 3 mon toan ly hoa la: %f", avg);
	}
}
