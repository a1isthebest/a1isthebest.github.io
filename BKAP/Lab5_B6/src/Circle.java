
public class Circle extends Shape{
	private double radius;
	
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
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*2*3.14;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}
	public String toString() {
		return ("Circle[Radius= "+this.radius+ " ,Area= "+this.getArea()+" ,Perimeter= "+this.getPerimeter()+"]");
	}
}
