package by.epam.playroom.domain;

public class Cubbe extends Toy{
	
	private String color;

	public Cubbe() {
		super();
	}
	
	public Cubbe(String ageGroup, String size, int cost) {
		super(ageGroup, size, cost);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cubbe [" + (color != null ? "color=" + color : "") + "]";
	}
	
	
}
