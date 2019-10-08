package by.epam.playroom.domain;

public class Car extends Toy{
	
	private String appointment;						//(police, fire engine and etc.)

	public Car() {
		super();
	}
	
	public Car(String ageGroup, String size, int cost) {
		super(ageGroup, size, cost);
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Car [" + (appointment != null ? "appointment=" + appointment : "") + "]";
	}
	
	
	
}
