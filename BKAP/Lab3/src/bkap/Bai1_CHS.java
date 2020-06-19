package bkap;

import java.util.Scanner;

public class Bai1_CHS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu cua mang: ");
		int n = Integer.parseInt(sc.nextLine());
		int[] arrayInt = new int[n];
		do {
			System.out.println("****************MENU**********************");
			System.out.println("1. Nhap gia tri cac phan tu cua mang");
			System.out.println("2. Hien thi mang vua nhap");
			System.out.println("3. Tinh tong cac phan tu cua mang");
			System.out.println("4. In gia tri cac phan tu la chan");
			System.out.println("5. Sap xep mang tang dan");
			System.out.println("6. Thoat");
			System.out.print("Lua chon cua ban la: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				for (int i = 0; i < arrayInt.length; i++) {
					System.out.printf("Nhap vao phan tu thu %d cua mang: ", i + 1);
					arrayInt[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case 2:
				System.out.println("Mang vua nhap: ");
				for (int i = 0; i < arrayInt.length; i++) {
					System.out.printf("%d\t", arrayInt[i]);
				}
				System.out.printf("\n");
				break;
			case 3:
				int sum =0;
				for (int i = 0; i < arrayInt.length; i++) {
					sum += arrayInt[i];
				}
				System.out.printf("Tong cua cac phan tu trong mang la: %d\n", sum);
				break;
			case 4:
				System.out.print("Cac phan tu chan trong mang: ");
				for (int i = 0; i < arrayInt.length; i++) {
					if(arrayInt[i]%2 == 0) {
						System.out.printf("%d\t", arrayInt[i]);
					}
				}
				System.out.printf("\n");
				break;
			case 5:
				for (int i = 0; i < n-1; i++) {
					for (int j = i+1; j < n; j++) {
						if(arrayInt[i] > arrayInt[j]) {
							int temp = arrayInt[i];
							arrayInt[i] = arrayInt[j];
							arrayInt[j] = temp;
						}
					}
				}
				// Bubble Sort - Noi Bot
				System.out.print("Mang da sap xep tang dan: ");
				for (int i = 0; i < arrayInt.length; i++) {
					System.out.printf("%d\t", arrayInt[i]);
				}
				System.out.printf("\n");
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Nhap vao tu 1-6! ");
				break;
			}
		} while (true);
	}

}
