
public class Square extends Rectangle{
	private double side;

	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth(double side) {
		super.setWidth(side);
	}
	public void setLength(double side) {
		super.setLength(side);
	}
	public String toString() {
		return ("Square[Side= " +this.side+ " ,Area= "+this.getArea()+" ,Perimeter= " +this.getPerimeter()+ " ,color= "+this.getColor()+" ,filled= " +this.isFilled()+"]");
	}
}
