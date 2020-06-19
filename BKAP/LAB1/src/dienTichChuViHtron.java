import java.util.Scanner;

public class dienTichChuViHtron {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final float PI = 3.14f;
		System.out.println("Nhap vao ban kinh hinh tron: ");
		float r = Float.parseFloat(sc.nextLine());
		float chuVi = r * 2 * PI;
		float dienTich = r*r*PI;
		System.out.printf("Chu vi cua hinh tron voi ban kinh %f la: %f\n", r, chuVi);
		System.out.printf("Dien tich cua hinh tron voi ban kinh %f la: %f", r, dienTich);
	}

}
