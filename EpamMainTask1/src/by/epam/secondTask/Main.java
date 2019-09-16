package by.epam.secondTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Converter converter = new Converter();
		
		System.out.print("Enter weight: ");
		converter.setWeight(scan.nextInt());

		converter.convertToMilligrams();
		converter.convertToGrams();
		converter.convertToTons();
	}

}
