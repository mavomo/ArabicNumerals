package io.training.katas;

import org.junit.Test;

import static io.training.katas.ArabicNumerals.convertFromRoman;
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
 *  4 -> IV
 *  9 -> IX
 *  40 -> XL
 *  90 -> LC
 *
 */


@Test
public void should_return_1_given_I(){
    assertThat(convertFromRoman("I")).isEqualTo(1);
}


    @Test
    public void should_return_2_given_II(){
        assertThat(convertFromRoman("II")).isEqualTo(2);
    }


    @Test
    public void should_return_3_given_III(){
        assertThat(convertFromRoman("III")).isEqualTo(3);
    }


    @Test
    public void should_return_5_given_V(){
        assertThat(convertFromRoman("V")).isEqualTo(5);
    }


    @Test
    public void should_return_6_given_VI(){
        assertThat(convertFromRoman("VI")).isEqualTo(6);
    }


    @Test
    public void should_return_15_given_XV(){
        assertThat(convertFromRoman("XV")).isEqualTo(15);
    }


    @Test
    public void should_return_16_given_XVI(){
        assertThat(convertFromRoman("XVI")).isEqualTo(16);
    }


    @Test
    public void should_return_25_given_XXV(){
        assertThat(convertFromRoman("XXV")).isEqualTo(25);
    }

    @Test
    public void should_return_50_given_L() {
        assertThat(convertFromRoman("L")).isEqualTo(50);
    }

    @Test
    public void should_return_100_given_C() {
        assertThat(convertFromRoman("C")).isEqualTo(100);
    }

    @Test
    public void should_return_500_given_D() {
        assertThat(convertFromRoman("D")).isEqualTo(500);
    }

    @Test
    public void should_return_1000_given_M() {
        assertThat(convertFromRoman("M")).isEqualTo(1000);
    }

    @Test
    public void should_return_1515_given_MDXV() {
        assertThat(convertFromRoman("MDXV")).isEqualTo(1515);
    }

    @Test
    public void should_return_4_given_IV() {
        assertThat(convertFromRoman("IV")).isEqualTo(4);
    }


    @Test
    public void should_return_9_given_IX() {
        assertThat(convertFromRoman("IX")).isEqualTo(9);
    }

}
