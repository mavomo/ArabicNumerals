package io.training.katas;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Michelle on 01/02/2017.
 */
public class ArabicNumerals {
    public static int convertFromRoman(String romanNumber) {
        Map<String, Integer> arabicNumbersFromRomanChart = getArabicValuesFromRomanNumeralsChart();
            char[] romanNumerals = romanNumber.toCharArray();
            int value = arabicNumbersFromRomanChart.get(String.valueOf(romanNumerals[0]));
            for (int i = 1; i < romanNumerals.length; i++) {
                Integer previousNumber = arabicNumbersFromRomanChart.get(String.valueOf(romanNumerals[i - 1]));
                Integer currentNumber = arabicNumbersFromRomanChart.get(String.valueOf(romanNumerals[i]));

                if (isSubstraction(romanNumerals, previousNumber, currentNumber)){
                   String combinedRomanNumerals = String.valueOf(romanNumerals[i-1]).concat(String.valueOf(romanNumerals[i]));
                    value += arabicNumbersFromRomanChart.get(combinedRomanNumerals)- previousNumber;
                }
                else {
                    value += currentNumber;
                }
            }

        return value;
    }

    private static boolean isSubstraction(char[] romanNumerals, Integer previousRomanLetter, Integer currentLetter) {
        return romanNumerals.length > 1 && previousRomanLetter < currentLetter;
    }

    private static Map<String, Integer> getArabicValuesFromRomanNumeralsChart() {
        Map<String, Integer> arabicNumbersFromRomanChart = new TreeMap<>(Collections.reverseOrder());
        arabicNumbersFromRomanChart.put("I", 1);
        arabicNumbersFromRomanChart.put("V", 5);
        arabicNumbersFromRomanChart.put("IV", 4);
        arabicNumbersFromRomanChart.put("IX", 9);
        arabicNumbersFromRomanChart.put("X", 10);
        arabicNumbersFromRomanChart.put("XL", 40);
        arabicNumbersFromRomanChart.put("L", 50);
        arabicNumbersFromRomanChart.put("XC", 90);
        arabicNumbersFromRomanChart.put("C", 100);
        arabicNumbersFromRomanChart.put("CD", 400);
        arabicNumbersFromRomanChart.put("D", 500);
        arabicNumbersFromRomanChart.put("CM", 900);
        arabicNumbersFromRomanChart.put("M", 1000);
        return arabicNumbersFromRomanChart;
    }
}
