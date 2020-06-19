package bkap;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrayInt = new int[10];
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.printf("Nhap vao phan tu thu %d: ", i+1);
			arrayInt[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Các phan tu trong mang: ");
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.printf("%d\t", arrayInt[i]);
		}
		sc.close();
	}
}
