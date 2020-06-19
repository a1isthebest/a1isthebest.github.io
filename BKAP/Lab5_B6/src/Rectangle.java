
public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		super();
	}
	

	public Rectangle(String color, boolean filled) {
		super(color, filled);
	}


	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width+length) * 2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width*length;
	}
	
}
