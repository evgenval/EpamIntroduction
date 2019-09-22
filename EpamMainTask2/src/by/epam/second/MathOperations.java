package by.epam.second;

import java.util.Scanner;

public class MathOperations {

	private int number;
	private static final int TEN = 10;
	private static final int TWO = 2;
	private static final int ONE = 1;
	private static final int ZERO = 0;
	private static final int ONE_HUNDRED = 100;

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
	
	public void findMax() {
		int max = 0;
		int cloneOfNumber = number;
		while(cloneOfNumber > 0) {
			if(max < cloneOfNumber % TEN) {
				max = cloneOfNumber % TEN;
			}
			cloneOfNumber = cloneOfNumber / TEN;
		}
		System.out.println("Max digit in " + this.number + " is " + max);
	}
	
	public void checkForPalindrom() {
		int palindrom = number;
		int reverse = 0;
		
		while(palindrom != 0) {
			int remainder = palindrom % TEN;
			reverse = reverse * TEN + remainder;
			palindrom = palindrom / TEN;
		}
		
		System.out.println("This number is palindrome - " + (this.number == reverse));
	}
	
	private boolean checkingForPrimeNumber() {
		boolean returningStatement = false;
		for(int i = TWO; i < this.number; i++) {
			if(this.number % i == ZERO) {
				//System.out.println("This number is composite number");
				returningStatement = true;
			} else {
				//System.out.println("This number is prime number");
				returningStatement = false;
			}
		}
		return returningStatement;
	}
	public void checkForPrimeNumber() {
		if(checkingForPrimeNumber()) {
			System.out.println("This number is composite number");
		} else{
			System.out.println("This number is prime number");
		}
	}
	
	public void findAllPrimeDivisorsOfNumber() {
		if(checkingForPrimeNumber()) {
			for(int divisor = TWO; divisor < this.number; divisor++) {
				if(this.number % divisor == 0) {
					for(int i = TWO; i < divisor - ONE; i++) {
							if(divisor % i != 0) {
								System.out.print("That is the divisor of your number: " + divisor);
							}
					}
				}
			}
		}
	}
	
	public static void findNodAndNokOfTwoNumbers() {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.print("\nEnter a: ");
		a = scan.nextInt();
		System.out.print("\nEnter b: ");
		b = scan.nextInt();
		if(a < 1 && b < 1) {
			System.exit(0);
			System.out.println("ERROR!!! You write not natural numbers");
			findNodAndNokOfTwoNumbers();
		} else {
			int nod, nok;
			nod = nodOfTwoNumbers(a, b);
			nok = nokOfTwoNumbers(a, b);
			System.out.print("The nod of 2 numbers is " + nod);
			System.out.print("\nThe nok of 2 numbers is " + nok);
		}
		
	}
	private static int nodOfTwoNumbers(int a, int b) {
		while(a != b) {
			if(a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
	
	private static int nokOfTwoNumbers(int a, int b) {
		int c;
		boolean t = true;
		if(a < b) {
			c = b;
		} else {
			c = a;
		}
		while(t) {
			if((c % a == ZERO) && (c % b == ZERO)) {
				t = false;
			} else {
				c += ONE;
			}
		}
		return c;
	}
	
	/*public void findNumberOfDifferentDigits() {
		int digit, digit_1, number_1, digitX;
		number_1 = this.number;
		
		digit = number_1 % TEN;
		while(number_1 != 0) {
			digit_1 = (int)(number_1 / TEN) % TEN;
			if(digit == digit_1) {
				number_1 /= TEN;
				digitX = digit_1 * TEN;
				number_1 -= digitX;
			}
			while(number_1 != 0) {
				
			}
		}
	}*/
	
	public void findNumberOfDifferentDigits() {
		int number_1 = this.number;
		int differentDigitsCount = ZERO;
		int[] digitsCount = new int[10];
		while(number_1 != ZERO) {
			digitsCount[(int)(number_1 % TEN)]++;
			number_1 /= TEN;
		}
		for(int i = ZERO; i < TEN; i++) {
			if(digitsCount[i] > ZERO) {
				differentDigitsCount++;
			}
		}
		System.out.print("The number of different digits in number is " + differentDigitsCount);
	}
}
