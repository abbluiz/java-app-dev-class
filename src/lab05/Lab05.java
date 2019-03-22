/* (IllegalArgumentException)
 * Modify the Loan class to throw IllegalArgumentException if the loan amount, interest rate, or number of years is less than or equal to zero.
 * Write a test program to create three Loan objects called loan1, loan2 and loan3 in this order.
 * For loan1, put the annualInterestRate, numOfYears, and loanAmount to be 7.5, 30, 100000
 * For loan2, put the annualInterestRate, numOfYears, and loanAmount to be -1, 3, 3
 * For loan3, put the annualInterestRate, numOfYears, and loanAmount to be 7.5, 30, 20000
 */

public class Lab05 {
	public static void main(String[] args) {

		// TO DO: Write the test program here ...
		try {

			Loan loan1 = new Loan(7.5, 30, 100000);
			System.out.println(loan1);

		} catch (IllegalArgumentException ignored) {

			ignored.printStackTrace();

		}

		try {

			Loan loan2 = new Loan(-1, 3, 3);
			System.out.println(loan2);

		} catch (IllegalArgumentException ignored) {

			ignored.printStackTrace();

		}

		try {

			Loan loan3 = new Loan(7.5, 30, 20000);
			System.out.println(loan3);

		} catch (IllegalArgumentException ignored) {

			ignored.printStackTrace();

		}

	}

}

class Loan {
	private double annualInterestRate;
	private int numOfYears;
	private double loanAmount;

	/** Default constructor */
	public Loan() {
		this(7.5, 30, 100000);
	}

	/**
	 * Construct a NewLoan with specified annual interest rate, number of years and
	 * loan amount
	 */
	public Loan(double annualInterestRate, int numOfYears, double loanAmount) throws IllegalArgumentException {
		// TO DO: throw appropriate exception
		if (annualInterestRate <= 0.0 || numOfYears <= 0 || loanAmount <= 0)
			throw new IllegalArgumentException();
		setAnnualInterestRate(annualInterestRate);
		setNumOfYears(numOfYears);
		setLoanAmount(loanAmount);
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		// TO DO: throw appropriate exception
		if (annualInterestRate <= 0.0)
			throw new IllegalArgumentException();
		this.annualInterestRate = annualInterestRate;
	}

	/** Return numOfYears */
	public int getNumOfYears() {
		return numOfYears;
	}

	/** Set a new numOfYears */
	public void setNumOfYears(int numOfYears) throws IllegalArgumentException {
		// TO DO: throw appropriate exception
		if (numOfYears <= 0)
			throw new IllegalArgumentException();
		this.numOfYears = numOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a newloanAmount */
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		// TO DO: throw appropriate exception
		if (loanAmount <= 0.0)
			throw new IllegalArgumentException();
		this.loanAmount = loanAmount;
	}

	/** Find monthly payment */
	public double monthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		return loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));
	}

	/** Find total payment */
	public double totalPayment() {
		return monthlyPayment() * numOfYears * 12;
	}
}
