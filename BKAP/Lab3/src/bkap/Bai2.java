package bkap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu cua mang: ");
		int n = Integer.parseInt(sc.nextLine());
		int[] arrayInt = new int[n];
		do {
			System.out.println("****************MENU**********************");
			System.out.println("1. Nhap gia tri cac phan tu cua mang");
			System.out.println("2. Hien thi mang vua nhap");
			System.out.println("3. In ra phan tu co gia tri lon nhat, nho nhat");
			System.out.println("4. In ra phan tu co gia tri la so nguyen to");
			System.out.println("5. In ra phan tu co gia tri la so hoan hao");
			System.out.println("6. Sap xep mang giam dan");
			System.out.println("7. Thoat");
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
				break;
			case 3:
				int max = arrayInt[0];
				int min = arrayInt[0];
				for (int i = 0; i < arrayInt.length; i++) {
					if (max < arrayInt[i]) {
						max = arrayInt[i];
					}
				}
				System.out.printf("Max: %d\n", max);
				for (int i = 0; i < arrayInt.length; i++) {
					if (min > arrayInt[i]) {
						min = arrayInt[i];
					}
				}
				System.out.printf("Min: %d\n", min);
				break;
			case 4:
				System.out.print("Cac so nguyen to la: ");
				for (int i = 0; i < arrayInt.length; i++) {
					if(checkNguyenTo(arrayInt[i])) {
						System.out.printf("%d\t", arrayInt[i]);
					}
				}
				System.out.printf("\n");
				break;
			case 5:
				System.out.print("Cac so hoan hao: ");
				for (int i = 0; i < arrayInt.length; i++) {
					if(checkHoanHao(arrayInt[i])) {
						System.out.printf("%d\t", arrayInt[i]);
					}
				}
				System.out.printf("\n");
				break;
			case 6:
		        int temp = arrayInt[0];
				for (int i = 0 ; i < arrayInt.length - 1; i++) {
		            for (int j = i + 1; j < arrayInt.length; j++) {
		                if (arrayInt[i] < arrayInt[j]) {
		                    temp = arrayInt[j];
		                    arrayInt[j] = arrayInt[i];
		                    arrayInt[i] = temp;
		                }
		            }
		        }
				System.out.println("Day la day so giam dan:");
				for (int i = 0; i < arrayInt.length; i++) {
					System.out.printf("%d\t", arrayInt[i]);
				}
				System.out.printf("\n");
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Nhap vao tu 1-7! ");
				break;
			}
		} while (true);
	}
	
	public static boolean checkNguyenTo(int n) {
		if (n <= 2) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}
	public static boolean checkHoanHao(int n) {
		int sum = 0;
		for(int i = 1; i<=n/2; i++) {
			if(n%i == 0) {
				sum+=i;
			}
		}
		if(sum == n) return true;
		return false;
	}
}
