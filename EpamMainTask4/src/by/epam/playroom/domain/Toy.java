package by.epam.playroom.domain;

public abstract class Toy {

	private String ageGroup;
	private String size;
	private int cost;
	
	public Toy() {
		
	}
	
	public Toy(String ageGroup, String size, int cost) {
		this.ageGroup = ageGroup;
		this.size = size;
		this.cost = cost;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ageGroup == null) ? 0 : ageGroup.hashCode());
		result = prime * result + cost;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		if (ageGroup == null) {
			if (other.ageGroup != null)
				return false;
		} else if (!ageGroup.equals(other.ageGroup))
			return false;
		if (cost != other.cost)
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Toy [" + (ageGroup != null ? "ageGroup=" + ageGroup + ", " : "")
				+ (size != null ? "size=" + size + ", " : "") + "cost=" + cost + "]";
	}
	
	
}
