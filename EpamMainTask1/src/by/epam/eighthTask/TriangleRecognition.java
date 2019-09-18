package by.epam.eighthTask;

import java.util.Scanner;

public class TriangleRecognition {

	private Point A, B, C;
	private static final int TWO = 2;

	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}

	public Point getC() {
		return C;
	}

	public void setC(Point c) {
		C = c;
	}
	
	public void inputPoints() {
		Scanner scan = new Scanner(System.in);
		
		Point A = new Point();
		Point B = new Point();
		Point C = new Point();
		
		System.out.print("Enter for point A x: ");
		A.setX(scan.nextInt());
		System.out.print("Enter for point A y: ");
		A.setY(scan.nextInt());
		System.out.print("Enter for point B x: ");
		B.setX(scan.nextInt());
		System.out.print("Enter for point B y: ");
		B.setY(scan.nextInt());
		System.out.print("Enter for point C x: ");
		C.setX(scan.nextInt());
		System.out.print("Enter for point C y: ");
		C.setY(scan.nextInt());
		
		this.setA(A);
		this.setB(B);
		this.setC(C);
	}
	public void triangleRecognition() {
		
		double AB, AC, BC, biggestSide;
		
		AB = Math.sqrt(Math.pow((A.getX() - B.getX()), TWO)+Math.pow((A.getY() - B.getY()), TWO));
		AC = Math.sqrt(Math.pow((A.getX() - C.getX()), TWO)+Math.pow((A.getY() - C.getY()), TWO));
		BC = Math.sqrt(Math.pow((B.getX() - C.getX()), TWO)+Math.pow((B.getY() - C.getY()), TWO));
		
		biggestSide = AB;
		
		if(BC < AB + AC && AB < BC + AC && AC < AB + BC) {
			System.out.println("That is triangle");
			if(AB < AC) {
				biggestSide = AC;
				if(AC < BC) {
					biggestSide = BC;
				}
			} else if(AB < BC) {
				biggestSide = BC;
			}
			
			if(biggestSide == AB) {
				if(Math.pow(AB, TWO) == (Math.pow(AC, TWO) + Math.pow(BC, TWO))){
					System.out.println("This triangle is rectangular");
				}
			} else if(biggestSide == AC) {
				if(Math.pow(AC, TWO) == (Math.pow(AB, TWO) + Math.pow(BC, TWO))) {
					System.out.println("This triangle is rectangular");
				}
			} else if(biggestSide == BC) {
				if(Math.pow(BC, TWO) == (Math.pow(AC, TWO) + Math.pow(AB, TWO))) {
					System.out.println("This triangle is rectangular");
				}
			}
		}else {
			System.out.println("There is not triangle!!!");
		}
	}
}
