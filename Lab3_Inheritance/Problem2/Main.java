
public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Point p1 = new Point(0, 0);
			Point p2 = new Point(4, 0);
			Point p3 = new Point(4, 4);
			Point p4 = new Point(0, 4);
			
			Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4);
			System.out.println("Trapezoid area: " + trapezoid.getArea());
			
			Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4);
			System.out.println("Parallelogram area: " + parallelogram.getArea());
			
			Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
			System.out.println("Rectangle area: " + rectangle.getArea());
			
			Square square = new Square(p1, p2, p3, p4);
			System.out.println("Square area: " + square.getArea());

		}
}
