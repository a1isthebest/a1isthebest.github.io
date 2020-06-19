import java.util.Scanner;

public class sinhVien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String studentId,studentName,phoneNumber, mail, address, sex;
		int age;
		System.out.println("Nhap vao ma SV: ");
		studentId = sc.nextLine();
		System.out.println("Nhap vao ten SV: ");
		studentName = sc.nextLine();
		System.out.println("Nhap vao tuoi SV: ");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao so DT: ");
		phoneNumber = sc.nextLine();
		System.out.println("Nhap vao mail: ");
		mail = sc.nextLine();
		System.out.println("Nhap vao gioi tinh: ");
		sex = sc.nextLine();
		System.out.println("Nhap vao dia chi: ");
		address = sc.nextLine();
		System.out.printf("Ma SV: %s\tTen SV: %s\nTuoi: %d\tSo DT: %s\tMail: %s\nGioi Tinh: %s\tDia Chi: %s", studentId, studentName, age, phoneNumber, mail, sex, address);
	}
}
