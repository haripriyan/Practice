package com.codekatas.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzSpec {

	@Test
	public void multipleOf3ShouldReturnFizz() throws Exception {
		assertEquals("Fizz",FizzBuzz.answer(3));
		assertEquals("Fizz",FizzBuzz.answer(6));
	}
	@Test
	public void multipleOf5ShouldReturnBuzz() throws Exception {
		assertEquals("Buzz",FizzBuzz.answer(5));
		assertEquals("Buzz",FizzBuzz.answer(10));
	}
	@Test
	public void multipleOf15ShouldReturnFizzBuzz() throws Exception {
		assertEquals("FizzBuzz",FizzBuzz.answer(15));
		assertEquals("FizzBuzz",FizzBuzz.answer(30));
	}
	@Test
	public void ifNotMultipleOf3Or5Or15ShouldReturnNumber() throws Exception {
		assertEquals("1",FizzBuzz.answer(1));
		assertEquals("4",FizzBuzz.answer(4));
		assertEquals("11",FizzBuzz.answer(11));
	}
	@Test
	public void twoShouldReturnTwo() throws Exception {
		assertEquals("2",FizzBuzz.answer(2));
	}
	@Test(expected=IllegalArgumentException.class)
	public void zeroShouldThrowException() throws Exception {
		FizzBuzz.answer(0);
	}
	@Test(expected=IllegalArgumentException.class)
	public void negativeShouldThrowException() throws Exception {
		FizzBuzz.answer(-3);
	}
}
