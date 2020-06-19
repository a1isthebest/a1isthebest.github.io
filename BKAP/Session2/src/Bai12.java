import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao diem thi toan: ");
		float diemToan = Float.parseFloat(sc.nextLine());
		System.out.print("Nhap vao diem thi ly: ");
		float diemLy = Float.parseFloat(sc.nextLine());
		System.out.print("Nhap vao diem thi hoa: ");
		float diemHoa = Float.parseFloat(sc.nextLine());
		if((diemToan + diemLy + diemHoa) >= 15 && diemToan > 4 && diemLy >4 && diemHoa > 4) {
			if(diemToan > 5 && diemLy > 5 && diemHoa > 5) {
				System.out.println("Hoc deu cac mon!");
			} else System.out.println("Hoc chưa deu cac mon!");
		} else System.out.println("Thi hong!");
	}

}
