import java.util.Scanner;

public class Bai3_TuLam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao chi so cu: ");
		int chiSoCu = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao chi so moi: ");
		int chiSoMoi = Integer.parseInt(sc.nextLine());
		int tienTraDM;
		int tienVuotDM;
		int soVuotDM;
		if (chiSoMoi > chiSoCu) {
			int soTieuThu = chiSoMoi - chiSoCu;
			soVuotDM = soTieuThu - 50;
			if (soTieuThu <= 50) {
				tienTraDM = soTieuThu * 230;
				tienVuotDM = 0;
			} else {
				tienTraDM = 50 * 230;
				if (soVuotDM <= 50) {
					tienVuotDM = soVuotDM * 480;
				} else if (soVuotDM > 50 && soVuotDM < 100) {
					tienVuotDM = (50 * 480) + (soVuotDM - 50) * 700;
				} else {
					tienVuotDM = (50 * 480) + (soVuotDM - 50) * 700 + (soVuotDM - 99) * 900;
				}
			}
			int tongTien = tienTraDM + tienVuotDM + 1000;
			System.out.printf("%s%30s%30s%30s%30s\n","Chi so cu", "Chi so moi", "Tien tra DM", "Tien tra vuot DM","Tong tien");
			System.out.printf("%d%30d%30d%30d%30d\n", chiSoCu, chiSoMoi, tienTraDM, tienVuotDM, tongTien);
		}
		else {
			System.out.println("Chi so moi phai lon hon chi so cu! ");
		}
		sc.close();
	}
}
