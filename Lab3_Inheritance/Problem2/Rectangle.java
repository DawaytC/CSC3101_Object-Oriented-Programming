
public class Rectangle extends Parallelogram{
	public Rectangle(Point p1, Point p2, Point p3, Point p4) {
		super(p1, p2, p3, p4);
	}

	public double getArea() {
		Point p1 = getP1();
		Point p2 = getP2();
		Point p3 = getP3();
		Point p4 = getP4();
		double base = (p1.getX() - p2.getX());
		double height = (p2.getY() - p3.getY());
		double area = base * height;
		return area;
	}
}
