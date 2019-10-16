package by.epam.playroom.resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import by.epam.playroom.domain.Toy;
import by.epam.playroom.domain.enums.AgeGroupType;
import by.epam.playroom.domain.enums.SizeType;
import by.epam.playroom.domain.enums.ToyTypes;
import by.epam.playroom.service.Factory;

public class ReaderResource {

	private String line;
	
	private Pattern ball = Pattern.compile("^[Bb]all");
	private Pattern doll = Pattern.compile("^[Dd]oll");
	private Pattern car = Pattern.compile("^[Cc]ar");
	private Pattern cubbe = Pattern.compile("^[Cc]ubbe");
	private Pattern cost = Pattern.compile("(?<=cost\\:\\s)*\\d+[\\\\.]*\\d+");
	private Pattern ageGroupType = 
			Pattern.compile("(?<=ageGroup\\:\\s)?(YOUNGERGROUP|MEDIUMGROUP|OLDERGROUP)");
	private Pattern sizeType = Pattern.compile("(?<=size\\:\\s)(BIG|MEDIUM|SMALL)");
	
	public ArrayList<Toy> readFromFile(File file){
		ArrayList<Toy> toys = new ArrayList<Toy>();
		BufferedReader bufRead;
		
		try {
			FileReader fileRead = new FileReader(file);
			bufRead = new BufferedReader(fileRead);
			
			while((line = bufRead.readLine()) != null) {
				double costOfToy = 0;
				AgeGroupType ageGroup = null;
				SizeType size = null;
				ToyTypes toyType = null;
				
				Matcher matcherCost = cost.matcher(line);
				if(matcherCost.find()) {
					costOfToy = Double.parseDouble(matcherCost.group());
				}
				Matcher matcherAgeGroup = ageGroupType.matcher(line);
				Matcher matcherSize = sizeType.matcher(line);
				
				try {
					if(matcherAgeGroup.find()) {
						ageGroup = AgeGroupType.valueOf(matcherAgeGroup.group());
					}
					if(matcherSize.find()) {
						size = SizeType.valueOf(matcherSize.group());
					}
				} catch(IllegalArgumentException e) {
					ageGroup = null;
					size = null;
				}
				
				Matcher matcherBall = ball.matcher(line);
				if(matcherBall.find()) {
					toyType = ToyTypes.BALL;
				}
				
				Matcher matcherDoll = doll.matcher(line);
				if(matcherDoll.find()) {
					toyType = ToyTypes.DOLL;
				}
				
				Matcher matcherCar = car.matcher(line);
				if(matcherCar.find()) {
					toyType = ToyTypes.CAR;
				}
				
				Matcher matcherCubbe = cubbe.matcher(line);
				if(matcherCubbe.find()) {
					toyType = ToyTypes.CUBBE;
				}
				
				if(costOfToy != 0 && ageGroup != null && size != null && toyType != null) {
					Toy toy = Factory.createToy(toyType, costOfToy, ageGroup, size);
					toys.add(toy);
				}
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return toys;
	}
}
