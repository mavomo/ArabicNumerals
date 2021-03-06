package io.training.katas;

import org.junit.Test;

import static io.training.katas.ArabicNumerals.convertFromRoman;
import static org.assertj.core.api.Assertions.assertThat;

public class ArabicNumeralTest {

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


    @Test
    public void should_return_24_given_XXIV() {
        assertThat(convertFromRoman("XXIV")).isEqualTo(24);
    }


    @Test
    public void should_return_40_given_XL() {
        assertThat(convertFromRoman("XL")).isEqualTo(40);
    }


    @Test
    public void should_return_90_given_XC() {
        assertThat(convertFromRoman("XC")).isEqualTo(90);
    }

    @Test
    public void should_return_400_given_CD() {
        assertThat(convertFromRoman("CD")).isEqualTo(400);
    }


    @Test
    public void should_return_900_given_CM() {
        assertThat(convertFromRoman("CM")).isEqualTo(900);
    }


     @Test
    public void should_return_1495_given_MCDIXV() {
        assertThat(convertFromRoman("MCDXCV")).isEqualTo(1495);
    }

}
