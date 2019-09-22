package by.epam.first;

import java.util.Random;

public class CoinFlip {

	private int heads, tails;
	private static final int ONE_THOUSAND = 1000;
	private static final int ZERO = 0;
	private static final int HEAD = 1;
	private static final int TAIL = 2;
	private static final int THREE = 3;
	
	private int getHeads() {
		return heads;
	}
	private void setHeads(int heads) {
		this.heads = heads;
	}
	private int getTails() {
		return tails;
	}
	private void setTails(int tails) {
		this.tails = tails;
	}
	
	public void makeCoinFlip() {
		Random random = new Random();
		int headOrTail;
		int forHead = 0;
		int forTail = 0;
		for(int i = ZERO; i < ONE_THOUSAND; i++) {
			headOrTail = HEAD + random.nextInt(THREE - HEAD);
			if(headOrTail == HEAD) {
				this.setHeads(++forHead);
			}else if(headOrTail == TAIL) {
				this.setTails(++forTail);
			}
		}
	}
	
	public void printResult() {
		System.out.println("There were " + this.heads + " heads and " + this.tails +" tails in 1000 flips of coin");
	}
}
