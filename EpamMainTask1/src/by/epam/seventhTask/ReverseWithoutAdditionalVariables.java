package by.epam.seventhTask;

public class ReverseWithoutAdditionalVariables {

	private int a, b;

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
	
	public void reverseWithoutAdditionalVariables() {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Number a = " + a + " and b =" + b);
	}
}
