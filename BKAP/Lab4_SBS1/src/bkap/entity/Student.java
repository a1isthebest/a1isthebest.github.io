package bkap.entity;

import java.util.Scanner;

public class Student {
	private String studentId;
	private String studentName;
	private int age;
	private String phone;
	private String address;
	private boolean status;
	public Student() {
		super();
	}
	public Student(String studentId, String studentName, int age, String phone, String address, boolean status) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.status = status;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma SV: ");
		this.studentId = sc.nextLine();
		System.out.println("Nhap vao ten sV:");
		this.studentName = sc.nextLine();
		System.out.println("Nhap vao tuoi SV: ");
		this.age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao sdt: ");
		this.phone = sc.nextLine();
		System.out.println("Nhap vao dia chi: ");
		this.address = sc.nextLine();
		System.out.println("Nhap vao trang thai: ");
		this.status = Boolean.parseBoolean(sc.nextLine());
	}
	public void displayData() {
		System.out.printf("Ma SV: %d\t Ten SV: %s\t Tuoi: %d\n", this.studentId, this.studentName, this.age);
		System.out.printf("SDT: %s\t Dia chi: %s\t Trang thai: %b\n", this.phone, this.address, this.status);
	}
}
