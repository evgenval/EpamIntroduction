package by.epam.thirdTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		AreaCalculator calculator = new AreaCalculator();
		System.out.print("Enter the first radius: ");
		calculator.setRadius_1(scan.nextInt());
		System.out.print("Enter the second radius: ");
		calculator.setRadius_2(scan.nextInt());
		calculator.calculateTheAreaOfTheRing();
	}

}
