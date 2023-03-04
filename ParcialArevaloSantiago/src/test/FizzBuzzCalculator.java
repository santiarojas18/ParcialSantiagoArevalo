package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class FizzBuzzCalculator {

	@Test
	public void should_ReturnFizz_when_NumberIs9 () {
		//arrange
		//Multiple of 3
		FizzBuzz toProve = new FizzBuzz(9);
		
		//act
		String result = toProve.fizzBuzzCalculator();
		
		//assert
		assertEquals("Fizz", result);
	}

	
	@Test
	public void should_ReturnBuzz_when_NumberIs50 () {
		//arrange
		//Multiple of 5
		FizzBuzz toProve = new FizzBuzz(50);
				
		//act
		String result = toProve.fizzBuzzCalculator();
				
		//assert
		assertEquals("Buzz", result);
	}
	
	@Test
	public void should_ReturnFizzBuzz_when_NumberIs15 () {
		//arrange
		//Multiple of 3 and 5
		FizzBuzz toProve = new FizzBuzz(15);
				
		//act
		String result = toProve.fizzBuzzCalculator();
				
		//assert
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void should_ReturnFizz_when_NumberIs73 () {
		//arrange
		//Contains 3
		FizzBuzz toProve = new FizzBuzz(73);
				
		//act
		String result = toProve.fizzBuzzCalculator();
				
		//assert
		assertEquals("Fizz", result);
	}
	
	@Test
	public void should_ReturnBuzz_when_NumberIs58 () {
		//arrange
		//Contains 5
		FizzBuzz toProve = new FizzBuzz(58);
				
		//act
		String result = toProve.fizzBuzzCalculator();
				
		//assert
		assertEquals("Buzz", result);
	}
	
	@Test
	public void should_ReturnFizzBuzz_when_NumberIs53 () {
		//arrange
		//Contains 5 and 3
		FizzBuzz toProve = new FizzBuzz(53);
				
		//act
		String result = toProve.fizzBuzzCalculator();
				
		//assert
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void should_ReturnFizzBuzz_when_NumberIs57 () {
		//arrange
		//Is Multiple of 3 and contains 5
		FizzBuzz toProve = new FizzBuzz(57);
				
		//act
		String result = toProve.fizzBuzzCalculator();
				
		//assert
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void should_ReturnFizzBuzz_when_NumberIs35 () {
		//arrange
		//Is Multiple of 5 and contains 3
		FizzBuzz toProve = new FizzBuzz(35);
				
		//act
		String result = toProve.fizzBuzzCalculator();
				
		//assert
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void should_ReturnSameNumber_when_NumberIs7 () {
		//arrange
		//Not multiple of 3 or 5 and doesn't contain 3 or 5
		FizzBuzz toProve = new FizzBuzz(7);
				
		//act
		String result = toProve.fizzBuzzCalculator();
				
		//assert
		assertEquals("7", result);
	}
}
