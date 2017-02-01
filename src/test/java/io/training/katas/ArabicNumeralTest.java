package io.training.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicNumeralTest {
/**
 *  I -> 1
 *  II -> 2
 *  III -> 3
 *
 *  V -> 5
 *  VI -> 6
 *  VII -> 7
 *
 *  X -> 10
 *  XI -> 11
 *  XXII -> 23
 *
 *  L -> 50
 *  C -> 100
 *  500 -> D
 *  1000 -> M
 *
 */


@Test
public void should_return_1_given_I(){
    assertThat(ArabicNumerals.convertFromRoman("I")).isEqualTo(1);
}


    @Test
    public void should_return_2_given_II(){
        assertThat(ArabicNumerals.convertFromRoman("II")).isEqualTo(2);
    }


    @Test
    public void should_return_3_given_III(){
        assertThat(ArabicNumerals.convertFromRoman("III")).isEqualTo(3);
    }


    @Test
    public void should_return_5_given_V(){
        assertThat(ArabicNumerals.convertFromRoman("V")).isEqualTo(5);
    }


    @Test
    public void should_return_6_given_VI(){
        assertThat(ArabicNumerals.convertFromRoman("VI")).isEqualTo(6);
    }


    @Test
    public void should_return_15_given_XV(){
        assertThat(ArabicNumerals.convertFromRoman("XV")).isEqualTo(15);
    }


    @Test
    public void should_return_16_given_XVI(){
        assertThat(ArabicNumerals.convertFromRoman("XVI")).isEqualTo(16);
    }


    @Test
    public void should_return_25_given_XXV(){
        assertThat(ArabicNumerals.convertFromRoman("XXV")).isEqualTo(25);
    }

    @Test
    public void should_return_50_given_L() {
        assertThat(ArabicNumerals.convertFromRoman("L")).isEqualTo(50);
    }

    @Test
    public void should_return_100_given_C() {
        assertThat(ArabicNumerals.convertFromRoman("C")).isEqualTo(100);
    }

    @Test
    public void should_return_500_given_D() {
        assertThat(ArabicNumerals.convertFromRoman("D")).isEqualTo(500);
    }

    @Test
    public void should_return_1000_given_M() {
        assertThat(ArabicNumerals.convertFromRoman("M")).isEqualTo(1000);
    }


    @Test
    public void should_return_1515_given_MDXV() {
        assertThat(ArabicNumerals.convertFromRoman("MDXV")).isEqualTo(1515);
    }
}
