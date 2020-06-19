package bkap.entity;

import java.util.Scanner;

import bkap.itf.IStudent;

public class Student implements IStudent {
	Scanner sc = new Scanner(System.in);
	private String studentId;
	private String studentName;
	private int age;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTb;
	private boolean studentStatus;

	@Override
	public void inputData() {
		System.out.println("Nhap vao ma sv: ");
		studentId = sc.nextLine();
		System.out.println("Nhap vao ten sv: ");
		studentName = sc.nextLine();
		System.out.println("Nhap vao tuoi sv: ");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao diem toan: ");
		diemToan = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao diem ly: ");
		diemLy = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao diem hoa: ");
		diemHoa = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao trang thai: ");
		studentStatus = Boolean.parseBoolean(sc.nextLine());
	}

	@Override
	public void displayData() {
		System.out.printf(
				"Ma SV: %s\t Ten SV: %s\t Tuoi: %d\t Diem toan: %.1f\t Diem Ly: %.1f\t Diem Hoa: %.1f\t Diem TB: %f\t Trang Thai: %b\t Xet diem qua: %s\n",
				this.studentId, this.studentName, this.age, this.diemToan, this.diemLy, this.diemHoa, this.calDiemTb(),
				this.studentStatus, this.passFail());
	}

	public float calDiemTb() {
		diemTb = (this.diemToan + this.diemLy + this.diemHoa) / 3;
		return diemTb;
	}

	public String passFail() {
		String str = "";
		if (calDiemTb() > MARK_PASS) {
			str = "PASS";
		} else
			str = "FAIL";
		return str;
	}
}
