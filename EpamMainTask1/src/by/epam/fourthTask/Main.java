package by.epam.fourthTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		NumericalSequence number = new NumericalSequence();
		System.out.print("Enter number: ");
		number.setNumber(scan.nextInt());
		number.checkingForNumericalSequence();
	}

}
