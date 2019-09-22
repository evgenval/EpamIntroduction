package by.epam.third;

import java.util.Scanner;

public class PerfectNumber {

	private int number;
	private static final int ZERO = 0;
	private static final int ONE = 1;

	private int getNumber() {
		return number;
	}

	private void setNumber(int number) {
		this.number = number;
	}
	
	public void inputNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter natural number");
		this.setNumber(scan.nextInt());
		checkForNatural();
	}
	private void checkForNatural() {
		while(number < 1) {
			System.out.println("You entered not natural number please change it: ");
			inputNumber();
		}
	}
	
	public void checkIfPerfect() {
		int numberMiracle = ZERO;
		for(int i = ONE; i < this.number; i++) {
			if(this.number % i == ZERO) {
				numberMiracle += i;
			}
		}
		if(this.number == numberMiracle) {
			System.out.println("This number is perfect");
		} else {
			System.out.println("This number isn't perfect");
		}
	}
}
