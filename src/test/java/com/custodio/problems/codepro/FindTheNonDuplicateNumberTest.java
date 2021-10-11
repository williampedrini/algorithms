package com.custodio.problems.codepro;

import org.junit.Test;

import static com.custodio.problems.codepro.FindTheNonDuplicateNumber.solution;
import static org.junit.Assert.assertEquals;

public class FindTheNonDuplicateNumberTest {

    @Test
    public void when_ThereIsANonDuplicatedNumber_Then_ReturnTheDuplicatedNumber() {
        //given
        final var input = new int[]{1, 2, 3, 4, 4, 3, 2};
        //when
        final Integer actual = solution(input);
        //then
        final Integer expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void when_ThereIsNotANonDuplicatedNumber_Then_ReturnNotFound() {
        //given
        final var input = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        //when
        final Integer actual = solution(input);
        //then
        final Integer expected = -1;
        assertEquals(expected, actual);
    }
}
