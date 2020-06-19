package bkap.entity;

import java.util.Scanner;

public class Employee {
	private String employeeId;
	private String employeeName;
	private int age;
	private float rate;
	private float salary;
	private boolean employeeStatus;
	public Employee() {
		super();
	}
	public Employee(String employeeId, String employeeName, int age, float rate, float salary, boolean employeeStatus) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.rate = rate;
		this.salary = salary;
		this.employeeStatus = employeeStatus;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public boolean isEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma nhan vien: ");
		this.employeeId = sc.nextLine();
		System.out.println("Nhap vao ten nhan vien: ");
		this.employeeName = sc.nextLine();
		System.out.println("Nhap vao tuoi nhan vien: ");
		this.age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao he so luong: ");
		this.rate = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao trang thai nhan vien: ");
		this.employeeStatus = Boolean.parseBoolean(sc.nextLine());
	}
	public void displayData() {
		System.out.printf("Ma NV: %s\t Ten NV: %s\t Tuoi: %d\n", this.employeeId, this.employeeName, this.age);
		System.out.printf("He so luong: %f\t Luong: %f\t Trang thai: %b\n", this.rate, this.salary, this.employeeStatus);
	}
	public void calSalary() {
		this.salary = this.rate * 1300000;
	}
	public String toString() {
		return super.toString();
	}
}
