import java.util.Random;
import java.util.Scanner;

public class Triangle {

	private int A, B, C;
	private static final int TWO = 2;

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public void enterTheTriangAndCheckForTriangle() {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		System.out.print("Enter the first side: ");
		try {
			a = scan.nextInt();
		} catch (Exception e) {
			System.out.println("ERROR! You entered not number. ");
			System.exit(0);
		}
		if(a <= 0) {
			System.out.println("ERROR! a <= 0Let's try another time");
			enterTheTriangAndCheckForTriangle();
		} else {
			this.setA(a);
		}
		
		System.out.print("Enter the second side: ");
		try {
			b = scan.nextInt();
		} catch (Exception e) {
			System.out.println("ERROR! You entered not number. ");
			System.exit(0);
		}
		if(b <= 0) {
			System.out.println("ERROR! b<=0 Let's try another time");
			enterTheTriangAndCheckForTriangle();
		} else {
			this.setB(b);
		}
		
		System.out.print("Enter the third side: ");
		try {
			c = scan.nextInt();
		} catch (Exception e) {
			System.out.println("ERROR! You entered not number");
			System.exit(0);
		}
		if(c <= 0) {
			System.out.println("ERROR! c <= 0 Let's try another time");
			enterTheTriangAndCheckForTriangle();
		} else {
			this.setC(c);
		}
		 if(this.getA() >= this.getB() + this.getC() 
		 											|| this.getB() >= this.getA() + this.getC()
		 											|| this.getC() >= this.getA() + this.getB()) {
			 System.out.println("ERROR! You entered sides that cann't make triangle");
			 enterTheTriangAndCheckForTriangle();
		 }
	}
	
	public double findSquare() {
		double poluPerim = 0;
		double square;
		
		poluPerim = (this.getA() + this.getB() + this.getC()) / TWO;
		
		square = Math.sqrt(poluPerim * (poluPerim - this.getA()) * (poluPerim - this.getB()) * (poluPerim - this.getC()));
		
		return square;
	}
	
	public Triangle[] makeTriangles() {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int a, b, c;
		int numberOfTriangles = 0;
		
		

		System.out.println("Enter number of triangles");
		numberOfTriangles = scan.nextInt();
		Triangle triangles[] = new Triangle[numberOfTriangles];
		for(int i = 0; i < triangles.length; i++) {
			triangles[i] = new Triangle();
		}
		for(int i = 0; i < triangles.length; i++) {
			boolean tryed = true;
				while(tryed) {
					a = 1 + random.nextInt(100 - 1);
					b = 1 + random.nextInt(100 - 1);
					c = 1 + random.nextInt(100 - 1);
					if(a < b + c && b < a + c && c < a + b) {
						triangles[i].setA(a);
						triangles[i].setB(b);
						triangles[i].setC(c);
						tryed = false;
					}
			}
		}
		
		return triangles;
	}							
	
	public void findMaxSquare(Triangle[] A) {
		double max = 0;
		int numberInMassiv = 0;
		int i = 0;
		System.out.println("The squares of all triangles: ");
		for(Triangle B: A) {
			System.out.println(B.findSquare() );
			if(max < B.findSquare()) {
				max = B.findSquare();
				numberInMassiv = i;
			}
			i++;
		}
		
		System.out.println("The max square triangle is triangle with that square: " + A[numberInMassiv].findSquare()
																+ " and that sides: "
																+ A[numberInMassiv].getA() + ", " 
																+ A[numberInMassiv].getB() + ", "
																+ A[numberInMassiv].getC() + ".");
	}
}
