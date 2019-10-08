package by.epam.playroom.domain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import by.epam.playroom.domain.enums.AgeGroupType;
import by.epam.playroom.domain.enums.SizeType;
import by.epam.playroom.inter.ToyOperation;

public class Room implements ToyOperation{

	private Toy[] toys;
	private int money;
	
	public Room() {
		
	}

	public Toy[] getToys() {
		return toys;
	}


	public void setToys(Toy[] toys) {
		this.toys = toys;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void makeRoomOfToys() {
		
	}

	public static int findNumberOfLinesInFile() throws FileNotFoundException, IOException{
		int counter = 0;
		
		Scanner scan = new Scanner(new FileReader("file.txt"));
		
		while(scan.hasNextLine()) {
			scan.nextLine();
			counter++;
		}
		
		return counter;
	}
	
	public void readToysFromFile() throws FileNotFoundException, IOException{
		toys = new Toy[(findNumberOfLinesInFile() - 1)/4];
		
		Scanner scan = new Scanner(new FileReader("file.txt"));
		try{
			
			for(int i = 0; i < findNumberOfLinesInFile(); i++) {
				for(int j = 0; j < (findNumberOfLinesInFile() - 1)/4; j++) {
					if(i == 0) {
						this.setMoney(Integer.parseInt(scan.next()));
					}
					if(scan.equals("Ball")) {
						Ball ball = new Ball(scan.next(), scan.next(), scan.nextInt());
						toys[j] = ball;
						j = j + 1;
						i = i + 3;
					} else if(scan.equals("Doll")) {
						Doll doll = new Doll(scan.next(), scan.next(), scan.nextInt());
						toys[j] = doll;
						j = j + 1;
						i = i + 3;
					} else if(scan.equals("Car")) {
						Car car = new Car(scan.next(), scan.next(), scan.nextInt());
						toys[j] = car;
						j = j + 1;
						i = i + 3;
					} else if(scan.equals("Cubbe")) {
						Cubbe cubbe = new Cubbe(scan.next(), scan.next(), scan.nextInt());
						toys[j] = cubbe;
						j = j + 1;
						i = i + 3;
					}
				}
			}
		} finally {
			
		}
	}

	@Override
	public void sortBySize() throws FileNotFoundException, IOException {
		System.out.println("Sorted by size: ");
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.SMALL)) {
				System.out.println(toys[i].toString());
			}
		}
		
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.MEDIUM)) {
				System.out.println(toys[i].toString());
			}
		}
		
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.BIG)) {
				System.out.println(toys[i].toString());
			}
		}
		
	}

	@Override
	public void find() throws FileNotFoundException, IOException {
		int choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 0 if u wanna find small toys, "
				+ "1 if u wanna find medium toys,"
				+ " 2 if u wanna find big toys");
		choice = scan.nextInt();
		
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(choice == 0 && toys[i].getSize().equals(SizeType.SMALL)) {
				System.out.println(toys[i].toString());
			} else if(choice == 1 && toys[i].getSize().equals(SizeType.MEDIUM)) {
				System.out.println(toys[i].toString());
			} else if(choice == 2 && toys[i].getSize().equals(SizeType.BIG)) {
				System.out.println(toys[i].toString());
			}
		}
	}

	@Override
	public void sortBySizeAndAgeGroup() throws FileNotFoundException, IOException {
		System.out.println("Sorted by size and age group: ");
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.SMALL) 
					&& toys[i].getAgeGroup().equals(AgeGroupType.YOUNGER_GROUP)) {
				System.out.println(toys[i].toString());
			}
		}
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.SMALL) 
					&& toys[i].getAgeGroup().equals(AgeGroupType.MEDIUM_GROUP)) {
				System.out.println(toys[i].toString());
			}
		}
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.SMALL) 
					&& toys[i].getAgeGroup().equals(AgeGroupType.OLDER_GROUP)) {
				System.out.println(toys[i].toString());
			}
		}
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.MEDIUM) 
					&& toys[i].getAgeGroup().equals(AgeGroupType.YOUNGER_GROUP)) {
				System.out.println(toys[i].toString());
			}
		}
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.MEDIUM) 
					&& toys[i].getAgeGroup().equals(AgeGroupType.MEDIUM_GROUP)) {
				System.out.println(toys[i].toString());
			}
		}
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.MEDIUM) 
					&& toys[i].getAgeGroup().equals(AgeGroupType.OLDER_GROUP)) {
				System.out.println(toys[i].toString());
			}
		}
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.BIG) 
					&& toys[i].getAgeGroup().equals(AgeGroupType.YOUNGER_GROUP)) {
				System.out.println(toys[i].toString());
			}
		}
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.BIG) 
					&& toys[i].getAgeGroup().equals(AgeGroupType.MEDIUM_GROUP)) {
				System.out.println(toys[i].toString());
			}
		}
		for(int i = 0; i < (findNumberOfLinesInFile() - 1)/4; i++) {
			if(toys[i].getSize().equals(SizeType.BIG) 
					&& toys[i].getAgeGroup().equals(AgeGroupType.OLDER_GROUP)) {
				System.out.println(toys[i].toString());
			}
		}
	}

	@Override
	public String toString() {
		return "Room [" + (toys != null ? "toys=" + Arrays.toString(toys) : "") + "]";
	}
	
	
}
