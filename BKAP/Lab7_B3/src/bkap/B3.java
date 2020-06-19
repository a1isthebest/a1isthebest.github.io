package bkap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class B3 {

private AtomicInteger counter = new AtomicInteger(0);
private Map<Integer, Nations> listN = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		B3 b = new B3();
		do {
			System.out.println("***************MENU****************");
			System.out.println("1. Nhap n quoc gia");
			System.out.println("2. In ra danh sach quoc gia");
			System.out.println("3. Hien thi danh sach sap xep tang dan theo ten");
			System.out.println("4. Thoat");
			System.out.print("Lua chon: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				b.inputListNations(sc);
				break;
			case 2:
				b.showListNations();
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
	public void inputListNations(Scanner sc) {
		System.out.println("Nhap so quoc gia: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Nations na = new Nations();
			na.inputNation();
			listN.put(counter.getAndIncrement(), na);
		}
	}
	public void showListNations() {
		for (int i = 0; i < listN.size(); i++) {
			listN.get(i).showNation();
		}
	}
	public void sortByName() {
		Collections.sort(listN, new Comparator<Nations>() {
			@Override
			public int compare(Nations o1, Nations o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}
}
