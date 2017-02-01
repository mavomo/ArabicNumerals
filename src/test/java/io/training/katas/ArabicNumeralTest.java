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
 *  XII -> 23
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

}
