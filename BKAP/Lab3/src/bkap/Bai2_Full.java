package bkap;

import java.util.Random;
import java.util.Scanner;

public class Bai2_Full {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
	}

}
