package by.epam.playroom.inter;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.playroom.domain.Toy;

public interface ToyOperation {

	void sortBySize() throws FileNotFoundException, IOException;
	void find() throws FileNotFoundException, IOException;
	void sortBySizeAndAgeGroup() throws FileNotFoundException, IOException;
}
