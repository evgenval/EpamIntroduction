package by.epam.playroom.service;

import by.epam.playroom.domain.Ball;
import by.epam.playroom.domain.Car;
import by.epam.playroom.domain.Cubbe;
import by.epam.playroom.domain.Doll;
import by.epam.playroom.domain.Toy;
import by.epam.playroom.domain.enums.AgeGroupType;
import by.epam.playroom.domain.enums.SizeType;
import by.epam.playroom.domain.enums.ToyTypes;

public class Factory {

	public static Toy createToy(ToyTypes toyType, double cost, AgeGroupType ageGroupType, SizeType sizeType) {
		
		switch(toyType) {
			case BALL:
				return new Ball(ageGroupType, sizeType, cost);
			case DOLL:
				return new Doll(ageGroupType, sizeType, cost);
			case CUBBE: 
				return new Cubbe(ageGroupType, sizeType, cost);
			case CAR:
				return new Car(ageGroupType, sizeType, cost);
			default:
				System.out.println("There is no such type of toy");
				return null;
		}
	}
}
