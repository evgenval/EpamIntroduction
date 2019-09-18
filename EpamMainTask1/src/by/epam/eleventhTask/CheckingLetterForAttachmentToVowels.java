package by.epam.eleventhTask;

import java.util.HashMap;
import java.util.Map;

public class CheckingLetterForAttachmentToVowels {

	private char letter;
	private static final char CAPITAL_A = 'A';
	private static final char NONCAPITAL_A = 'a';
	private static final char CAPITAL_E = 'E';
	private static final char NONCAPITAL_E = 'e';
	private static final char CAPITAL_U = 'U';
	private static final char NONCAPITAL_U = 'u';
	private static final char CAPITAL_I = 'I';
	private static final char NONCAPITAL_I = 'i';
	private static final char CAPITAL_O = 'O';
	private static final char NONCAPITAL_O = 'o';

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	public void chechingForAttachmentToVowelsFirst() {
		char[] vowels = {NONCAPITAL_A, NONCAPITAL_E, NONCAPITAL_I, NONCAPITAL_O, NONCAPITAL_U};
		char a = Character.toLowerCase(letter);
		for(int i = 0; i < vowels.length; i++) {
			if(a == vowels[i]) {
				System.out.println("Vowel");
				break;
			}else if(i == (vowels.length - 1)) {
				System.out.println("Not vowel");
			}
		}
	}
	
	public void checkingForAttachmentToVowelsSecond(){
		if(letter == CAPITAL_A || letter == NONCAPITAL_A) {
			System.out.println("Vowel");
		}else if(letter == CAPITAL_E || letter == NONCAPITAL_E) {
			System.out.println("Vowel");
		}else if(letter == CAPITAL_U || letter == NONCAPITAL_U) {
			System.out.println("Vowel");
		}else if(letter == CAPITAL_I || letter == NONCAPITAL_I) {
			System.out.println("Vowel");
		}else if(letter == CAPITAL_O || letter == NONCAPITAL_O) {
			System.out.println("Vowel");
		}else {
			System.out.println("Not vowel");
		}
	}
	
	public void checkingForAttachmentToVowelsThird() {
		switch(letter) {
		case CAPITAL_A:
		case CAPITAL_E:
		case CAPITAL_U:
		case CAPITAL_I:
		case CAPITAL_O:
		case NONCAPITAL_A:
		case NONCAPITAL_E:
		case NONCAPITAL_U:
		case NONCAPITAL_I:
		case NONCAPITAL_O:
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not vowel");
			break;
		}
	}
	
	public void chechingForAttachmentToVowelsFourth() {
		char[] vowels = {CAPITAL_A, CAPITAL_E, CAPITAL_I, CAPITAL_O, CAPITAL_U};
		char a = Character.toUpperCase(letter);
		for(int i = 0; i < vowels.length; i++) {
			if(a == vowels[i]) {
				System.out.println("Vowel");
				break;
			}else if(i == (vowels.length - 1)) {
				System.out.println("Not vowel");
			}
		}
	}
}