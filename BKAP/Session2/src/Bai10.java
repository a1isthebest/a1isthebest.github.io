import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao 1 ky tu (R,r,G,g,B,b,...): ");
		char color = sc.nextLine().charAt(0);
		String colorName;
		switch (color) {
		case 'R', 'r':
			colorName = "Red";
			break;
		case 'G', 'g':
			colorName = "Green";
			break;
		case 'B', 'b':
			colorName = "Blue";
			break;
		default:
			colorName = "Black";
			break;
		}
		System.out.println("Color: " + colorName);
	}

}
