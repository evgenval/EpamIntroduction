package by.epam.playroom.service;

import java.util.Scanner;

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

	public static Toy createToy(ToyTypes toyType, double cost, AgeGroupType ageGroupType, SizeType sizeType) {
		
		switch(toyType) {
			case BALL:
				return createToy(cost, ageGroupType, sizeType, chooseBallType());
			case DOLL:
				return createToy(cost, ageGroupType, sizeType, chooseCanSingSong());
			case CUBBE: 
				return createToy(cost, ageGroupType, sizeType, chooseColor());
			case CAR:
				return createToy(cost, ageGroupType, sizeType, chooseCarAppointment());
			default:
				System.out.println("There is no such type of toy");
				return null;
		}
	}
	
	public static CarAppointment chooseCarAppointment() {
		CarAppointment appointment = null;
		int choice = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose appointment of car: if 1 - Police, 2 - Ambulance, 3 - Fire engine, 4 - civil");
		choice = scan.nextInt();
		switch(choice) {
			case 1: 
				return CarAppointment.POLICE;
			case 2:
				return CarAppointment.AMBULANCE;
			case 3:
				return CarAppointment.FIREENGINE;
			case 4:
				return CarAppointment.CIVIL;
			default:
				System.out.println("You don't choose that appointment");
				return null;
		}
		
	}
	
	public static BallTypeOfGame chooseBallType() {
		BallTypeOfGame ballGame = null;
		int choice = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose type of game of car:"
				+ "\n if 1 - football,\n 2 - basketball,\n 3 - volleyball,\n 4 - handball,\n"
				+ " 5 - tennis,\n 6 - hockey,\n 7 - rugby,\n 8 - waterpolo");
		choice = scan.nextInt();
		switch(choice) {
			case 1: 
				return BallTypeOfGame.FOOTBALL;
			case 2:
				return BallTypeOfGame.BASKETBALL;
			case 3:
				return BallTypeOfGame.VOLLEYBALL;
			case 4:
				return BallTypeOfGame.HANDBALL;
			case 5:
				return BallTypeOfGame.TENNIS;
			case 6:
				return BallTypeOfGame.HOCKEY;
			case 7:
				return BallTypeOfGame.RUGBY;
			case 8:
				return BallTypeOfGame.WATERPOLO;
			default:
				System.out.println("You don't choose type of game");
				return null;
		}
	}
	
	public static ColorType chooseColor() {
		ColorType color = null;
		int choice = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose type of game of car:"
				+ "\n if 1 - red,\n 2 - blue,\n 3 - white,\n 4 - dark,\n"
				+ " 5 - pink,\n 6 - green.");
		choice = scan.nextInt();
		switch(choice) {
			case 1: 
				return ColorType.RED;
			case 2:
				return ColorType.BLUE;
			case 3:
				return ColorType.WHITE;
			case 4:
				return ColorType.DARK;
			case 5:
				return ColorType.PINK;
			case 6:
				return ColorType.GREEN;
			default:
				System.out.println("You don't choose color");
				return null;
		}
	}
	
	public static boolean chooseCanSingSong() {
		boolean canSing = false;
		int choice = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose type of game of car:"
				+ "\n if 1 - red,\n 2 - blue,\n 3 - white,\n 4 - dark,\n"
				+ " 5 - pink,\n 6 - green.");
		choice = scan.nextInt();
		switch(choice) {
			case 1:
				return (canSing = true);
			case 2:
				return canSing;
			default:
				System.out.println("You don't choose, so doll can't sing");
				return canSing;
		}
	}
	
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
