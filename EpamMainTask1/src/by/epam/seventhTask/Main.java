package by.epam.seventhTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ReverseWithoutAdditionalVariables reverse = new ReverseWithoutAdditionalVariables();
		
		System.out.print("Enter a: ");
		reverse.setA(scan.nextInt());
		System.out.print("Enter b:");
		reverse.setB(scan.nextInt());
		reverse.reverseWithoutAdditionalVariables();
	}

}
