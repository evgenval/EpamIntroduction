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
		
		seeMatrix(matrix);
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
		int row = -1, colomn = -1;
		for(int i = 0;  i < this.getLength(); i++) {
			for(int j = 0; j < this.getWidth(); j++) {
				if(this.getLength() == 1) {
					if(this.getWidth() != 1) {
						if(j == 0) {
							if(matrix[i][j+1] > matrix[i][j]) {
								row = i;
								colomn = j;
								break;
							}
						} else if(j < this.getWidth() - 1){
							if(matrix[i][j - 1] > matrix[i][j] 
									&& matrix[i][j + 1] > matrix[i][j]) {
								row = i;
								colomn = j;
								break;
							}
						} else if(j == this.getWidth() - 1) {
							if(matrix[i][j - 1] > matrix[i][j]) {
								row = i;
								colomn = j;
								break;
							}
						}
					} else {
						System.out.println("That is very small matrix");
						break;
					}
				}else {
					if(this.getWidth() != 1) {
						if(i == 0) {
							if(j == 0) {
								if(matrix[i][j+1] > matrix[i][j] && matrix[i+1][j] > matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j < this.getWidth() - 1){
								if(matrix[i][j - 1] > matrix[i][j] 
										&& matrix[i][j + 1] > matrix[i][j] 
												&& matrix[i+1][j] > matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j == this.getWidth() - 1) {
								if(matrix[i][j - 1] > matrix[i][j] && matrix[i+1][j] > matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							}
						} else if(i < this.getLength() - 1 && i != 0) {
							if(j == 0) {
								if(matrix[i][j+1] > matrix[i][j] 
										&& matrix[i+1][j] > matrix[i][j]
												&& matrix[i - 1][j] > matrix[i][j]) {
									row = i;
									colomn = j;
									break;
							}
							} else if(j < this.getWidth() - 1){
								if(matrix[i][j - 1] > matrix[i][j] 
										&& matrix[i][j + 1] > matrix[i][j] 
												&& matrix[i+1][j] > matrix[i][j]
														&& matrix[i - 1][j] > matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j == this.getWidth() - 1) {
								if(matrix[i][j - 1] > matrix[i][j] 
										&& matrix[i + 1][j] > matrix[i][j]
												&& matrix[i - 1][j] > matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							}
						} else if(i == this.getLength() - 1) {
							if(j == 0) {
								if(matrix[i][j+1] > matrix[i][j] && matrix[i - 1][j] > matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j < this.getWidth() - 1){
								if(matrix[i][j - 1] > matrix[i][j] 
										&& matrix[i][j + 1] > matrix[i][j] 
												&& matrix[i - 1][j] > matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j == this.getWidth() - 1) {
								if(matrix[i][j - 1] > matrix[i][j] && matrix[i - 1][j] > matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							}
						}
				} else {
					if(j == 0) {
						if(matrix[i+1][j] > matrix[i][j]) {
							row = i;
							colomn = j;
							break;
						}
					} else if(j < this.getWidth() - 1 && j != 0){
						if(matrix[i - 1][j] > matrix[i][j] 
								&& matrix[i+1][j] > matrix[i][j]) {
							row = i;
							colomn = j;
							break;
						}
					} else if(j == this.getWidth() - 1) {
						if(matrix[i - 1][j] > matrix[i][j]) {
							row = i;
							colomn = j;
							break;
						}
					}
				}
			}
			}
		}
		if(row == -1 && colomn == -1) {
			System.out.println("There is no local min");
		} else {
			System.out.println("The position of first local min is " + row + " row and " + colomn + " colomn.");
		}
	}
	
	public void findPositionOfFirstLocalMax() {
		int row = -1, colomn = -1;
		for(int i = 0;  i < this.getLength(); i++) {
			for(int j = 0; j < this.getWidth(); j++) {
				if(this.getLength() == 1) {
					if(this.getWidth() != 1) {
						if(j == 0) {
							if(matrix[i][j+1] < matrix[i][j]) {
								row = i;
								colomn = j;
								break;
							}
						} else if(j < this.getWidth() - 1){
							if(matrix[i][j - 1] < matrix[i][j] 
									&& matrix[i][j + 1] < matrix[i][j]) {
								row = i;
								colomn = j;
								break;
							}
						} else if(j == this.getWidth() - 1) {
							if(matrix[i][j - 1] < matrix[i][j]) {
								row = i;
								colomn = j;
								break;
							}
						}
					} else {
						System.out.println("That is very small matrix");
						break;
					}
				}else {
					if(this.getWidth() != 1) {
						if(i == 0) {
							if(j == 0) {
								if(matrix[i][j+1] < matrix[i][j] && matrix[i+1][j] < matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j < this.getWidth() - 1){
								if(matrix[i][j - 1] < matrix[i][j] 
										&& matrix[i][j + 1] < matrix[i][j] 
												&& matrix[i+1][j] < matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j == this.getWidth() - 1) {
								if(matrix[i][j - 1] < matrix[i][j] && matrix[i+1][j] < matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							}
						} else if(i < this.getLength() - 1 && i != 0) {
							if(j == 0) {
								if(matrix[i][j+1] < matrix[i][j] 
										&& matrix[i+1][j] < matrix[i][j]
												&& matrix[i - 1][j] < matrix[i][j]) {
									row = i;
									colomn = j;
									break;
							}
							} else if(j < this.getWidth() - 1){
								if(matrix[i][j - 1] < matrix[i][j] 
										&& matrix[i][j + 1] < matrix[i][j] 
												&& matrix[i+1][j] < matrix[i][j]
														&& matrix[i - 1][j] < matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j == this.getWidth() - 1) {
								if(matrix[i][j - 1] < matrix[i][j] 
										&& matrix[i + 1][j] < matrix[i][j]
												&& matrix[i - 1][j] < matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							}
						} else if(i == this.getLength() - 1) {
							if(j == 0) {
								if(matrix[i][j+1] < matrix[i][j] && matrix[i - 1][j] < matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j < this.getWidth() - 1){
								if(matrix[i][j - 1] < matrix[i][j] 
										&& matrix[i][j + 1] < matrix[i][j] 
												&& matrix[i - 1][j] < matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							} else if(j == this.getWidth() - 1) {
								if(matrix[i][j - 1] < matrix[i][j] && matrix[i - 1][j] < matrix[i][j]) {
									row = i;
									colomn = j;
									break;
								}
							}
						}
				} else {
					if(j == 0) {
						if(matrix[i+1][j] < matrix[i][j]) {
							row = i;
							colomn = j;
							break;
						}
					} else if(j < this.getWidth() - 1 && j != 0){
						if(matrix[i - 1][j] < matrix[i][j] 
								&& matrix[i+1][j] < matrix[i][j]) {
							row = i;
							colomn = j;
							break;
						}
					} else if(j == this.getWidth() - 1) {
						if(matrix[i - 1][j] < matrix[i][j]) {
							row = i;
							colomn = j;
							break;
						}
					}
				}
			}
			}
		}
		if(row == -1 && colomn == -1) {
			System.out.println("There is no local max");
		} else {
			System.out.println("The position of first local max is " + row + " row and " + colomn + " colomn.");
		}
	}
	
	public void seeMatrix(double matrixx[][]) {
		for(int i = 0; i < matrixx.length; i++) {
			for(int j = 0; j < matrixx[i].length; j++) {
				System.out.print(matrixx[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void transposeMatrix() {
		
		if(this.getLength() == this.getWidth()) {
			for(int i = 0; i < this.getLength(); i++) {
				for(int k = i+1; k < this.getWidth(); k++) {
					double temp = matrix[i][k];
					matrix[i][k] = matrix[k][i];
					matrix[k][i] = temp;
				}
			}
			System.out.println("That is transpose matrix");
			seeMatrix(matrix);
		} else if(this.getLength() == 1 || this.getWidth() == 1) {
			System.out.println("Error!!! Cann't  transpose those small matrix");
		} else {
			double[][] transposedMatrix = new double[this.getWidth()][this.getLength()];
			for(int i = 0; i < this.getLength(); i++) {
				for(int j = 0; j < this.getWidth(); j++) {
					transposedMatrix[j][i] = matrix[i][j];
				}
			}
			seeMatrix(transposedMatrix);
		}
	}
}
