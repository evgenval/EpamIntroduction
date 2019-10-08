package by.epam.playroom.domain;

public class Doll extends Toy{
	
	private boolean canSingTheSong;

	public Doll() {
		super();
	}
	
	public Doll(String ageGroup, String size, int cost) {
		super(ageGroup, size, cost);
	}

	public boolean isCanSingTheSong() {
		return canSingTheSong;
	}

	public void setCanSingTheSong(boolean canSingTheSong) {
		this.canSingTheSong = canSingTheSong;
	}

	@Override
	public String toString() {
		return "Doll [canSingTheSong=" + canSingTheSong + "]";
	}
	
	
}
