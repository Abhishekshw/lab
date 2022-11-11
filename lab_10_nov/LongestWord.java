package lab_10_nov;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//longest word in a test file
public class LongestWord {
	public static void main(String[] args) throws FileNotFoundException {// main method
		new LongestWord().findLongestWords();
	}

	public String findLongestWords() throws FileNotFoundException {

		String longest_word = "";// string declearation
		String current_word;
		Scanner sc = new Scanner(new File("D:\\lab.txt"));
		while (sc.hasNext()) {// cheking next number
			current_word = sc.next();
			if (current_word.length() > longest_word.length()) {// cheking which has bigger length
				longest_word = current_word;
			}
		}
		System.out.println("\n" + longest_word + "\n");
		return longest_word;
	}
}
