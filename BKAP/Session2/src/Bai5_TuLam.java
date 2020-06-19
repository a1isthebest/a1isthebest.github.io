
public class Bai5_TuLam {

	public static void main(String[] args) {
		int n;
		int tong = 0;
		for (n = 100; n <= 999; n++) {
			int t = n;
			int digit1 = t % 100;
			t = t / 10;
			int digit2 = t % 10;
			int digit3 = t / 10;
			tong = digit1 + digit2 + digit3;

			if (tong % 2 == 0) {
				System.out.printf("%d\n", n);
			}
		}
	}
}