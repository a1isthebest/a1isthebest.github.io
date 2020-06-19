package bkap.entity;

import java.util.Scanner;

import bkap.itf.ICity;

public class City implements ICity {
	private String cityId, cityName, Province;
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
		Province = province;
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
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
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
		System.out.println("Nhap vao ma TP: ");
		do {
			cityId = sc.nextLine();
			if (cityId.length() == 4) {
				if (cityId.charAt(0) == 'C') {
					break;
				} else {
					System.out.println("Ma thanh pho phai bat dau bang ky tu C, vui long nhap lai.");
				}
			} else {
				System.out.println("Ma thanh pho phai co 4 ky tu, vui long nhap lai.");
			}
		} while (true);
		System.out.println("Nhap vao ten TP: ");
		do {
			cityName = sc.nextLine();
			String[] str = cityName.split(" ");
			int count = 0;
			if (cityName.length() >= 10 && cityName.length() <= 60) {
				for (int i = 0; i < str.length; i++) {
					if (str[i].charAt(0) > 91) {
						count++;
					} else {

					}
				}
				if (count != 0) {
					System.out.println("Cac chu cai dau ten tinh phai viet hoa! ");
				} else {
					break;
				}

			} else {
				System.out.println("Ten thanh pho phai tu 10 - 60 ky tu.");
			}
		} while (true);
	}

	@Override
	public void displayData() {
		System.out.printf("City ID: %s - City Name: %s", cityId, cityName);
	}

}
