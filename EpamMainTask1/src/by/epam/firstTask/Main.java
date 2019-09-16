package by.epam.firstTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		MainInfo main = new MainInfo();
		
		System.out.print("Enter A: ");
		main.setA(scan.nextInt());
		System.out.print("Enter B: ");
		main.setB(scan.nextInt());
		System.out.print("Enter C: ");
		main.setC(scan.nextInt());
		
		main.areTheNumbersTheSameOrDifferent();

	}

}
