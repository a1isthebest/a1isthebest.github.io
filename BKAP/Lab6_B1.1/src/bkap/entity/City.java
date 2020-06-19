package bkap.entity;

import java.util.Scanner;

import bkap.itf.ICity;

public class City implements ICity {
	private String cityId, cityName, province;
	private double area, consistence;
	private int population;
	private boolean cityStatus;

	public City() {
		super();
	}

	public City(String cityId, String cityName, String province, double area, double consistence, int population,
			boolean cityStatus) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.province = province;
		this.area = area;
		this.consistence = consistence;
		this.population = population;
		this.cityStatus = cityStatus;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getConsistence() {
		return consistence;
	}

	public void setConsistence(double consistence) {
		this.consistence = consistence;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public boolean isCityStatus() {
		return cityStatus;
	}

	public void setCityStatus(boolean cityStatus) {
		this.cityStatus = cityStatus;
	}

	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ten tinh ma thanh pho thuoc: ");
		this.province = sc.nextLine();
		if (this.province.isEmpty()) {
			this.province = "Trung Uong";
		}
		System.out.println("Nhap vao dien tich: ");
		do {
			try {
				this.area = Double.parseDouble(sc.nextLine());
				if (this.area > 0) {
					break;
				} else {
					System.out.println("Dien tich phai lon hon 0, vui long nhap lai");
				}
			} catch (NumberFormatException ex) {
				System.out.println("Ban phai nhap vao so thuc, vui long nhap lai !");
			}
		} while (true);
		System.out.println("Nhap vao dan so: ");
		do {
			try {
				this.population = Integer.parseInt(sc.nextLine());
				if (this.population > 0) {
					break;
				} else {
					System.out.println("Dan so phai lon hon 0, vui long nhap lai");
				}
			} catch (NumberFormatException ex) {
				System.out.println("Ban phai nhap vao so nguyen, vui long nhap lai");
			}
		} while (true);
		System.out.println("Nhap vao trang thai thanh pho: ");
		do {
			String trangThai = sc.nextLine();
			if(trangThai.equals("true") || trangThai.equals("false")) {
				this.cityStatus = Boolean.parseBoolean(trangThai);
				break;
			}
			else {
				System.out.println("Trang thai phai la true hoac false. ");
			}
		} while(true);
	}
	public void calConsistence() {
		this.consistence = this.population / this.area;
	}
	@Override
	public void displayData() {
		System.out.printf("City ID: %s - City Name: %s - Province: %s\n Area: %f - Population: %d - Status: %b\n", cityId,
				cityName, province, area, population, cityStatus);
	}

}
