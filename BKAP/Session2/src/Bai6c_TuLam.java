
public class Bai6c_TuLam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)
		{
		for(int j=1;j<=6-i;j++)
		System.out.printf(" ");
		for(int j=1;j<=2*i-1;j++)
		System.out.printf("*");
		System.out.printf("\n");
		}
	}
}
