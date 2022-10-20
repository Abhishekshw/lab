package Exeption.lab20oct;

//Write a java program to create custum Exception
class IsAVolwelException extends Exception {// creating a exeption
	IsAVolwelException(String M) {
		super(M);
	}
}

public class CreateCustomException {// main class
	void consonants(char c) throws IsAVolwelException {// method
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {// condition of Exception
			throw new IsAVolwelException("its a vowel");
		} else
			System.out.println("its a consonant");
	}

	public static void main(String[] args) throws Exception {

		CreateCustomException cl = new CreateCustomException();// object of main class
		cl.consonants('o');// passing o as a character
	}
}
