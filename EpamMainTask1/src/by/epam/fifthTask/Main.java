package by.epam.fifthTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		AverageValue value = new AverageValue();
		
		System.out.println("Enter number");
		value.setNumber(scan.nextInt());
		value.averageValue();
	}

}
