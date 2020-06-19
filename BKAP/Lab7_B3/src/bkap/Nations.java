package bkap;

import java.util.Scanner;

public class Nations {
	private String nationId, nationName;
	private boolean status;
	public Nations(String nationId, String nationName, boolean status) {
		super();
		this.nationId = nationId;
		this.nationName = nationName;
		this.status = status;
	}
	public Nations() {
		super();
	}
	public String getNationId() {
		return nationId;
	}
	public void setNationId(String nationId) {
		this.nationId = nationId;
	}
	public String getNationName() {
		return nationName;
	}
	public void setNationName(String nationName) {
		this.nationName = nationName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void inputNation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma quoc gia: ");
		this.nationId = sc.nextLine();
		System.out.println("Nhap ten quoc gia: ");
		this.nationName = sc.nextLine();
		System.out.println("Nhap trang thai: ");
		this.status = Boolean.parseBoolean(sc.nextLine());
	}
	public void showNation() {
		System.out.printf("Ma: %s - Ten: %s - Trang thai: %b\n", this.nationId, this.nationName, this.status);
	}
	
}