package by.epam.forth;

import java.util.Scanner;

public class FriendlyNumbers {

	private int start, finish;
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final int ZERO = 0;

	private int getStart() {
		return start;
	}

	private void setStart(int start) {
		this.start = start;
	}

	private int getFinish() {
		return finish;
	}

	private void setFinish(int finish) {
		this.finish = finish;
	}
	
	public void inputRange() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start of range(natural number): ");
		this.setStart(scan.nextInt());
		System.out.println("Enter the finish of range(natural number): ");
		this.setFinish(scan.nextInt());
		checkForNatural();
	}
	private void checkForNatural() {
		while(this.start < 1 && this.finish < 1) {
			System.out.println("You entered not natural numbers please change them: ");
			inputRange();
		}
	}
	
	public void checkForFriend() {
		int forFirst, forSecond;
		for(int i = this.start; i < this.finish; i++) {
			forFirst = ZERO;
			for(int j = ONE; j < i; j++) {
				if(i % j == ZERO) {
					forFirst += j;
				}
			}
			for(int k = i + ONE; k <= this.finish; k++) {
				forSecond = ZERO;
				for(int z = ONE; z < k; z++) {
					if(k % z == ZERO) {
						forSecond += z;
					}
				}
				if(forFirst == k && forSecond == i) {
					System.out.println("There are two friendly numbers " + i + " and " + k);
				}
			}
		}
	}
}
