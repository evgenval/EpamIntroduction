package by.epam.sixthTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Reverse reverse = new Reverse();
		
		System.out.print("Enter number: ");
		reverse.setNumber(scan.nextInt());
		reverse.makeReverse();
	}

}
