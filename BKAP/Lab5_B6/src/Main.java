
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(5, "red", true);
		s.setWidth(s.getSide());
		s.setLength(s.getSide());
		System.out.println(s.toString());
	}

}
