
public class Trapezoid extends Quadrilateral{
	public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
		super(p1, p2, p3, p4);
	}

	public double getArea() {
		Point p1 = getP1();
		Point p2 = getP2();
		Point p3 = getP3();
		Point p4 = getP4();
		
		double area = ((p1.getX() * p2.getY() + p2.getX() * p3.getY() + p3.getX() * p4.getY() + p4.getX() * p1.getY())
				- (p2.getX() * p1.getY() + p3.getX() * p2.getY() + p4.getX() * p3.getY() + p1.getX() * p4.getY())) / 2;
		
		return area;
	}
}
