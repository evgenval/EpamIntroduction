package by.epam.ninthTask;

public class CalculatorOfHeadsAndEyes {

	private int age, heads;
	private static final int ZERO = 0;
	private static final int MEDIUM_DRAGON = 200;
	private static final int NOT_MEDIUM_DRAGON = 199;
	private static final int OLD_DRAGON = 300;
	private static final int NOT_OLD_DRAGON = 299;
	private static final int THREE_HEADS = 3;
	private static final int TWO_HEADS = 2;
	private static final int ONE_HEAD = 1;
	private static final int TWO_EYES = 2;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}else {
			System.out.println("ERROR");
			System.exit(0);
		}
	}
	
	private int getHeads() {
		return heads;
	}

	private void setHeads(int heads) {
		this.heads = heads;
	}

	public void calculatorOfHeadsAndEyes() {
		while(age > ZERO) {
			if(age < MEDIUM_DRAGON) {
				heads = heads + age*THREE_HEADS;
				age = ZERO;
			}else if(age < OLD_DRAGON) {
				heads = heads + (age-NOT_MEDIUM_DRAGON)*TWO_HEADS;
				age = NOT_MEDIUM_DRAGON;
			}else {
				heads = heads + (age - NOT_OLD_DRAGON)*ONE_HEAD;
				age = NOT_OLD_DRAGON;
			}
		}
		
		System.out.print("Number of heads: " + heads + ". Number of eyes: " + TWO_EYES*heads);
	}
}
