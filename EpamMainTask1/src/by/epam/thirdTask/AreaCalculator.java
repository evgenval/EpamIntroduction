package by.epam.thirdTask;

public class AreaCalculator {

	private int radius_1, radius_2;
	private static final double NUMBER_PI = 3.1415926;

	public double getRadius_1() {
		return radius_1;
	}

	public void setRadius_1(int radius_1) {
		this.radius_1 = radius_1;
	}

	public double getRadius_2() {
		return radius_2;
	}

	public void setRadius_2(int radius_2) {
		if(this.radius_1 > radius_2) {
			this.radius_2 = radius_2;
		} else {
			System.out.println("Error. The Second Radius is more then the first radius.");
			System.exit(0);
		}
	}

	public void calculateTheAreaOfTheRing() {
		System.out.println("The area of the ring = " + 	(NUMBER_PI*(Math.pow(radius_1, 2)- Math.pow(radius_2, 2))));
	}
	
}
 