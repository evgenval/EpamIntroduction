package by.epam.matrix;

import java.util.Random;
import java.util.Scanner;

public class Matrix {

	private int length, width;
	private double matrix[][];

	private int getLength() {
		return length;
	}

	private void setLength(int length) {
		this.length = length;
	}

	private int getWidth() {
		return width;
	}

	private void setWidth(int width) {
		this.width = width;
	}
	
	private static int inputNumber() {
		Scanner scan = new Scanner(System.in);
		int num;
		while (true) {
			while (!scan.hasNextInt()) {
	                scan.nextLine();
	                System.out.println("Enter a number greater than 0");
	            }
	            num = scan.nextInt();
	            if (num > 0) {
	                break;
	            } else {
	                System.out.println("Enter a number greater than 0");
	                scan.nextLine();
	            }
		}
		
		return num;
	}
	
	public void makeMatrix() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of matrix( a number greater than 0)");
		this.setLength(inputNumber());
		System.out.println("Enter the width of matrix( a number greater than 0)");
		this.setWidth(inputNumber());
		
		matrix = new double[this.getLength()][this.getWidth()];
		for(int i = 0; i < this.getLength(); i++) {
			for(int j = 0; j < this.getWidth(); j++) {
				matrix[i][j] = random.nextDouble();
			}
		}
	}
	
	public void findMaxAndMin() {
		double max = 0;
		double min = 0;
		for(int i = 0; i < this.getLength(); i++) {
			for(int j = 0; j < this.getWidth(); j++) {
				if(max < matrix[i][j]) {
					max = matrix[i][j];
				}
				if(min > matrix[i][j]) {
					min = matrix[i][j];
				}
			}
		}
		System.out.println("The max element of matrix is " + max + " . The min element of matrix is " + min + " .");
	}
	
	public void findArithmeticMeanValue() {
		int number = 0;
		double arithmeticValue = 0;
		
		for(int i = 0; i < this.getLength(); i++) {
			for(int j = 0; j < this.getWidth(); j++) {
				arithmeticValue += matrix[i][j];
				number++;
			}
		}
		
		System.out.printf("The arithmetic mean value is %3.3f", arithmeticValue/number);
	}
	
	public void findGeometricMeanValue() {
		int number = 0;
		double geometricValue = 1;
		
		for(int i = 0; i < this.getLength(); i++) {
			for(int j = 0; j < this.getWidth(); j++) {
				geometricValue *= matrix[i][j];
				number++;
			}
		}
		
		System.out.println("The geometric mean value is " + Math.pow(geometricValue, number));
	}
	
	public void findPositionOfFirstLocalMin() {
		int i = 0;
		int j = 1;
		
		for(; i < this.getLength(); i++) {
			for(; j < this.getWidth() - 1; j++) {
				if(matrix[i][j - 1] > matrix[i][j] && matrix[i][j + 1] > matrix[i][j]) {
					System.out.println("The position of first local min is " + i + " row " + j + " place.");
					break;
				}
			}
		}
	}
	
	public void findPositionOfFirstLocalMax() {
		int i = 0;
		int j = 1;
		
		for(; i < this.getLength(); i++) {
			for(; j < this.getWidth() - 1; j++) {
				if(matrix[i][j - 1] < matrix[i][j] && matrix[i][j + 1] < matrix[i][j]) {
					System.out.println("The position of first local max is " + i + " row " + j + " place.");
					break;
				}
			}
		}
	}
	
	public void seeMatrix() {
		for(int i = 0; i < this.getLength(); i++) {
			for(int j = 0; j < this.getWidth(); j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void transposeMatrix() {
		
		if(this.getLength() < this.getWidth()) {
			System.out.println("Cann't transposed");
			System.exit(0);
		}
		for(int i = 0; i < this.getLength(); i++) {
			for(int k = i+1; k < this.getWidth(); k++) {
				double temp = matrix[i][k];
				matrix[i][k] = matrix[k][i];
				matrix[k][i] = temp;
			}
		}
		System.out.println("That is transpose matrix");
		seeMatrix();
	}
}
