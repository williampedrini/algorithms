package com.custodio.problems.codepro;

import org.junit.Test;

import static com.custodio.problems.codepro.ReverseOnlyLetters.solution;
import static org.junit.Assert.assertEquals;

public class ReverseOnlyLettersTest {

    @Test
    public void when_SimpleStringWithEnglishLettersOnly_Then_Return_AllLettersInReverse() {
        //when
        final var actualReversedString = solution("ab-cd");
        //then
        final var expectedReversedString = "dc-ba";
        assertEquals(expectedReversedString, actualReversedString);
    }

    @Test
    public void when_SimpleStringWithEnglishLettersAndNonEnglishLetters_Then_Return_AllEnglishLettersInReverse() {
        //when
        final var actualReversedString = solution(";2N8op6");
        //then
        final var expectedReversedString = ";2p8oN6";
        assertEquals(expectedReversedString, actualReversedString);
    }
}
