package by.epam.secondTask;

public class Converter {

	private int weight;
	private static final long MILLIGRAMS_IN_KILOGRAM = 1000000;
	private static final int GRAMS_IN_KILOGRAM = 1000;
	private static final double TONS_IN_KILOGRAM = 0.001;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public long convertToMilligrams() {
		long weightInMilligrams;
		
		weightInMilligrams = weight * MILLIGRAMS_IN_KILOGRAM;
		System.out.print("Weight in milligrams: ");
		return weightInMilligrams;
	}
	
	public long convertToGrams() {
		long weightInGrams;
		
		weightInGrams = weight * GRAMS_IN_KILOGRAM;
		System.out.print("Weight in grams: ");
		return weightInGrams;
	}
	
	public double convertToTons() {
		double weightInTons;
		
		weightInTons = weight * TONS_IN_KILOGRAM;
		System.out.print("Weight in tons: ");
		return weightInTons;
	}
}
