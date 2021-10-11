package com.custodio.problems.codepro;

import org.junit.Test;

import static com.custodio.problems.codepro.TwoSum.solution;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoSumTest {

    @Test
    public void when_ThereArePaisForTarget_Then_ReturnTrueForMatchingPairs() {
        //when
        final var hasTwoSum = solution(asList(2, 7, 11, 15), 18);
        //then
        assertTrue(hasTwoSum);
    }

    @Test
    public void when_ThereAreNotPaisForTarget_Then_ReturnFalseForMatchingPairs() {
        //when
        final var hasTwoSum = solution(asList(2, 7, 11, 15), 19);
        //then
        assertFalse(hasTwoSum);
    }

    @Test
    public void when_ThereIsOneNumberForTarget_Then_ReturnFalseForMatchingPairs() {
        //when
        final var hasTwoSum = solution(asList(2, 7, 11, 19), 19);
        //then
        assertFalse(hasTwoSum);
    }
}
