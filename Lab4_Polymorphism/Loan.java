
public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	//constructor
	public Loan() {
		//this(2.5, 1, 1000);
	}
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOfYears;
			this.loanAmount = loanAmount;
			loanDate = new java.util.Date();
	}
	
	//setters
	public void setAnnualinterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	
	public void setLoanPayment(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	//getters
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	//monthly payment calc
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	
	//total payment calc
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	//toString
	public String toString() {
		return "Loan: \nAnnual Interest " + "Rate: " + annualInterestRate + "% \nnumYears: " + numberOfYears + "\nloanAmount: "
				+ loanAmount + "\n";
	}
	//loan date
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}
