package com.codekatas.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> computeFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int candidate =2;number>1;candidate++){
			for(;number%candidate == 0;number=number/candidate){
				factors.add(candidate);
			}
		}
		return factors;
	}

}
