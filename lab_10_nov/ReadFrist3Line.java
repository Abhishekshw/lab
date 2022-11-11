package lab_10_nov;

import java.io.BufferedReader;
import java.io.FileReader;

//read 3line of text file
public class ReadFrist3Line {
	public static void main(String[] args) {// main method
		try {
			FileReader f = new FileReader("D:\\lab.txt");// passing location of file through filereader
			BufferedReader LN = new BufferedReader(f);// object of buffer reader
			String line = LN.readLine();
			int i = 0;
			while ((LN != null && (i < 3))) {// condtions
				System.out.println(line);
				line = LN.readLine();
				i++;
			}
			f.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
