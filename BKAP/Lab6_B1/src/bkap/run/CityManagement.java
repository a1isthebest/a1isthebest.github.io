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
				cm.displayListCity();
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
			c.inputData();
			if(lc.size() != 0)
			{
				for (int j = 0; j < lc.size(); j++) {
					if(lc.get(j).getCityId().equals(c.getCityId())) {
						System.out.println("Ma thanh pho khong duoc trung");
					} else {
						if(lc.get(j).getCityName().equals(c.getCityName())) {
							System.out.println("Ten thanh pho khong duoc trung");
						}
						else {
							lc.add(c);
						}
					}
				}
			} else {
				lc.add(c);
			}
		}
	}
	
	public void displayListCity() {
		System.out.println("Thong tin cac thanh pho: ");
		for (City city : lc) {
			city.displayData();
		}
	}
}
