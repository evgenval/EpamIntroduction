package by.epam.fourthTask;

public class NumericalSequence {

	private int number;
	private static final int DIVISOR_BY_TEN = 10;
	private static final int BASIC_FOR_TEN_THOUSANDS = 10000;
	private static final int BASIC_FOR_ONE_THOUSAND = 1000;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		if(number < BASIC_FOR_TEN_THOUSANDS && number >= BASIC_FOR_ONE_THOUSAND) {
			this.number = number;
		}else {
			System.out.println("ERROR!!!");
			System.exit(0);
		}
	}
	
	public void checkingForNumericalSequence() {
		int units = number % DIVISOR_BY_TEN;  			//units = единицы
		number = number / DIVISOR_BY_TEN;
		int dozens = number % DIVISOR_BY_TEN;			//dozens = десятки
		number = number / DIVISOR_BY_TEN;
		int hundreds = number % DIVISOR_BY_TEN;			//hundreds = сотни
		number = number / DIVISOR_BY_TEN;
		int thousands = number % DIVISOR_BY_TEN;		//thousands = тысячи
		
		if(thousands <= hundreds && hundreds <= dozens && dozens <= units) {
			System.out.println("Increasing sequence");
		}else {
			System.out.println("Not increasing sequence");
		}
	}
	
}
