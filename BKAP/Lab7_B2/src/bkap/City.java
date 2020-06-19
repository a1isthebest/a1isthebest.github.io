package bkap;

import java.util.Scanner;

public class City {
	private String cityId, cityName;
	private boolean status;
	public City(String cityId, String cityName, boolean status) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.status = status;
	}
	public City() {
		super();
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma tp: ");
		this.cityId = sc.nextLine();
		System.out.println("Nhap ten tp: ");
		this.cityName = sc.nextLine();
		System.out.println("Nhap trang thai: ");
		this.status = Boolean.parseBoolean(sc.nextLine());
	}
	public void showData() {
		System.out.printf("City ID: %s - City Name: %s - City Status: %b\n", this.cityId, this.cityName, this.status);
	}
}
