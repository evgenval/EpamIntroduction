package by.epam.fifthTask;

public class AverageValue {

	private int number;
	private static final int DIVISOR_BY_TEN = 10;
	private static final int BASIC_FOR_ONE_HUNDRED = 100000;
	private static final int BASIC_FOR_ONE_MILLION = 1000000;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		if(number >= BASIC_FOR_ONE_HUNDRED && number < BASIC_FOR_ONE_MILLION) {
			this.number = number;
		}else {
			System.out.println("ERROR!!!");
			System.exit(0);
		}
	}
	
	public void averageValue() {
		int a = number % DIVISOR_BY_TEN; 
		number = number / DIVISOR_BY_TEN;
		int b = number % DIVISOR_BY_TEN; 
		number = number / DIVISOR_BY_TEN;
		int c = number % DIVISOR_BY_TEN; 
		number = number / DIVISOR_BY_TEN;
		int d = number % DIVISOR_BY_TEN; 
		number = number / DIVISOR_BY_TEN;
		int e = number % DIVISOR_BY_TEN; 
		number = number / DIVISOR_BY_TEN;
		int f = number % DIVISOR_BY_TEN; 
		
		System.out.print("Arithmetic average value: " + ((a+b+c+d+e+f)/6));
		System.out.println("Geometric average value:" + (Math.pow(6, a*b*c*d*e*f)));
	}
}
