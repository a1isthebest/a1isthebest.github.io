package bkap.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bkap.entity.City;

public class CityManagement {
	List<City> lc = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CityManagement cm = new CityManagement();
		Scanner sc = new Scanner(System.in);
		do {
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				cm.inputListCity(sc);
				break;
			case 2:
				cm.calListConsistence();
				break;
			case 3:
				cm.displayListCity();
				break;
			case 4:
				cm.searchCityByName(sc);
				break;
			case 5:

				break;
			default:
				break;
			}
		} while (true);
	}

	public void inputListCity(Scanner sc) {
		System.out.println("Nhap vao so thanh pho: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			City c = new City();
			int count = 0;
			System.out.println("Nhap vao ma TP: ");
			do {
				c.setCityId(sc.nextLine());
				for (int j = 0; j < lc.size(); j++) {
					if (lc.get(j).getCityId().equals(c.getCityId())) {
						count++;
					}
				}
				if (count == 0) {
					if (c.getCityId().length() == 4) {
						if (c.getCityId().charAt(0) == 'C') {
							break;
						} else {
							System.out.println("Ma thanh pho phai bat dau bang ky tu C, vui long nhap lai.");
						}
					} else {
						System.out.println("Ma thanh pho phai co 4 ky tu, vui long nhap lai.");
					}
				} else {
					System.out.println("Ma da bi trung, vui long nhap ma khac");
					count--;
				}
			} while (true);

			System.out.println("Nhap vao ten TP: ");
			do {
				c.setCityName(sc.nextLine());
				int count2 = 0;
				for (int j = 0; j < lc.size(); j++) {
					if (lc.get(j).getCityName().equals(c.getCityName())) {
						count2++;
					}
				}
				if (count2 == 0) {
					String[] str = c.getCityName().split(" ");
					int count1 = 0;
					if (c.getCityName().length() >= 10 && c.getCityName().length() <= 60) {
						for (int j = 0; j < str.length; j++) {
							if (str[j].charAt(0) > 91) {
								count1++;
							} else {

							}
						}
						if (count1 != 0) {
							System.out.println("Cac chu cai dau ten tinh phai viet hoa! ");
						} else {
							break;
						}

					} else {
						System.out.println("Ten thanh pho phai tu 10 - 60 ky tu.");
					}
				} else {
					System.out.println("Ten thanh pho da ton tai");
					count2--;
				}
			} while (true);
			c.inputData();
			lc.add(c);
		}
	}

	public void calListConsistence() {
		for (int i = 0; i < lc.size(); i++) {
			lc.get(i).calConsistence();
		}
	}

	public void displayListCity() {
		System.out.println("Thong tin cac thanh pho: ");
		for (City city : lc) {
			city.displayData();
		}
	}

	public void searchCityByName(Scanner sc) {
		System.out.println("NHap vao ten thanh pho muon tim: ");
		String searchName = sc.nextLine();
		int count = 0;
		for (City city : lc) {
			if (city.getCityName().equals(searchName))
				;
			{
				city.displayData();
				count++;
			}
		}
		if (count == 0) {
			System.out.printf("Khong co thanh pho co ten: %s", searchName);
		}
	}
}
