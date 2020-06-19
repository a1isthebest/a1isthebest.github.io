import java.util.Scanner;

public class Bai8_TuLam {
	static int n;

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Enter a number n");
		System.out.println("2. Convert to binary number");
		System.out.println("3. Convert to Octal");
		System.out.println("4. Convert to hexa number");
		System.out.println("5. Exit");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1: {
			nhapN();
			menu();
			break;
		}
		case 2:
			System.out.println(Integer.toBinaryString(n));
			menu();
			break;
		case 3: 
			System.out.println(Integer.toOctalString(n));
			menu();
			break;
		case 4: 
			System.out.println(Integer.toHexString(n));
			menu();
			break;
		case 5:
			System.exit(0);
			break;
		default: 
			menu();
			break;
		}
		sc.close();
	}

	public static int nhapN() {
		System.out.print("N: ");
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		return n;
	}
}
