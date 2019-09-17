package by.epam.twelvethTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Calendar calendar = new Calendar();
		
		System.out.print("Enter day: ");
		calendar.setDay(scan.nextInt());
		System.out.print("Enter month: ");
		calendar.setMonth(scan.nextInt());
		System.out.print("Enter year: ");
		calendar.setYear(scan.nextInt());
		calendar.whatIsTheDateOfTheNextDaY();
	}

}
