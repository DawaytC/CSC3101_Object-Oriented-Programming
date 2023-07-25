import java.util.GregorianCalendar;

public class myDate {
	private int year;
	private int month;
	private int day;
	
	//constructor
	myDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		year = calendar.get(GregorianCalendar.YEAR);
		month = calendar.get(GregorianCalendar.MONTH);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	
	myDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//setters
	public void MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}
	
	
	//getters
	public int getYear() {
		return year;
	}
	
	public String getMonth() {
		String m = String.valueOf(month + 1);
		return (month < 10 ? "0" + m : m);
	}
	
	public String getDay() {
		String d = String.valueOf(day);
		return (day <10 ? "0" + d: d);
	}
	
	public void setDate(long elapsedTime) {
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}
}
