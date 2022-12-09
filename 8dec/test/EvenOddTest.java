package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOddTest {
	static EvenOdd eo;

	@Test
	public void TEST1() {// this one for + test case
		eo = new EvenOdd();
		int n = 40;
		assertEquals("even", eo.even(n));
	}

	@Test
	public void TEST2() {// this one for -ve test case
		eo = new EvenOdd();
		int n = 39;
		assertEquals("even", eo.even(n));
	}
}
