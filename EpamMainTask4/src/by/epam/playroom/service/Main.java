package by.epam.playroom.service;

import java.io.File;
import java.util.ArrayList;

import by.epam.playroom.resources.ReaderResource;
import by.epam.playroom.domain.Room;
import by.epam.playroom.domain.Toy;
import by.epam.playroom.domain.enums.AgeGroupType;
import by.epam.playroom.domain.enums.ToyTypes;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Acer\\eclipse-workspace\\EpamMainTask4\\src\\by\\epam\\playroom\\resources\\text.txt");

//		File wrong = new File("wrong.txt");
		ReaderResource reader = new ReaderResource();
		ArrayList<Toy> toys = reader.readFromFile(file);

		/*Room room_1 = new Room();
		room_1.createRoom(7, 3000.0, AgeGroupType.YOUNGERGROUP, toys);
		room_1.printToysOfRoom();
		room_1.findToyByPrice(120.3);
		room_1.findToyByType(ToyTypes.CUBBE);
		room_1.sortToys(Parameter.PRICE);
		room_1.sortToys(Parameter.SIZE);
		room_1.sortToys(Parameter.TYPE);
		room_1.sortToysByPriceAndAgeGroup();*/
	}

}
