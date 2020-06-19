import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao x: ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap vao y: ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap vao mot toan tu (+,-,*,/): ");
		char toanTu = sc.nextLine().charAt(0);
		switch (toanTu) {
		case '+':
			System.out.printf("Ket qua phep cong %d va %d la: %d", x, y, x + y);
			break;
		case '-':
			System.out.printf("Ket qua phep tru %d voi %d la: %d", x, y, x - y);
			break;
		case '*':
			System.out.printf("Ket qua phep nhan %d voi %d la: %d", x, y, x * y);
			break;
		case '/':
			double chia;
			if (y == 0) {
				System.out.println("Khong chia cho 0 duoc!");
			} else {
				chia = x / y;
				System.out.printf("Ket qua phep chia %d voi %d la: %f", x, y, chia);
			}
			break;
		default:
			System.out.println("Chi duoc nhap cac toan tu +,-,*,/");
			break;
		}
	}

}
