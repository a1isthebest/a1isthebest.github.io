
public class Circle extends Shape{
	private double radius = 1;

	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return this.radius*3.14*2;
	}
	public double getPerimeter() {
		return this.radius * 3.14 * this.radius;
	}
	public String toSring() {
		return ("Radius: " +this.radius+ ", Area: " +this.getArea()+ ", Perimeter: "+this.getPerimeter());
	}
}
