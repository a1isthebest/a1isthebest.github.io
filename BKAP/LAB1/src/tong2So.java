import java.util.Scanner;

public class tong2So {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao so b: ");
		int b = Integer.parseInt(sc.nextLine());
		int sum = a+b;
		System.out.printf("Tong cua 2 so %d va %d la: %d", a,b,sum);
	}

}
