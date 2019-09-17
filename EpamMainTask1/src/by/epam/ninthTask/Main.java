package by.epam.ninthTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CalculatorOfHeadsAndEyes calculator = new CalculatorOfHeadsAndEyes();
		
		System.out.print("Enter the age of dragon: ");
		calculator.setAge(scan.nextInt());
		calculator.calculatorOfHeadsAndEyes();
	}

}
