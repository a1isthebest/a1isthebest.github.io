package bkap;

import java.util.Random;
import java.util.Scanner;

public class Bai4_Full {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu trong mang: ");
		int n = Integer.parseInt(sc.nextLine());
		int[] rdarr = new int[n];
		for (int i = 0; i < rdarr.length; i++) {
			rdarr[i] = rd.nextInt(100);
		}
		int max = rdarr[0], min = rdarr[0];
		for (int i = 0; i < rdarr.length; i++) {
			if (rdarr[i] > max) {
				max = rdarr[i];
			}
			if (rdarr[i] < min) {
				min = rdarr[i];
			}
		}
		for (int i = 0; i < rdarr.length; i++) {
			System.out.printf("%d\t", rdarr[i]);
		}
		System.out.println();
		System.out.printf("Max: %d  - Min: %d", max, min);
	}

}
