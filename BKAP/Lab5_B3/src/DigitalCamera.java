
public abstract class DigitalCamera {
	private String make;
	private String model;
	private String megapixels;
	private String price;
	
	
	public DigitalCamera() {
		super();
	}
	
	public DigitalCamera(String make, String model, String megapixels, String price) {
		super();
		this.make = make;
		this.model = model;
		this.megapixels = megapixels;
		this.price = price;
	}
	
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMegapixels() {
		return megapixels;
	}

	public void setMegapixels(String megapixels) {
		this.megapixels = megapixels;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void showDetails() {
		System.out.printf("Make: %s - Model: %s - MP: %s - Price: %s", this.make, this.model,this.megapixels, this.price);
	}
	
	public abstract void capture();
}
