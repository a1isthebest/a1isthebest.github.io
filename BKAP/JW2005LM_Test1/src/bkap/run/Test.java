package bkap.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bkap.entity.Book;

public class Test {
	List<Book> book = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		do {
			System.out.println("*************************MENU************************");
			System.out.println("1. Nhap thong tin n sach ");
			System.out.println("2. Tinh loi nhuan tat ca sach ");
			System.out.println("3. Hien thi thong tin sach ");
			System.out.println("4. Sap xep theo loi nhuan giam dan");
			System.out.println("5. Hien thi 3 quyen sach co gia ban cao nhat");
			System.out.println("6. Tim kiem sach theo ten sach");
			System.out.println("7. Cho phep cap nhat tieu de sach theo ma sach");
			System.out.println("8. Thoat");
			System.out.print("Nhap vao lua chon cua ban: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				t.inputListBook(sc);
				break;
			case 2:
				t.calListBookProfit();
				break;
			case 3:
				t.displayListBook();
				break;
			case 4:
				t.sortListBookDESC();
				break;
			case 5:
				t.displayMaxPrice();
				break;
			case 6:
				t.searchBookByName(sc);
				break;
			case 7:
				t.updateTitleById(sc);
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Moi nhap vao tu 1-8");
				break;
			}
		} while (true);
	}

	public void inputListBook(Scanner sc) {
		System.out.print("Nhap so luong sach can nhap: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Book b = new Book();
			b.inputData();
			book.add(b);
		}
	}

	public void calListBookProfit() {
		for (Book book2 : book) {
			book2.calProfit();
		}
		System.out.println("Da tinh loi nhuan xong! ");
	}

	public void displayListBook() {
		for (Book book2 : book) {
			book2.displayData();
		}
	}

	public void sortListBookDESC() {
		for (int i = 0; i < book.size() - 1; i++) {
			for (int j = i + 1; j < book.size(); j++) {
				if (book.get(i).getProfit() < book.get(j).getProfit()) {
					Book temp = book.get(i);
					book.set(i, book.get(j));
					book.set(j, temp);
				}
			}
		}
		System.out.println("Da sap xep loi nhuan tang dan");
	}

	public void displayMaxPrice() {
		List<Book> book2 = new ArrayList<>();
		book2 = book;
		System.out.println("Ba sach co gia ban cao nhat la: ");
		for (int i = 0; i < book2.size() - 1; i++) {
			for (int j = i + 1; j < book2.size(); j++) {
				if (book2.get(i).getPrice() < book2.get(j).getPrice()) {
					Book temp = book2.get(i);
					book2.set(i, book2.get(j));
					book2.set(j, temp);
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			book2.get(i).displayData();
		}
	}

	public void searchBookByName(Scanner sc) {
		int count = 0;
		System.out.print("Nhap vao ten sach can tim: ");
		String searchName = sc.nextLine();
		for (Book book2 : book) {
			if (book2.getBookName().equals(searchName)) {
				book2.displayData();
				count++;
			}
		}
		if(count == 0) {
			System.out.printf("Khong tim thay sach co ten: %s\n", searchName);
		}
	}

	public void updateTitleById(Scanner sc) {
		int count = 0;
		System.out.print("Nhap vao ma sach can cap nhat: ");
		String updateId = sc.nextLine();
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getBookId().equals(updateId)) {
				System.out.print("Nhap vao tieu de sach moi: ");
				String newTitle = sc.nextLine();
				book.get(i).setTitle(newTitle);
				count++;
			} 
		}
		if(count == 0) {
			System.out.printf("Khong tim thay sach co ma: %s\n", updateId);
		}
	}
}
