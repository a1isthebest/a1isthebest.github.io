package bkap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B2 {

	Set<City> setC = new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		B2 b = new B2();
		do {
			System.out.println("***************MENU****************");
			System.out.println("1. Nhap n thanh pho");
			System.out.println("2. In ra danh sach thanh pho");
			System.out.println("3. Hien thi danh sach sap xep tang dan");
			System.out.println("4. Thoat");
			System.out.print("Lua chon: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				b.inputListCity(sc);
				break;
			case 2:
				b.showListData();
				break;
			case 3:
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("NHap vao tu 1-4");
				break;
			}
		} while (true);
	}
	public void inputListCity(Scanner sc) {
		System.out.print("Nhap vao so thanh pho: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			City c = new City();
			c.inputData();
			setC.add(c);
		}
	}
	public void showListData() {
		for (City city : setC) {
			city.showData();
		}
	}
}
