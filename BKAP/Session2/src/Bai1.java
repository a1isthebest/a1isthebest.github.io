import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma SV: ");
		String studentId = sc.nextLine();
		System.out.println("Nhap vao ten SV: ");
		String studentName = sc.nextLine();
		System.out.println("Nhap vao diem trung binh: ");
		int averageScore = Integer.parseInt(sc.nextLine());
		if (averageScore >= 0 && averageScore <= 10) {
			if (averageScore >= 0 && averageScore < 5) {
				System.out.println("Fail");
			} else if (averageScore >= 5 && averageScore < 7) {
				System.out.println("Passed");
			} else if (averageScore >= 7 && averageScore < 8) {
				System.out.println("Good");
			} else {
				System.out.println("Excellent");
			}
		} else {
			System.out.println("Can nhap vao diem trong khoang 0 - 10");
		}
		sc.close();
	}
}
