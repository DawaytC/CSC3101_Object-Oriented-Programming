import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(new Loan(2.5, 1, 1000));		
		o.add(new Date());		
		o.add("Im handsome");	
		o.add(new Circle());	
		
		for (int i = 0; i < o.size(); i++) {
			System.out.println((o.get(i)).toString());
		}
	}

}
