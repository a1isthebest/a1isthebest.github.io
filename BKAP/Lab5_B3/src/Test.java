
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung ss = new Samsung("VN", "A001", "48", "10000000", true, true);
		ss.showDetails();
		ss.capture();
		Sony sn = new Sony("CN", "A002", "96", "100000000", true, true);
		sn.showDetails();
		sn.capture();
	}

}
