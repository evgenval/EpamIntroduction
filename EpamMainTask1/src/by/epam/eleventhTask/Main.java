package by.epam.eleventhTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CheckingLetterForAttachmentToVowels check = new CheckingLetterForAttachmentToVowels();
		
		check.setLetter('O');
		check.chechingForAttachmentToVowelsFirst();
		check.checkingForAttachmentToVowelsSecond();
		check.checkingForAttachmentToVowelsThird();
		check.chechingForAttachmentToVowelsFourth();
	}

}
