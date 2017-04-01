package com.codekatas.fizzbuzz;

public class FizzBuzz {

	public static String answer(int number) {
		checkNumber(number);
		return computeAnswer(number);
	}

	private static void checkNumber(int number) {
		if (number <= 0)
			throw new IllegalArgumentException();
	}

	private static String computeAnswer(int number) {
		String answer = String.valueOf(number);
		if (isMultipleOf3(number) && isMultipleOf5(number)) {
			answer = "FizzBuzz";
		} else if (isMultipleOf3(number)) {
			answer = "Fizz";
		} else if (isMultipleOf5(number)) {
			answer = "Buzz";
		}
		return answer;
	}

	private static boolean isMultipleOf3(int number) {
		return number % 3 == 0;
	}

	private static boolean isMultipleOf5(int number) {
		return number % 5 == 0;
	}

}
