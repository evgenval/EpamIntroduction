package by.epam.playroom.domain;

public class Ball extends Toy{
	
	private String typeOfGame;								// (football, basketball and etc.)

	public Ball() {
		super();
	}
	
	public Ball(String ageGroup, String size, int cost) {
		super(ageGroup, size, cost);
	}

	public String getTypeOfGame() {
		return typeOfGame;
	}

	public void setTypeOfGame(String typeOfGame) {
		this.typeOfGame = typeOfGame;
	}

	@Override
	public String toString() {
		return "Ball [" + (typeOfGame != null ? "typeOfGame=" + typeOfGame : "") + "]";
	}

	
	
	
}
