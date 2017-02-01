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

      /*  if (romanNumber == "XV"){
            return 15;
        }

        if (romanNumber == "XVI"){
            return 16;
        }*/

          for (int i = 1 ; i < romanNumerals.length; i++){
              value+= arabicNumbersFromRomanChart.get(romanNumerals[i]) ;
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
