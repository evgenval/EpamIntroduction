package by.epam.playroom.service;

import by.epam.playroom.domain.Ball;
import by.epam.playroom.domain.Car;
import by.epam.playroom.domain.Cubbe;
import by.epam.playroom.domain.Doll;
import by.epam.playroom.domain.Toy;
import by.epam.playroom.domain.enums.AgeGroupType;
import by.epam.playroom.domain.enums.BallTypeOfGame;
import by.epam.playroom.domain.enums.CarAppointment;
import by.epam.playroom.domain.enums.ColorType;
import by.epam.playroom.domain.enums.SizeType;
import by.epam.playroom.domain.enums.ToyTypes;

public class Factory {
	
	public static Toy createToy(double cost, AgeGroupType ageGroupType, SizeType sizeType, BallTypeOfGame ballGame) {
		return new Ball(ageGroupType, sizeType, cost, ballGame);
	}
	
	public static Toy createToy(double cost, AgeGroupType ageGroupType, SizeType sizeType, ColorType color) {
		return new Cubbe(ageGroupType, sizeType, cost, color);
	}
	
	public static Toy createToy(double cost, AgeGroupType ageGroupType, SizeType sizeType, boolean singSong) {
		return new Doll(ageGroupType, sizeType, cost, singSong);
	}
	
	public static Toy createToy(double cost, AgeGroupType ageGroupType, SizeType sizeType, CarAppointment appointment) {
		return new Car(ageGroupType, sizeType, cost, appointment);
	}
}
