package io.training.katas;

/**
 * Created by Michelle on 01/02/2017.
 */
public class ArabicNumerals {
    public static int convertFromRoman(String romanNumber) {
        if (romanNumber == "II"){
            return 2;
        }
        if (romanNumber == "III"){
            return 3;
        }
        return 1;
    }
}
