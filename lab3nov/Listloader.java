package lab3nov;

import java.util.ArrayList;

//problem 1
public class Listloader {

	public void loadList(Integer StartNumber, Integer lastNumber) {// method created
		ArrayList<Integer> L = new ArrayList<>();
		for (int i = StartNumber; i <= lastNumber; i++) {
			L.add(i);
		}

	}

	public static void main(String[] args) {
		Listloader obj = new Listloader();
		long StratTime = System.currentTimeMillis();
		obj.loadList(0, 10000000);
		long lastTime = System.currentTimeMillis();
		long responcetime = lastTime - StratTime;
		System.out.println("time taken for Exicution is " + responcetime);
	}
}
