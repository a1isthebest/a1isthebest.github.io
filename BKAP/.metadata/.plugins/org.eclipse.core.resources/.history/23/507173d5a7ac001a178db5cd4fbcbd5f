package bkap.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bkap.entity.Student;

public class ManagementStudent {
	List<Student> ls = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ManagementStudent ms = new ManagementStudent();
		do {
			System.out.println("********************************MENU***************************");
			System.out.println("1. Nhap thong tin n sinh vien");
			System.out.println("2. Tinh diem trung binh sinh vien");
			System.out.println("3. Xet diem qua cho SV");
			System.out.println("4. Hien thi thong tin sv");
			System.out.println("5. Thoat");
			System.out.print("Lua chon cua ban la: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				ms.inputListStudent(sc);
				break;
			case 2:
				ms.calAvgListStudent();
				break;
			case 3:
				ms.passFailListStudent();
				break;
			case 4:
				ms.displayListStudent();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Nhap vao tu 1-5");
				break;
			}
		} while (true);
	}
	public void inputListStudent(Scanner sc) {
		System.out.printf("Nhap vao so SV: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Student st = new Student();
			st.inputData();
			ls.add(st);
		}
	}
	public void calAvgListStudent() {
		for (Student student : ls) {
			student.calDiemTb();
		}
		System.out.println("Da tinh xong diem TB");
	}
	public void passFailListStudent() {
		for (Student student : ls) {
			student.passFail();
		}
		System.out.println("Da xet diem qua xong");
	}
	public void displayListStudent() {
		for (Student student : ls) {
			student.displayData();
		}
	}
}
