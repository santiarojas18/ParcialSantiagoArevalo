package main;

public class FizzBuzz {
	private int number;
	private String stringValueOfNumber;
	//private String kindOfNumber;
	/**
	 * Constructor for objects of FizzBuzz Class
	 * @param number the number which you want to Know if it is fizz, buzz or fizzbuzz
	 */
	public FizzBuzz (int number) {
		this.number = number;
		stringValueOfNumber = String.valueOf(number);
	}
	
	/**
	 * Calculates if a number is fizz, buzz or fizzbuzz
	 * @return result with the kind of number
	 */
	public String fizzBuzzCalculator () {
		String resultDiv = "";
		String resultCon = "";
		String result = "";
		resultDiv = calculateAccordingDivisors();
		resultCon = calculateAccordingContains();
		if (resultDiv.equals(resultCon)) {
			result = resultCon;
		} else if (resultDiv.equals("FizzBuzz") || resultCon.equals("FizzBuzz")) {
			result = "FizzBuzz";
		} else if (resultDiv.equals("Fizz") && resultCon.equals("Buzz")) {
			result = "FizzBuzz";
		} else if (resultDiv.equals("Buzz") && resultCon.equals("Fizz")) {
			result = "FizzBuzz";
		} else {
			result = resultDiv;
			if (result.equals(stringValueOfNumber)) {
				result = resultCon;
			}
		}
		return result;
	}
	
	/**
	 * Calculates the kind of number according with the divisors
	 * @return result with the kind of number
	 */
	private String calculateAccordingDivisors () {
		String result = stringValueOfNumber;
		if (number % 3 == 0 && number % 5 == 0) {
			result = "FizzBuzz";
		} else if (number % 3 == 0) {
			result = "Fizz";
		} else if (number % 5 == 0) {
			result = "Buzz";
		}
		return result;
	}
	
	/**
	 * Calculates the kind of number according with the numbers that contains
	 * @return result with the kind of number
	 */
	private String calculateAccordingContains () {
		String result = stringValueOfNumber;
		if (stringValueOfNumber.contains("5") && stringValueOfNumber.contains("3")) {
			result = "FizzBuzz";
		} else if (stringValueOfNumber.contains("3")) {
			result = "Fizz";
		} else if (stringValueOfNumber.contains("5")) {
			result = "Buzz";
		}
		return result;
	}
	
	public void setNumber (int newNumber) {
		this.number = newNumber;
		stringValueOfNumber = String.valueOf(number);
	}
	
	public static void main (String[] args) {
		FizzBuzz objectToPrint = new FizzBuzz(0);
		for (int i = 0; i < 100; i++) {
			objectToPrint.setNumber(i+1);
			System.out.println(objectToPrint.fizzBuzzCalculator());
		}
	}
}
