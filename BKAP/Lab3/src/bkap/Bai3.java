package bkap;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so dong cua mang: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap vao so cot cua mang: ");
		int m = Integer.parseInt(sc.nextLine());
		int[][] arrayTwo = new int[n][m];
		do {
			System.out.println("****************MENU**********************");
			System.out.println("1. Nhap gia tri cac phan tu cua mang");
			System.out.println("2. Hien thi mang vua nhap theo ma tran");
			System.out.println("3. In gia tri cac phan tu nam tren duong bien");
			System.out.println("4. In gia tri va tong cac phan tu nam tren duong cheo chinh va phu");
			System.out.println("5. Sap xep cac cot trong mang tang dan");
			System.out.println("6. Thoat");
			System.out.print("Lua chon cua ban la: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("Nhap vao phan tu arrayTwo[%d][%d]: ", i, j);
						arrayTwo[i][j] = Integer.parseInt(sc.nextLine());
					}
				}
				break;
			case 2:
				System.out.println("Mang vua nhap theo ma tran: ");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("%d\t", arrayTwo[i][j]);
					}
					System.out.printf("\n");
				}
				break;
			case 3:
				System.out.println("Gia tri o duong bien la: ");
				for (int i = 0; i < m; i++) {
					System.out.printf("%d\t", arrayTwo[0][i]);
				}
				for (int i = 1; i < n; i++) {
					System.out.printf("%d\t", arrayTwo[i][0]);
				}
				for (int i = 1; i < m; i++) {
					System.out.printf("%d\t", arrayTwo[n - 1][i]);
				}
				for (int i = 1; i < n - 1; i++) {
					System.out.printf("%d\t", arrayTwo[i][m - 1]);
				}
				System.out.printf("\n");

				break;
			case 4:
				if (n == m) {
					int sumChinh = 0;
					int sumPhu = 0;
					System.out.print("Duong cheo chinh: ");
					for (int i = 0; i < n; i++) {
						sumChinh += arrayTwo[i][i];
						System.out.printf("%d\t", arrayTwo[i][i]);
					}
					System.out.printf("\n");
					System.out.printf("Tong cua duong cheo chinh: %d\n", sumChinh);
					System.out.print("Duong cheo phu: ");
					for (int i = 0; i < n; i++) {
						for (int j = 0; j < n; j++) {
							if (i + j == n - 1) {
								sumPhu += arrayTwo[i][j];
								System.out.printf("%d\t", arrayTwo[i][j]);
							}
						}
					}
					System.out.printf("\n");
					System.out.printf("Tong cua duong cheo phu: %d\n", sumPhu);
				} else {
					System.out.println("Mang nay khong co duong cheo chinh va phu! ");
				}
				break;
			case 5:
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						for (int k = j + 1; k < n; k++) {
							if (arrayTwo[j][i] > arrayTwo[k][i]) {
								int temp = arrayTwo[k][i];
								arrayTwo[k][i] = arrayTwo[j][i];
								arrayTwo[j][i] = temp;
							}
						}
					}
				}
				System.out.println("Mang vua nhap da sap xep: ");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("%d\t", arrayTwo[i][j]);
					}
					System.out.printf("\n");
				}
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
