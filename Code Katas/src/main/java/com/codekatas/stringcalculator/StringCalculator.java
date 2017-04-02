package com.codekatas.stringcalculator;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by hari on 01-04-2017.
 */
public class StringCalculator {
    public static int add(String numbersText) {
        if(StringUtils.isEmpty(numbersText)) {
            return 0;
        } else {
            List<Integer> numbers = converter().apply(numbersText);
            return numbers.stream().reduce(0, (x,y)->x+y);
        }
    }

    private static Function<String, List<Integer>> converter() {
        return (numbersText) -> {
            String[] numbers1 = numbersText.split(",");
                List<Integer> listOfNumbers = new ArrayList<Integer>();
                for (String num:numbers1) {
                    listOfNumbers.add(toInt(num));
                }
                return listOfNumbers;
            };
    }

    private static int toInt(String number) {
        return Integer.parseInt(number);
    }
}
