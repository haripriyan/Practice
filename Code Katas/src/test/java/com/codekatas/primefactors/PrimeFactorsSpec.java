package com.codekatas.primefactors;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.junit.Test;

public class PrimeFactorsSpec {

	@Test
	public void oneHasNoPrimeFactors() throws Exception {
		assertEquals(Collections.emptyList(), PrimeFactors.computeFactors(1));
	}
	@Test
	public void twoHasItselfAsPrimeFactor() throws Exception {
		assertEquals(asList(2), PrimeFactors.computeFactors(2));
	}
	@Test
	public void threeHasOnlyItselfAsPrimeFactor() throws Exception {
		assertEquals(asList(3), PrimeFactors.computeFactors(3));
	}
	@Test
	public void fourHasTwoTimesTwosAsPrimeFactors() throws Exception {
		assertEquals(asList(2,2), PrimeFactors.computeFactors(4));
	}
	@Test
	public void fiveHasOnlyItselfAsPrimeFactors() throws Exception {
		assertEquals(asList(5), PrimeFactors.computeFactors(5));
	}
	@Test
	public void sixHasTwoAndThreeAsPrimeFactors() throws Exception {
		assertEquals(asList(2,3), PrimeFactors.computeFactors(6));
	}
	@Test
	public void eightHasThreeTimesTwoAsPrimeFactors() throws Exception {
		assertEquals(asList(2,2,2), PrimeFactors.computeFactors(8));
	}
	@Test
	public void nineHasTwoTimesThreeAsPrimeFactors() throws Exception {
		assertEquals(asList(3,3), PrimeFactors.computeFactors(9));
	}
	@Test
	public void tenHasTwoAndFiveAsPrimeFactors() throws Exception {
		assertEquals(asList(2,5), PrimeFactors.computeFactors(10));
	}
	@Test
	public void fourteenHasTwoAndSevenAsPrimeFactors() throws Exception {
		assertEquals(asList(2,7), PrimeFactors.computeFactors(14));
	}
}
