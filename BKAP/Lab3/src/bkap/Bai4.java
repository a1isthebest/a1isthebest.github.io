package bkap;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao 1 chuoi cach nhau boi dau cach: ");
		String chuoi = sc.nextLine();
		do {
			System.out.println("****************MENU**********************");
			System.out.println("1. Chuyen chuoi thanh chu hoa");
			System.out.println("2. Chuoi chuoi thanh chu thuong");
			System.out.println("3. in ra so tu trong chuoi");
			System.out.println("4. Chuyen tat ca khoang trang thanh ky tu \'-\'");
			System.out.println("5. Viet hoa ky tu dau tien moi tu");
			System.out.println("6. Thoat");
			System.out.print("Lua chon cua ban la: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				String chuoi1;
				chuoi1 = chuoi.toUpperCase();
				System.out.printf("%s\n", chuoi1);
				break;
			case 2:
				String chuoi2;
				chuoi2 = chuoi.toLowerCase();
				System.out.printf("%s\n", chuoi2);
				break;
			case 3:
				int count = 0;
		        boolean notCounted = true;
		        for (int i=0;i < chuoi.length() ; i++){
		            if(chuoi.charAt(i) != ' ' && chuoi.charAt(i) != '\n' && chuoi.charAt(i) != '\t'){
		                if (notCounted){
		                    notCounted = false;
		                    count++;
		                }
		            }
		            else {
		                notCounted = true;
		            }
		        }
		        System.out.printf("So tu trong chuoi ban nhap la: %d\n", count);
				break;
			case 4:
				String chuoi3;
				chuoi3 = chuoi.replaceAll(" ", "-");
				System.out.printf("%s\n", chuoi3);
				break;
			case 5:
				String[] arr = chuoi.split(" ");
				
				String chuoi4 = "";
				for (String x : arr) {
					chuoi4 = chuoi4 + (x.substring(0, 1).toUpperCase() + x.substring(1));
					chuoi4 = chuoi4 + " ";
				}
				System.out.println("Bien cac chu dau thanh hoa: " + chuoi4);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Nhap vao tu 1-6! ");
				break;
			}
		} while (true);
	}
}
