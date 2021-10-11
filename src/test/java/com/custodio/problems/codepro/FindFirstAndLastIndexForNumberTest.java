package com.custodio.problems.codepro;

import com.custodio.problems.codepro.FindFirstAndLastIndexForNumber.Range;
import org.junit.Test;

import static com.custodio.problems.codepro.FindFirstAndLastIndexForNumber.solution;
import static org.junit.Assert.assertEquals;

public class FindFirstAndLastIndexForNumberTest {

    @Test
    public void when_ThereAreMatchingNumbersForTarget_Then_ReturnIndexRangeForTarget() {
        //when
        final var actualRange = solution(new int[]{1, 3, 3, 5, 7, 8, 9, 9, 9, 15}, 9);
        //then
        final var expectedRange = new Range(6, 8);
        assertEquals(expectedRange, actualRange);
    }

    @Test
    public void when_ThereAreNotMatchingNumbersForTarget_Then_ReturnNotFound() {
        //when
        final var actualRange = solution(new int[]{1, 3, 3, 5, 7, 8, 9, 9, 9, 15}, 16);
        //then
        final var expectedRange = new Range(-1, -1);
        assertEquals(expectedRange, actualRange);
    }
}
