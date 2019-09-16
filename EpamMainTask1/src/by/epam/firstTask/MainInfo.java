package by.epam.firstTask;

public class MainInfo {

	private int a, b, c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public void areTheNumbersTheSameOrDifferent() {
		if(a==b){
		    if(b==c) {
		        System.out.println("The numbers are the same");
		    }
		    else {
		    	System.out.println("The numbers are different");
		    }
		}
		else {
			System.out.println("The numbers are different");
		    }
	}
}
