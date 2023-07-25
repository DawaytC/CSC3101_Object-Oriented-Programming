
public class Main {
	public static void main(String[] args) {
		geometricObject[] geo = { new square(10), new square(12), new square(14), new square(16), new square(18), new Rectangle(10, 5) };

		//loop array
		for (int i = 0; i < geo.length; i++) {
			//Output of Square
			if (geo[i] instanceof square)
				System.out.println("\nGeometric Object " + (i + 1) + " : Square");
			//Output of Rectangle
			else if (geo[i] instanceof Rectangle)
				System.out.println("\nGeometric Object " + (i + 1) + " : Rectangle");
			//Output if color or not
			if (geo[i] instanceof Colorable) {
				System.out.print("How to color: ");
				((Colorable) geo[i]).howToColor();
			}
			System.out.println(geo[i].toString());
		}
	}
}
