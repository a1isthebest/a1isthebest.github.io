package bkap.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	List<Employee> arrEmployee = new ArrayList<>();
	
	public static void main(String[] args) {
		Test t = new Test();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("********************MENU************************");
			System.out.println("1. Nhap thong tin cho n nhan vien");
			System.out.println("2. Tinh luong tat ca nhan vien");
			System.out.println("3. Hien thi thong tin tat ca nhan vien");
			System.out.println("4. Sap xep nhan vien theo luong tang dan");
			System.out.println("5. Tim kiem nhan vien theo ten nhan vien");
			System.out.println("6. Cap nhat trang thai nhan vien theo ma nhan vien");
			System.out.println("7. Thoat");
			System.out.print("Lua chon cua ban la: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				t.inputListEm(sc);
				break;
			case 2:
				t.calSalaryListEm();
				break;
			case 3:
				t.displayListEm();
				break;
			case 4:
				t.sortSalaryEm();
				break;
			case 5:
				t.searchNameEm(sc);
				break;
			case 6:
				t.updateStatusEm(sc);
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Xin moi nhap vao tu 0-7");
				break;
			}
		} while (true);
	}

	public void inputListEm(Scanner sc) {
		System.out.printf("Nhap vao so nhan vien: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Employee empl = new Employee();
			empl.inputData();
			arrEmployee.add(empl);
		}
	}

	public void calSalaryListEm() {
		for (Employee emp : arrEmployee) {
			emp.calSalary();
		}
		System.out.println("Da tinh luong xong! ");
	}

	public void displayListEm() {
		for (Employee emp : arrEmployee) {
			emp.displayData();
		}
	}

	public void sortSalaryEm() {
		for (int i = 0; i < arrEmployee.size() - 1; i++) {
			for (int j = i + 1; j < arrEmployee.size(); j++) {
				if (arrEmployee.get(i).getSalary() > arrEmployee.get(j).getSalary()) {
					Employee temp = arrEmployee.get(i);
					arrEmployee.set(i, arrEmployee.get(j));
					arrEmployee.set(j, temp);
				}
			}
		}
		System.out.println("Da sap xep luong tang dan!");
	}

	public void searchNameEm(Scanner sc) {
		System.out.print("Nhap vao ten NV can tim: ");
		String searchName = sc.nextLine();
		for (int i = 0; i < arrEmployee.size(); i++) {
			if (arrEmployee.get(i).getEmployeeName().equals(searchName)) {
				arrEmployee.get(i).displayData();
			} else
				System.out.printf("Khong tim thay nhan vien co ten: %s", searchName);
		}
	}

	public void updateStatusEm(Scanner sc) {
		System.out.println("Nhap vao ma NV can cap nhat trang thai: ");
		String updateId = sc.nextLine();
		for (int i = 0; i < arrEmployee.size(); i++) {
			if (arrEmployee.get(i).getEmployeeId().equals(updateId)) {
				arrEmployee.get(i).setEmployeeStatus(!arrEmployee.get(i).isEmployeeStatus());
			} else {
				System.out.printf("Khong tim thay nhan vien ma: %s", updateId);
			}
		}
		System.out.println("Da cap nhat trang trai xong!");
	}
}
