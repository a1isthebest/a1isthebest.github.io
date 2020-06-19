
public class Sony extends DigitalCamera {
	private boolean autoFocus;
	private boolean panorama;
	
	
	public Sony() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Sony(String make, String model, String megapixels, String price, boolean autoFocus, boolean panorama) {
		super(make, model, megapixels, price);
		// TODO Auto-generated constructor stub
		this.autoFocus = autoFocus;
		this.panorama = panorama;
	}
	public void showDetails() {
		System.out.printf("Make: %s - Model: %s - MP: %s - Price: %s\n Auto Focus: %b - Panorama: %b\n", super.getMake(), super.getModel(),super.getMegapixels(), super.getPrice(), this.autoFocus, this.panorama);
	}

	@Override
	public void capture() {
		// TODO Auto-generated method stub
		System.out.println("Sony");
	}
}
