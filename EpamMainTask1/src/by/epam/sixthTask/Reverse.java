package by.epam.sixthTask;

public class Reverse {

	private int number;
	private static final int DIVISOR_BY_TEN = 10;
	private static final int BASIC_FOR_ONE_MILLION = 1000000;
	private static final int BASIC_FOR_TEN_MILLIONS = 10000000;
	private static final int ZERO = 0;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		if(number >= BASIC_FOR_ONE_MILLION && number < BASIC_FOR_TEN_MILLIONS) {
			this.number = number;
		}else {
			System.out.println("ERROR!!!");
			System.exit(0);
		}
	}
	
	public void makeReverse() {
		int factorForDigits = BASIC_FOR_ONE_MILLION;
		int reverse = ZERO;
		while(number > ZERO) {
			int residual = number % DIVISOR_BY_TEN;
			int digit = residual * factorForDigits;
			reverse = reverse + digit;
			number = number / DIVISOR_BY_TEN;
			factorForDigits = factorForDigits / DIVISOR_BY_TEN;
		}
		System.out.println("The reverse of the number is " + reverse);
	}
	
}
