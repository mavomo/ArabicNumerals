package io.training.katas;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Michelle on 01/02/2017.
 */
public class ArabicNumerals {
    public static int convertFromRoman(String romanNumber) {
        Map<String, Integer> arabicNumbersFromRomanChart = new HashMap<>();
        arabicNumbersFromRomanChart.put("I", 1);
        char[] romanNumerals = romanNumber.toCharArray();
        int value = arabicNumbersFromRomanChart.get("I");
        for (int i = 1 ; i < romanNumerals.length; i++){
            value++;
        }
/*
        if (romanNumber == "II"){
            return 2;
        }
        if (romanNumber == "III"){
            return 3;
        }*/
        return value;
    }
}
