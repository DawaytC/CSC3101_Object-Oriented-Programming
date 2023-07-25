
public class square extends geometricObject implements Colorable{
	private double side;

	public square() {
	}

	public square(double side) {
		this.side = side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return side*side;
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}

	
	public void howToColor() {
		System.out.println("Color all four sides");
	}

	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter();
	}
}
