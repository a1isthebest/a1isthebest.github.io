
public class Circle {
	private double radius = 1;
	private String color = "red";
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return radius*2*3.14;
	}
	public String toString() {
		return ("Circle[radius = " +this.radius+ ",color = " +this.color+ ", area = " +this.getArea()+ "]");
	}
}
