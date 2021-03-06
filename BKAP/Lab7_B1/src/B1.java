import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class B1 {
	List<Integer> listInt = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		B1 b = new B1();
		do {
			System.out.println("**************MENU**************");
			System.out.println("1. Nhap danh sach n so nguyen");
			System.out.println("2. Hien thi danh sach ra man hinh");
			System.out.println("3. Hien thi danh sach sap xep tang dan");
			System.out.println("4. Thoat");
			System.out.print("Lua chon cua ban la: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				b.inputListInt(sc);
				break;
			case 2:
				b.showListInt();
				break;
			case 3:
				b.sortASD();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Nhap vao tu 1-4");
				break;
			}
		} while (true);
	}
	public void inputListInt(Scanner sc) {
		System.out.println("Nhap vao so luong so nguyen");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.nextLine());
			listInt.add(a);
		}
	}
	public void showListInt() {
		for (Integer integer : listInt) {
			System.out.println(integer);
		}
	}
	public void sortASD() {
		Collections.sort(listInt);
		System.out.println("Danh sach sau khi sap xep");
		for (Integer integer : listInt) {
			System.out.println(integer);
		}
	}
}
