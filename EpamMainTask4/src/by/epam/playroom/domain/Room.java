package by.epam.playroom.domain;

import java.util.ArrayList;
import java.util.Collections;

import by.epam.playroom.domain.enums.AgeGroupType;
import by.epam.playroom.domain.enums.SizeType;
import by.epam.playroom.domain.enums.ToyTypes;
import by.epam.playroom.service.ComparatorForOneParameter;
import by.epam.playroom.service.ComparatorForPriceAndAgeGroup;
import by.epam.playroom.service.Factory;
import by.epam.playroom.domain.enums.ParameterForComparator;;

public class Room{

	private ArrayList<Toy> roomToys = new ArrayList<Toy>();
	private 

	public ArrayList<Toy> createRoom(int roomCapacity, double totalCost, AgeGroupType childAge, ArrayList<Toy> toys) {
		double priceOfToys = 0.0;
		int counter = 0;

		for (Toy toy : toys) {
			if (totalCost > priceOfToys && toy.getAgeGroup().equals(childAge) && roomCapacity > counter) {
				this.roomToys.add(toy);
				priceOfToys += toy.getCost();
				counter++;
			}
		}
		return roomToys;
	}

	public void sortToys(ParameterForComparator parameter) {
		ComparatorForOneParameter comparator = new ComparatorForOneParameter(parameter);
		Collections.sort(this.roomToys, comparator);
		//printToysOfRoom();
	}

	public void sortToysByPriceAndAgeGroup() {
		ComparatorForPriceAndAgeGroup comparator = new ComparatorForPriceAndAgeGroup();
		Collections.sort(this.roomToys, comparator);
		//printToysOfRoom();
	}

	public Toy findToyByPrice(double price) {
		Toy toy = Factory.createToy(ToyTypes.BALL, price, AgeGroupType.MEDIUMGROUP, SizeType.BIG);
		ComparatorForOneParameter compare = new ComparatorForOneParameter(ParameterForComparator.COST);
		for (Toy toyFromRoom : this.roomToys) {
			if (compare.compare(toyFromRoom, toy) == 0) {
				System.out.println("You are looking for: " + toyFromRoom);
				return toyFromRoom;
			}
		}
		System.out.println("There is no such toys...");
		return null;
	}

	/*public Toy findToyByType(ToyTypes type) {
		ComparatorForOneParameter compare = new ComparatorForOneParameter(ParameterForComparator.TYPE);
		for (Toy toyFromRoom : this.roomToys) {
			if (compare.compare(toyFromRoom, toy) == 0) {
				System.out.println("You are looking for: " + toyFromRoom);
				return toyFromRoom;
			}
		}

		return null;
	}*/

	public ArrayList<Toy> getRoomToys() {
		return roomToys;
	}
	
}
