package lab_12_Dec;

/*Problem Statement 2:
1.	Develop a java class with a instance variable Country  HashSet (H1)  add a method storeCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
2.	Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.

NOTE: You can test the methods using a main method.
*/
//importing required thing
import java.util.HashSet;
import java.util.Iterator;

//creating class and method as asked in question
public class Country {
	HashSet<String> H1 = new HashSet<>();// object of hasset

	public HashSet<String> storeCountryNames(String CountryName) {// creating method
		H1.add(CountryName);
		return H1;
	}

	public String retrieveCountry(String CountryName) {// creating method
		Iterator<String> it = H1.iterator();// iterator obj for itterate loop

		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
}

class main {
	public static void main(String[] args) {// main method
		Country c = new Country();// object of country
		c.storeCountryNames("india");// adding element to hashset
		c.storeCountryNames("usa");
		c.storeCountryNames("china");
		c.storeCountryNames("bhutan");
		c.storeCountryNames("mayanmar");
		c.storeCountryNames("vetican city");
		System.out.println(c.H1);
		c.retrieveCountry("usa");
		System.out.println(c.retrieveCountry("india"));// cheking country is avaible or not if avaible it will return
														// country name if not vaible it will show null
	}
}
