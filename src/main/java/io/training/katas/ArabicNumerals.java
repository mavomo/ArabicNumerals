package io.training.katas;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Michelle on 01/02/2017.
 */
public class ArabicNumerals {
    public static int convertFromRoman(String romanNumber) {
        Map<Character, Integer> arabicNumbersFromRomanChart = getArabicValuesFromRomanNumeralsChart();
        char[] romanNumerals = romanNumber.toCharArray();
        int value = arabicNumbersFromRomanChart.get(romanNumerals[0]);
        for (int i = 1 ; i < romanNumerals.length; i++){
            value++;
        }
        return value;
    }

    private static Map<Character, Integer> getArabicValuesFromRomanNumeralsChart() {
        Map<Character, Integer> arabicNumbersFromRomanChart = new HashMap<>();
        arabicNumbersFromRomanChart.put('I', 1);
        arabicNumbersFromRomanChart.put('V', 5);
        arabicNumbersFromRomanChart.put('X', 10);
        return arabicNumbersFromRomanChart;
    }
}
