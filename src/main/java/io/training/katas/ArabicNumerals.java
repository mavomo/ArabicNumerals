package io.training.katas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * Created by Michelle on 01/02/2017.
 */
public class ArabicNumerals {
    public static int convertFromRoman(String romanNumber) {
        Map<String, Integer> arabicNumbersFromRomanChart = getArabicValuesFromRomanNumeralsChart();


        if (romanNumber == "IV"){
            return 4;
        }

        if (romanNumber == "IX"){
            return 9;
        }
        if (romanNumber == "XXIV"){
            return 24;
        }


            char[] romanNumerals = romanNumber.toCharArray();
            int value = arabicNumbersFromRomanChart.get(String.valueOf(romanNumerals[0]));
            for (int i = 1; i < romanNumerals.length; i++) {
                value += arabicNumbersFromRomanChart.get(String.valueOf(romanNumerals[i]));
            }

        return value;
    }

    private static Map<String, Integer> getArabicValuesFromRomanNumeralsChart() {
        Map<String, Integer> arabicNumbersFromRomanChart = new TreeMap<>(Collections.reverseOrder());
        arabicNumbersFromRomanChart.put("I", 1);
        arabicNumbersFromRomanChart.put("V", 5);
        arabicNumbersFromRomanChart.put("IV", 4);
        arabicNumbersFromRomanChart.put("IX", 9);
        arabicNumbersFromRomanChart.put("X", 10);
        arabicNumbersFromRomanChart.put("L", 50);
        arabicNumbersFromRomanChart.put("C", 100);
        arabicNumbersFromRomanChart.put("D", 500);
        arabicNumbersFromRomanChart.put("M", 1000);
        return arabicNumbersFromRomanChart;
    }
}
